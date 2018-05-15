package com.google.gwt.sample.itProjekt.shared.bo;

import java.io.Serializable;

/**
 * Basisklasse f�r alles.
 * @author jnnll
 *
 */

public abstract class BusinessObject implements Serializable {
	
	/**
	 * ID jedes Objekts aus der DB.
	 */
	
	private int id;
	
	/**
	 * setter f�r id.
	 */
	
	public void setId (int new_id) {
		this.id = new_id;
	}
	
	public int getId() {
		return this.id;
	}
}
