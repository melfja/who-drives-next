//#***************************************************************************
//# Source File: Counter.java
//# Copyright (c) 1996-2017
//# All rights reserved.
//#***************************************************************************
package de.whodrivesnext.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/********************************************************************
 * Created by frasch on 30.06.2017.
 */
@Entity
public class Counter
{
	//~ Instance fields --------------------------------------------------------------------------------------------------------

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	private String key;

	private Integer count = 0;

	//~ Constructors -----------------------------------------------------------------------------------------------------------

	/***************************************
	 * Creates a new Counter object.
	 */
	public Counter()
	{
	}

	/***************************************
	 * Creates a new Counter object.
	 *
	 * @param id    DOCME
	 * @param key   DOCME
	 * @param count DOCME
	 */
	public Counter(Long id, String key, Integer count)
	{
		this.id = id;
		this.key = key;
		this.count = count;
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

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public Integer getCount()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		this.count = count;
	}

	@Override
	public String toString()
	{
		return "Counter{" +
			"id=" + id +
			", key='" + key + '\'' +
			", count=" + count + '}';
	}
}
