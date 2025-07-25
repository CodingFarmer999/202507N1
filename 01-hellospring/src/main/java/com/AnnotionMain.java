package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AnnotationConfig;

public class AnnotionMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		 for (String name : ctx.getBeanDefinitionNames()) {
			 System.out.println(name);
		 }
	}

}
