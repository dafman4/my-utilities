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

package com.davidafaris.utilities.error;

public class SeriousException extends RuntimeException{
	private final static String ADDON = "\nTHIS IS A SERIOUS EXCEPTION, shutting down";
	
	public SeriousException(String message){
		super(message);
	}
	
	@Override
	public String getMessage(){
		return super.getMessage() + ADDON;
	}
}
