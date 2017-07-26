//#***************************************************************************
//# Source File: RideRepository.java
//# Copyright (c) 2017
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.entity;

import org.springframework.data.repository.CrudRepository;


/********************************************************************
 * Created by frasch on 30.06.2017.
 */
public interface RideRepository extends CrudRepository<Ride, Long>
{
	//~ Methods ----------------------------------------------------------------------------------------------------------------

	/***************************************
	 * DOCME
	 *
	 * @param  key DOCME
	 *
	 * @return DOCME
	 */
	Ride findByKey(String key);
}
