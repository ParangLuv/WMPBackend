package com.parangluv.withmypet.common.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private String title = "WithMyPet REST API";
	private String description = "This documents describes about WithMyPet's REST API";
	private String version = "Version 0.01";
	private String termsOfServiceUrl = "http://withMyPet.com";
	private String license = "Licensed to Redesign";
	private String licenseUrl = "http://parangluv.com";
	
	private String name = "redesign";
	private String url = "http://parangluv.com";
	private String email = "redesign628@naver.com";
	
	private Contact contact = new Contact(name, url, email);
	
	@Bean
    public Docket api(){
        ApiInfo apiInfo = new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl);
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build().apiInfo(apiInfo);
    }

}
