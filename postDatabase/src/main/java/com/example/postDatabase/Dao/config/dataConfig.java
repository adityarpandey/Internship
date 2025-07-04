package com.example.postDatabase.Dao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class dataConfig {

    @Bean
    public JdbcTemplate jdbcTemplate(final DataSource dataSource){
        return jdbcTemplate(dataSource);
    }
}
