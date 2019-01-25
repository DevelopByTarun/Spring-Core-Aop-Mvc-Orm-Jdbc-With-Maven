package com.app.spel.config;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.app.spel.bean.Show;

@Configuration
@ComponentScan("com.app.spel.bean")
public class AppConfig {

	// mathematical operator
	@Value("#{42 % 10}")
	private int modulo; // 2

	@Value("#{2 ^ 8}")
	private double power; // 256.0

	// logical operator
	@Value("#{!true}")
	private boolean not; // false

	// logical and relational operator
	@Value("#{123 > 100 && 100 <= 111}")
	private boolean and; // true

	// ternary operator
	@Value("#{ (50^2/40) > 50? 'right' : 'wrong' }")
	private String ternary; // right

	// regular expression
	@Value("#{'Java Spring Core' matches '[a-zA-Z\\s]+' }")
	private boolean regex; // true

	// regular expression
	@Value("#{'Java Spring Core 2015' matches '[a-zA-Z\\s]+' }")
	private boolean invalidRegex; // false

	// list
	@Value("#{customersInfo.customers[0]}")
	private String list;

	// map
	@Value("#{customersInfo.remainYearTimes['Adam']}")
	private String map;

	// collection
	@Value("#{customersInfo.remainYearTimes}")
	private Map<String, Integer> remainYearTimes;

	// collection selection
	@Value("#{customersInfo.remainYearTimes.?[value > 2]}")
	private Map<String, Integer> mapSelection;

	// collection projection
	@SuppressWarnings("rawtypes")
	@Value("#{customersInfo.remainYearTimes.![value > 2]}")
	private List mapProjection;

	@Value("#{0xFFFF}")
	private int a;

	@Value("#{null}")
	private Object object;

	// type
	@SuppressWarnings("rawtypes")
	@Value("#{T(Integer)}")
	private Class type;
	
	@Value("#{'xyz' instanceof T(Integer)}")
	private boolean b;

	@Bean
	public Show getShow() {
		Show show = new Show();

		show.setMessage("=== Annotation based configuration ===");
		show.addMessage("modulo: " + modulo);
		show.addMessage("and: " + and);
		show.addMessage("not: " + not);
		show.addMessage("ternary: " + ternary);
		show.addMessage("regex: " + regex);
		show.addMessage("invalidRegex: " + invalidRegex);
		show.addMessage("list: " + list);
		show.addMessage("map: " + map);
		show.addMessage("remainYearTimes" + remainYearTimes);
		show.addMessage("mapSelection" + mapSelection);
		show.addMessage("mapProjection" + mapProjection);
		show.addMessage("type" + type);
		show.addMessage("a: " + a);
		show.addMessage("object: " + object);

		return show;
	}
}
