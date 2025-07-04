package com.example.colors.PrintConfig;

import com.example.colors.Services.ColorPrinter;
import com.example.colors.Services.Impl.ColorPrinterImpl;
import com.example.colors.Services.Impl.EnglishRedPrinter;
import com.example.colors.Services.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter){
        return new ColorPrinterImpl();
    }
}
