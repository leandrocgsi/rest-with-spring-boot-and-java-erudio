package br.com.erudio.integrationtests.testcontainers;

import java.util.Map;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.lifecycle.Startables;

@ContextConfiguration(initializers = AbstractIntegrationTest.Initializer.class)
public class AbstractIntegrationTest {

	static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
		
		static MSSQLServerContainer<?> mssql = new MSSQLServerContainer<>("mcr.microsoft.com/mssql/server:2017-latest").acceptLicense();
		
		private static void startContainers() {
			Startables.deepStart(Stream.of(mssql)).join();
		}

		private static Map<String, String> createConnectionConfiguration() {
			return Map.of(
				"spring.datasource.url", mssql.getJdbcUrl() + ";encrypt=true;trustServerCertificate=true;",
				"spring.datasource.username", mssql.getUsername(),
				"spring.datasource.password", mssql.getPassword()
			);
		}
		
		@SuppressWarnings({"unchecked", "rawtypes"})
		@Override
		public void initialize(ConfigurableApplicationContext applicationContext) {
			startContainers();
			ConfigurableEnvironment environment = applicationContext.getEnvironment();
			MapPropertySource testcontainers = new MapPropertySource(
				"testcontainers",
				(Map) createConnectionConfiguration());
			environment.getPropertySources().addFirst(testcontainers);
		}
	}
}
