package com.wisnasky.medialibrary;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MediaLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaLibraryApplication.class, args);
	}

	@Bean
	public Docket newApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false)
				.apiInfo(apiInfo())
				.select()
				.apis(apisToDocument())
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("Media Library")
				.build();
	}

	private Predicate<RequestHandler> apisToDocument(){
		return Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"));
	}
}
