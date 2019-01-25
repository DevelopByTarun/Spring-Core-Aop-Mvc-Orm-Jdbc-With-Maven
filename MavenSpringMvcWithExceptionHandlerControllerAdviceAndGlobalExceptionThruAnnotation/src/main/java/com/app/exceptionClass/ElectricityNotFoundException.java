package com.app.exceptionClass;

public class ElectricityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public ElectricityNotFoundException(String villageName) {
		super(villageName+":Electricity not available");
	}
}
