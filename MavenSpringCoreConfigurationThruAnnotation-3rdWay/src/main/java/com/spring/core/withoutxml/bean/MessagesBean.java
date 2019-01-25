package com.spring.core.withoutxml.bean;

import org.springframework.stereotype.Component;

@Component(value = "messagesBean")
public class MessagesBean {
	
	public void summaryMessage() {
		System.out.println("This Programe Is Related To Configuration Without Xml With The Uses Of Annotation Like");
		System.out.println("@Component, @Autowired, @Configuration And @ComponentScan");
	}
}
