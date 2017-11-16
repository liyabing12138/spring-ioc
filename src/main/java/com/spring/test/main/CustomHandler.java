package com.spring.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.spring.test.pojo.GetBeanTest;
import com.spring.test.pojo.People;

public class CustomHandler {
	
	public static void main(String[] args) {
		
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("customer.xml");  
		People p1 = (People)ctx1.getBean("cutesource");  
		System.out.println(p1.getId());  
		System.out.println(p1.getName());  
		System.out.println(p1.getAge()); 
		
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("classpath:springmvc.xml");  
//		
//		ApplicationContext ctx2 = new FileSystemXmlApplicationContext("file://d:/spring.xml");
//		
		GetBeanTest p2 = (GetBeanTest)ctx2.getBean("people");  
		 p2.getBean().showMe();
	}

}
