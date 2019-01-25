package com.app.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = "com.app")
@EnableWebMvc
@PropertySource("classpath:mysqlDriver.properties")
public class StudentDAOConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private Environment environment;
	
	@Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	@Bean(name = "datasource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("mysql.driverClassName"));
		dataSource.setUrl(environment.getProperty("mysql.url"));
		dataSource.setUsername(environment.getProperty("mysql.username"));
		dataSource.setPassword(environment.getProperty("mysql.password"));
		return dataSource;
	}
	
	@Bean(name = "studentDAOImple")
	public StudentDAOImple getStudentDAOImple() {
		return new StudentDAOImple(getDataSource());
	}
}
