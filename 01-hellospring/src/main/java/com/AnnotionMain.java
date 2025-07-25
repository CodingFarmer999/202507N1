package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.component.Kia;
import com.config.AnnotationConfig;

public class AnnotionMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		 for (String name : ctx.getBeanDefinitionNames()) {
			 System.out.println(name);
		 }
		 
		 Kia kia = ctx.getBean(Kia.class);
		 System.out.println(kia);
		 
		 Kia kia2 = ctx.getBean(Kia.class);
		 System.out.println(kia2);
	}

}
