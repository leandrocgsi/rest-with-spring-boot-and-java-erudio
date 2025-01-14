package br.com.erudio.integrationtests.testcontainers;

import java.util.Map;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.lifecycle.Startables;

@ContextConfiguration(initializers = AbstractIntegrationTest.Initializer.class)
public class AbstractIntegrationTest {

	static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
		
		static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:14.2");
		
		private static void startContainers() {
			Startables.deepStart(Stream.of(postgres)).join();
		}

		private static Map<String, String> createConnectionConfiguration() {
			return Map.of(
				"spring.datasource.url", postgres.getJdbcUrl(),
				"spring.datasource.username", postgres.getUsername(),
				"spring.datasource.password", postgres.getPassword()
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
