package com.spring.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.test.pojo.People;

public class CustomHandler {
	
	public static void main(String[] args) {
		
        ApplicationContext ctx = new ClassPathXmlApplicationContext("customer.xml");  
		People p = (People)ctx.getBean("cutesource");  
		System.out.println(p.getId());  
		System.out.println(p.getName());  
		System.out.println(p.getAge()); 
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/springmvc.xml");  
//		
//		ApplicationContext ctx2 = new FileSystemXmlApplicationContext("file://d:/spring.xml");
//		
//		GetBeanTest p = (GetBeanTest)ctx.getBean("people");  
//		 p.getBean().showMe();
	}

}
