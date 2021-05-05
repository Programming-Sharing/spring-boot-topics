package com.programmingsharing.springboottopics.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConf {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30).apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title("Programming Sharing - Swagger Demo")
                .description("This RESTful API created to demonstrate how to document RESTful API following Swagger Specification")
                .contact(new Contact("Programming Sharing", "https://programmingsharing.com", "programmingsharingblog@gmail.com"))
                // and more
                .build();
    }
}
