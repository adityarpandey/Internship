package com.example.ManagementProject.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    private ModelMapper modelMapper;
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
