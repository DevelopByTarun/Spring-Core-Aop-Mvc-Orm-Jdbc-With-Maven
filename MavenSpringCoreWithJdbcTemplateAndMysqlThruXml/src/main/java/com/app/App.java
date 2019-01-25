package com.app;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.bean.Soldier;
import com.app.dao.SoldierDao;

public class App 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
		SoldierDao soldier = (SoldierDao)context.getBean("soldierDao");
		List<Soldier> list = soldier.getSoldier();
		for(Soldier s : list){
			System.out.println(s.getName() +"  "+ s.getAge());
		}
	}
}
