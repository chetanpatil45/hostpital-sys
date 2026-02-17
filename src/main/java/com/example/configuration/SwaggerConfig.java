package com.example.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
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
                                new Server().url("localhost:8081").description("local"),
                                new Server().url("localhost:8082").description("production")
                                ))
                );
    }
}
