package br.com.erudio.integrationtests.controllers.withxml;

import br.com.erudio.config.TestConfigs;
import br.com.erudio.integrationtests.dto.AccountCredentialsDTO;
import br.com.erudio.integrationtests.dto.PersonDTO;
import br.com.erudio.integrationtests.dto.TokenDTO;
import br.com.erudio.integrationtests.testcontainers.AbstractIntegrationTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AuthControllerXmlTest extends AbstractIntegrationTest {

    private static TokenDTO tokenDto;
    private static XmlMapper objectMapper;

    @BeforeAll
    static void setUp() {
        objectMapper = new XmlMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        tokenDto = new TokenDTO();
    }

    @Test
    @Order(1)
    void signin() throws JsonProcessingException {
        AccountCredentialsDTO credentials =
            new AccountCredentialsDTO("leandro", "admin123");

        var content = given()
                .basePath("/auth/signin")
                    .port(TestConfigs.SERVER_PORT)
                    .contentType(MediaType.APPLICATION_XML_VALUE)
                    .accept(MediaType.APPLICATION_XML_VALUE)
                .body(credentials)
                    .when()
                .post()
                    .then()
                    .statusCode(200)
                        .extract()
                        .body()
                .asString();

        tokenDto = objectMapper.readValue(content, TokenDTO.class);

        assertNotNull(tokenDto.getAccessToken());
        assertNotNull(tokenDto.getRefreshToken());
    }

    @Test
    @Order(2)
    void refreshToken() throws JsonProcessingException {
        var content = given()
                .basePath("/auth/refresh")
                .port(TestConfigs.SERVER_PORT)
                .contentType(MediaType.APPLICATION_XML_VALUE)
                .accept(MediaType.APPLICATION_XML_VALUE)
                    .pathParam("username", tokenDto.getUsername())
                    .header(TestConfigs.HEADER_PARAM_AUTHORIZATION, "Bearer " + tokenDto.getRefreshToken())
                .when()
                    .put("{username}")
                        .then()
                        .statusCode(200)
                            .extract()
                            .body()
                .asString();

        tokenDto = objectMapper.readValue(content, TokenDTO.class);

        assertNotNull(tokenDto.getAccessToken());
        assertNotNull(tokenDto.getRefreshToken());
    }
}