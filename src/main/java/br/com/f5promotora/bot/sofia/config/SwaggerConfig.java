package br.com.f5promotora.bot.sofia.config;

import java.time.temporal.Temporal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@Configuration
@EnableSwagger2WebFlux
public class SwaggerConfig {

  @Bean
  public Docket swaggerConfigurationsCustom() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("br.com.f5promotora.bot.sofia.api.controller"))
        .paths(PathSelectors.any()).build().apiInfo(apiInfo())
        .directModelSubstitute(Temporal.class, String.class);
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Chatbot").description("Sofia")
        .license("Apache Licence Version 2.0")
        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0").version("0.0.1").build();
  }

}
