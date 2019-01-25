package com.spring.core.withoutxml.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "calculatorBean")
public class CalculatorBean implements ICalculator {
	
	@Autowired
	private MessagesBean messageBean;
	
	public MessagesBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessagesBean messageBean) {
		this.messageBean = messageBean;
	}

	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	public int subtract(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}

	public int square(int x) {
		// TODO Auto-generated method stub
		return x * x;
	}

	public int cube(int x) {
		// TODO Auto-generated method stub
		return x * x * x;
	}

	public void summary() {
		// TODO Auto-generated method stub
		this.messageBean.summaryMessage();
	}
}
