//#***************************************************************************
//# Source File: Ride.java
//# Copyright (c) 1996-2017
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.joda.time.DateTime;


/********************************************************************
 * Created by melf on 19.07.2017.
 */
@Entity
public class Ride
{
	//~ Instance fields --------------------------------------------------------------------------------------------------------

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	private Long carpoolId = null;

	private DateTime date = null;

	//private Driver driver = null;
	// private List<Passenger> passengers = new ArrayList<Passenger>();

	//~ Constructors -----------------------------------------------------------------------------------------------------------

	/***************************************
	 * Creates a new Ride object.
	 */
	public Ride()
	{
	}

	/***************************************
	 * Creates a new Counter object.
	 *
	 * @param     DOCME
	 * @param    DOCME
	 * @param  DOCME
	 */
	public Ride(Long id, Long carpoolId, DateTime date /*, Driver driver */)
	{
		this.id = id;
		this.carpoolId = carpoolId;
		this.date = date;
//		this.driver = driver;
	}

	//~ Methods ----------------------------------------------------------------------------------------------------------------

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getCarpoolId()
	{
		return carpoolId;
	}

	public void setCarpoolId(Long carpoolId)
	{
		this.carpoolId = carpoolId;
	}

	// public Integer getDriver()
	// {
	// 	return driver;
	// }
	//
	// public void setDriver(Driver driver)
	// {
	// 	this.driver = driver;
	// }

	public DateTime getDate()
	{
		return date;
	}

	public void setDate(DateTime date)
	{
		this.date = date;
	}

	@Override
	public String toString()
	{
		return "Ride{" +
			"id=" + id +
			", carpoolId='" + carpoolId + '\'' +
			", date=" + date +
			// ", driver=" + driver +
			'}';
	}
}
