//#***************************************************************************
//# mobilcom IT Entwicklung Source File: CountRepository.java
//# Copyright (c) 1996-2017 by mobilcom-debitel GmbH
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.entity;

import org.springframework.data.repository.CrudRepository;


/********************************************************************
 * Created by frasch on 30.06.2017.
 */
public interface CountRepository extends CrudRepository<Counter, Long>
{
	//~ Methods ----------------------------------------------------------------------------------------------------------------

	/***************************************
	 * DOCME
	 *
	 * @param  key DOCME
	 *
	 * @return DOCME
	 */
	Counter findByKey(String key);
}
