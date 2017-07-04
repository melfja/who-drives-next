//#***************************************************************************
//# mobilcom IT Entwicklung Source File: SwaggerConfig.java
//# Copyright (c) 1996-2017 by mobilcom-debitel GmbH
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import de.whodrivesnext.api.HelloWorldController;


/********************************************************************
 * Swagger Configuration Bean.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig
{
	//~ Constructors -----------------------------------------------------------------------------------------------------------

	/***************************************
	 * Creates a new Config object.
	 */
	public SwaggerConfig()
	{
	}

	//~ Methods ----------------------------------------------------------------------------------------------------------------

	/***************************************
	 * To get the swagger api docket.
	 *
	 * @return The swagger api docket
	 */
	@Bean
	public static Docket api()
	{
		// TODO: https://github.com/springfox/springfox/issues/536 => Darum directModelSubstitute; Ausbau
		// wenn behoben
		return new Docket(DocumentationType.SWAGGER_2).select()
													  .apis(RequestHandlerSelectors.basePackage(
										  					HelloWorldController.class.getPackage().getName()))
													  .paths(PathSelectors.any()).build().apiInfo(apiInfo())
													  .protocols(Collections.singleton("http"))
													  .directModelSubstitute(LocalDate.class, java.sql.Date.class)
													  .directModelSubstitute(OffsetDateTime.class, java.util.Date.class)
													  .directModelSubstitute(LocalDateTime.class, java.util.Date.class);
	}

	private static ApiInfo apiInfo()
	{
		return new ApiInfo("Cuba API", "Cuba (cost usage balance) API.", "1.0.0", "", "it.aber.abr.entw@md.de", null, null);
	}
}
