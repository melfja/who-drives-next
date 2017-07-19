//#***************************************************************************
//# Source File: HelloWorldController.java
//# Copyright (c) 1996-2017
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.whodrivesnext.entity.CountRepository;
import de.whodrivesnext.entity.Counter;


/********************************************************************
 * `Klassenbeschreibung`
 *
 * @author `Autor`
 */
@RestController
public class HelloWorldController
{
	//~ Instance fields --------------------------------------------------------------------------------------------------------

	@Autowired
	private CountRepository countRepository;

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

	/***************************************
	 * DOCME
	 *
	 * @param  key DOCME
	 *
	 * @return DOCME
	 */
	@RequestMapping(value = "/helloDatabase", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Counter> helloDatabase(@RequestParam(value = "key") String key)
	{
		try
		{
			Counter counter = countRepository.findByKey(key);

			if (counter == null)
			{
				counter = new Counter();
				counter.setKey(key);
			}

			counter.setCount(counter.getCount() + 1);
			countRepository.save(counter);

			return new ResponseEntity<>(counter, HttpStatus.OK);
		}
		catch (Exception eE)
		{
			eE.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
