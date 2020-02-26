package com.springframework.free.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Event event = new Event();
		EventValidator eventValidator = new EventValidator();
		Errors errors = new BeanPropertyBindingResult(event, "event");

		eventValidator.validate(event, errors);

		System.out.println(errors.hasErrors());
		errors.getAllErrors().forEach(error -> {
			System.out.println("====== error code ====");
			Arrays.stream(error.getCodes()).forEach(System.out::println);
			System.out.println(error.getDefaultMessage());
		});
	}

}
