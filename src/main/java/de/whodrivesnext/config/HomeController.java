//#***************************************************************************
//# Source File: HomeController.java
//# Copyright (c) 1996-2017
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.config;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/********************************************************************
 * Home redirection to swagger api documentation.
 */
@Controller
public class HomeController
{
	//~ Methods ----------------------------------------------------------------------------------------------------------------

	/***************************************
	 * Weiterleitung von "/" auf "/swagger-ui.html".
	 *
	 * @return String zur Weiterleitung auf "/swagger-ui.html"
	 */
	@RequestMapping(value = "/")
	public String index()
	{
		return "redirect:swagger-ui.html";
	}
}
