package com.app.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = "com.app")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
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
	
	@Bean
	public SimpleMappingExceptionResolver createSimpleMappingExceptionResolver() {
	  SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
      Properties errorMaps = new Properties();
      errorMaps.setProperty("ElectricityNotFoundException", "error");
      errorMaps.setProperty("NullPointerException", "error");
      resolver.setExceptionMappings(errorMaps);
      resolver.setDefaultErrorView("globalerror");
      resolver.setExceptionAttribute("exc");
      return resolver;
   }
}
