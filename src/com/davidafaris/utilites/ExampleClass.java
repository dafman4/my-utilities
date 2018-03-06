/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.davidafaris.utilites;

import com.davidafaris.utilities.interfaces.ConfigInformationStrategy;
import com.davidafaris.utilities.interfaces.DynamicClassFields;
/**
 * This is an example of how to use the dynamic class fields interface, and used as the example class for using the factory linked with a properties file.
 * @author David
 */
public final class ExampleClass implements DynamicClassFields {
	private String thisIsAField;
	private ExampleClass(){
		
	}
	
	public ExampleClass(String field){
		setThisIsAField(field);
	}
	public String getThisIsAField() {
		return thisIsAField;
	}

	public void setThisIsAField(String thisIsAField) {
		this.thisIsAField = thisIsAField;
	}
	
	@Override
	public void updateDynamicFields(ConfigInformationStrategy config) {
		String newString = config.getProperty("ExampleField");
		if(newString!=null)
			thisIsAField=newString;
	}

}
