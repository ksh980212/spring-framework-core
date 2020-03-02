package com.springframework.free.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

//	@Around("execution(* com.springframework.free.*.EventService.*(..))")
	/** deleteEvent에는 적용하지 않으려고 함*/
	@Around("@annotation(PerLogging)")
	public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		System.out.println(System.currentTimeMillis() - begin);
		return retVal;
	}

	@Before("bean(simpleEventService)")
	public void hello() {
		System.out.println("hello");
	}

}
