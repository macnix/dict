package ua.co.styx.dict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCaching
public class DictApplication {

    public static void main(String[] args) {
        SpringApplication.run (DictApplication.class, args);
    }
    public class SwaggerConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("ua.co.styx.dict.controllers"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(metaData());
        }
        private ApiInfo metaData() {
            ApiInfo apiInfo = new ApiInfo(
                    "Dict API",
                    "Dictionaries",
                    "1.0",
                    "Terms of service",
                    new Contact ("Oleg Dubetsky", "https://www.facebook.com/oleg.dubetsky.7", "Oleh.Dubetskyi@oranta.ua"),
                    "Apache License Version 2.0",
                    "https://www.apache.org/licenses/LICENSE-2.0");
            return apiInfo;
        }

    }
}

