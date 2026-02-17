package com.example.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myCustomConfig(){
        return new OpenAPI()
                .info(
                        new Info().title("Hospital System API's")
                                .description("By Chetan Bachchhav ❤️")
                )
                .servers(
                        new ArrayList<>(Arrays.asList(
                                new Server().url("http://localhost:8081").description("local"),
                                new Server().url("http://localhost:8082").description("production")
                                ))
                ).tags(
                        new ArrayList<>(Arrays.asList(
                                new Tag().name("Patient").description("Patient related APIs - CREATE, READ, UPDATE & DELETE"),
                                new Tag().name("Doctor").description("Doctor related APIs - CREATE, READ, UPDATE & DELETE"),
                                new Tag().name("Bill").description("Bill related APIs - CREATE, READ, UPDATE & DELETE"),
                                new Tag().name("Appointment").description("Appointment related APIs - CREATE, READ, UPDATE & DELETE"),
                                new Tag().name("HOME")
                        ))
                );
    }
}
