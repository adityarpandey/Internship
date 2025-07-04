package com.example.postDatabase;

import lombok.extern.java.Log;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@SpringBootApplication
@Log
public class PostDatabaseApplication implements CommandLineRunner {

	private final DataSource dataSource ;

	public PostDatabaseApplication(final DataSource dataSource){
		this.dataSource = dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(PostDatabaseApplication.class, args);
	}


	@Override
	public void run(String... args)  {
		log.info("Datasource" + dataSource.toString());
		JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("SELECT 1");
	}

}