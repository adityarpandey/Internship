package com.example.colors;

import com.example.colors.Services.ColorPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
@Log
@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {
	private final ColorPrinter colorPrinter;
	public static void main(String[] args) {
		SpringApplication.run(ColorsApplication.class, args);
	}

	public ColorsApplication(ColorPrinter colorPrinter){
		this.colorPrinter = colorPrinter;
	}

	@Override
	public void run(String... args)  {

		log.info(colorPrinter.print());
	}
}
