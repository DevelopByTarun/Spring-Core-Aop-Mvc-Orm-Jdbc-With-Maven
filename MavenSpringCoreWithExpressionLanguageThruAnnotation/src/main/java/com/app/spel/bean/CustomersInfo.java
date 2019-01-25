package com.app.spel.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component("customersInfo")
public class CustomersInfo {
	private List<String> customers = new ArrayList<String>();
	private Map<String, Integer> remainYearTimes = new HashMap<String, Integer>();

	public CustomersInfo() {
		customers.add("Adam Johnson");
		customers.add("Jack Smith");
		customers.add("David Williams");
		customers.add("Kim Smith");
		customers.add("Peter Davis");
		
		remainYearTimes.put("Adam", 1);
		remainYearTimes.put("Jack", 2);
		remainYearTimes.put("David", 3);
		remainYearTimes.put("Kim", 4);
		remainYearTimes.put("Peter", 5);
	}

	public List<String> getCustomers() {
		return customers;
	}

	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}

	public Map<String, Integer> getRemainYearTimes() {
		return remainYearTimes;
	}

	public void setRemainYearTimes(Map<String, Integer> remainYearTimes) {
		this.remainYearTimes = remainYearTimes;
	}

}
