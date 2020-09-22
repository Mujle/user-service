package com.example.userservice.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket swaggerConfiguration() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/users/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example.userservice.controller"))
                .build()
                .apiInfo(apiDetails());

    }

    private ApiInfo apiDetails() {
        return new ApiInfoBuilder()
                .title("user-service API")
                .description("user-service rest calls")
                .version("1.0")
                .build();
    }
}
