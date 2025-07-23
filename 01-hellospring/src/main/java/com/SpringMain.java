package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Toyota;

public class SpringMain {

	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		 
		 Toyota toyota = (Toyota)ctx.getBean("toyota1");
		 toyota.move();

	}

}
