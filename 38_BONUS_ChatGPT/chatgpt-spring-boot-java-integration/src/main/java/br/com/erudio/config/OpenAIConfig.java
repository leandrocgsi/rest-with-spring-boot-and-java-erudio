package br.com.erudio.config;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenAIConfig {
    
    private Logger logger = Logger.getLogger
            (OpenAIConfig.class.getName()); 
    
    @Value("${openai.api.key}")
    String openApiKey;
    
    @Bean
    RestTemplate template() {
        logger.info("Initializing RestTemplate");
        
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((request, body, execution) -> {
            request.getHeaders().add("Authorization", "Bearer " + openApiKey);
            return execution.execute(request, body);
        });
        return restTemplate;
    }

}
