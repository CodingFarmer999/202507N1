package com.course.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EcAspect {

	Logger logger = LoggerFactory.getLogger(EcAspect.class);
	
	// execution(scope return-type fully-qualified-class-name .*(parameters))
	@Pointcut("execution(public * com.course.service.ProductService.*(..))")
	public void pointCutMethod() {
	    // 透由@Pointcut定義切點，方法內容維持空方法
	}
	
	@Before("pointCutMethod()")
	public void beforeAdvice(JoinPoint joinPoint) {
		logger.info("@Before: " + joinPoint.getSignature().getName());
	}
}
