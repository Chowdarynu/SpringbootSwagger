package com.chow.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.chow.demo")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("greetings")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/greeting.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("<a class="vglnk" href="http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open" rel="nofollow"><span>http</span><span>://</span><span>www</span><span>-</span><span>03</span><span>.</span><span>ibm</span><span>.</span><span>com</span><span>/</span><span>software</span><span>/</span><span>sla</span><span>/</span><span>sladb</span><span>.</span><span>nsf</span><span>/</span><span>sla</span><span>/</span><span>bm</span><span>?</span><span>Open</span></a>")
				.contact("Niklas Heidloff")
                .license("Apache License Version 2.0")
                .licenseUrl("<a class="vglnk" href="https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE" rel="nofollow"><span>https</span><span>://</span><span>github</span><span>.</span><span>com</span><span>/</span><span>IBM</span><span>-</span><span>Bluemix</span><span>/</span><span>news</span><span>-</span><span>aggregator</span><span>/</span><span>blob</span><span>/</span><span>master</span><span>/</span><span>LICENSE</span></a>")
				.version("2.0")
                .build();
    }
}