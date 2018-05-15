package com.google.gwt.sample.itProjekt.shared.bo;

import java.io.Serializable;

/**
 * Basisklasse für alles.
 * @author jnnll
 *
 */

public abstract class BusinessObject implements Serializable {
	
	/**
	 * ID jedes Objekts aus der DB.
	 */
	
	private int id;
	
	/**
	 * setter für id.
	 */
	
	public void setId (int new_id) {
		this.id = new_id;
	}
	
	public int getId() {
		return this.id;
	}
}
