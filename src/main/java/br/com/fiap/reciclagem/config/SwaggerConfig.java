package br.com.fiap.reciclagem.config;

import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Contact;

import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()

                .info(

                        new Info()

                                .title("Reciclagem API")

                                .version("1.0")

                                .description(
                                        "API REST para gerenciamento de pontos de coleta sustentável ESG"
                                )

                                .contact(

                                        new Contact()

                                                .name("Grupo FIAP")

                                                .email("grupo@fiap.com")
                                )
                );
    }
}