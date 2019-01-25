package com.producer.code;

public class Producer implements IProducer {
	
	public String callProducer() {
		// TODO Auto-generated method stub
		return "call producer from inside";
	}
	
	public String dontCallProducer() {
		return "dont call producer from outside";
	}
}