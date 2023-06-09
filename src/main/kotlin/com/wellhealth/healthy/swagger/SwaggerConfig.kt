package com.wellhealth.healthy.swagger

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@Configuration
class SwaggerConfig {
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.wellhealth.healthy"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo())
    }
    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("Well Health Microservices")
            .description("WellHealth Microservices- Data required by WellHealth App")
            .version("1.0")
            .build()
    }

}