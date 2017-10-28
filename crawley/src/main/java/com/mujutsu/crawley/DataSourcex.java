package com.mujutsu.crawley;
	
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

	@Configuration
	@Component
	public class DataSourcex      {

		@ConfigurationProperties(prefix = "spring.datasource")
		@Bean
		@Primary
		public DataSource dataSource() {
		    return DataSourceBuilder
		        .create()
		        .build();
		}

}
