package com.spring.core.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof StudentBean) {       
			System.out.println("PostProcessBeforeInitialization Method Of "+beanName+" Is Called");
		}
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof StudentBean) {
			System.out.println("PostProcessAfterInitialization Method Of "+beanName+" Is Called");
		}
		return bean;
	}
}
