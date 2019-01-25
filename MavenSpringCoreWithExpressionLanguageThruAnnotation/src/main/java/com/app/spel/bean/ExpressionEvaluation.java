package com.app.spel.bean;

import java.util.List;
import java.util.Map;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ExpressionEvaluation {
	public static void run() {
		ExpressionParser parser = new SpelExpressionParser();

		Expression exp = parser.parseExpression("'Java Spring Core'");
		String message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Java Spring Core'.concat('.com')");
		message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Java Spring Core'.bytes");
		byte[] bytes = (byte[]) exp.getValue();
		System.out.println(bytes.length);

		exp = parser.parseExpression("'Java Spring Core'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);

		// constructor
		exp = parser.parseExpression("new String('Java Spring Core')");
		message = exp.getValue(String.class);
		System.out.println(message);

		Customer myCustomer = parser
				.parseExpression("new com.app.spel.bean.Customer('Jack', 'Smith', 26)")
				.getValue(Customer.class);
		System.out.println(myCustomer);

		Customer customer = new Customer("Adam", "Johnson");

		exp = parser.parseExpression("firstName");
		EvaluationContext eContext = new StandardEvaluationContext(customer);
		String firstName = (String) exp.getValue(eContext);
		System.out.println(firstName); // Adam

		// without Context
		exp = parser.parseExpression("lastName");
		String lastName = (String) exp.getValue(customer);
		System.out.println(lastName); // Johnson

		exp = parser.parseExpression("firstName == 'Adam'");
		boolean result = (Boolean) exp.getValue(eContext);
		System.out.println(result);
		
		// set Value
		parser.parseExpression("age").setValue(eContext, 42);
		System.out.println(customer);
		
		// assignment
		parser.parseExpression("age = 43").getValue(eContext, Integer.class);
		System.out.println(customer);

		// array construction
		int[] arr1 = (int[]) parser.parseExpression("new int[4]").getValue();
		System.out.println(arr1.length);

		// with initializer
		int[] arr2 = (int[]) parser.parseExpression("new int[]{1,2,3}").getValue();
		System.out.println(arr2.length);

		// inline list
		List<?> numbers = (List<?>) parser.parseExpression("{1,2,3}").getValue();
		System.out.println(numbers);

		// inline Map
		Map<?, ?> customerInfo = (Map<?, ?>) parser.parseExpression(
				"{name:'Adam Johnson', age:'42'}")
				.getValue();
		System.out.println(customerInfo);

		Map<?, ?> mapOfMaps = (Map<?, ?>) parser.parseExpression(
				"{name:{first:'Adam',last:'Johnson'}, birthday:{day:19, month:'Aug', year:1974}}")
				.getValue();
		System.out.println(mapOfMaps);
		
		// invoke method
		String subString = parser.parseExpression(
				"'Java Spring Core'.substring(0, 4).toUpperCase()")
				.getValue(String.class);
		System.out.println(subString);
	}
}
