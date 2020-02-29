package com.springframework.free.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Value("#{1 + 1}")
	private int value;

	@Value("#{'hello ' + 'world'}")
	private String greeting;

	@Value("#{1 eq 1}")
	private boolean trueOfFalse;

	@Value("hello")
	private String hello;

	@Value("${my.value}") //Property 참조
	private int propertyValue;

	@Value("#{${my.value} eq 100}") // 표현식 안에서 Property 참조
	private boolean isMyValue100;

	@Value("#{sample.data}") //Bean 참조
	private int sampleData;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("========================");
		System.out.println(value);
		System.out.println(greeting);
		System.out.println(trueOfFalse);
		System.out.println(hello);
		System.out.println(propertyValue);
		System.out.println(isMyValue100);
		System.out.println(sampleData);

		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("2 + 100");
		Integer value = expression.getValue(Integer.class);
		System.out.println(value);
	}

}
