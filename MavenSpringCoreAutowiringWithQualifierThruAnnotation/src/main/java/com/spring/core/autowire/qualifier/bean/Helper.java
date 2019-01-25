package com.spring.core.autowire.qualifier.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Helper {
	
	@Autowired
	@Qualifier(value = "producer")
	private Main imain;
	
	public Main getImain() {
		return imain;
	}

	public void setImain(Main imain) {
		this.imain = imain;
	}
}
