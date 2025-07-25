package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.CarConfig;

public class JavaMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);

		 for (String name : ctx.getBeanDefinitionNames()) {
			 System.out.println(name);
		 }
	}

}
