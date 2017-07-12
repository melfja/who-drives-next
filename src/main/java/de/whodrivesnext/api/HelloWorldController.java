package de.whodrivesnext.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/********************************************************************
 * `Klassenbeschreibung`
 *
 * @author `Autor`
 */
@RestController
public class HelloWorldController
{
	//~ Methods ----------------------------------------------------------------------------------------------------------------

	/***************************************
	 * DOCME
	 *
	 * @return DOCME
	 */
	@RequestMapping(value = "/helloWorld", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> helloWorld()
	{
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
	}
}
