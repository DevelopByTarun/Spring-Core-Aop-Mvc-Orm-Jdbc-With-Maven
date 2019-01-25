package com.app.utility;

import org.springframework.stereotype.Component;

@Component
public class BookUtility {
	
	public int calculateArea(int length, int width) {
		return length * width;
	}
}
