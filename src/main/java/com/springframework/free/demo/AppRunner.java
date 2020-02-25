package com.springframework.free.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

	private final MessageSource messageSource;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		while (true) {
			System.out.println(messageSource.getMessage("greeting", new String[]{"keesun"}, Locale.getDefault()));
			System.out.println(messageSource.getMessage("greeting", new String[]{"keesun"}, Locale.KOREA));
		}

//		System.out.println(messageSource.getClass());
//		System.out.println(messageSource.getMessage("greeting", new String[]{"keesun"}, Locale.getDefault()));
//		System.out.println(messageSource.getMessage("greeting", new String[]{"keesun"}, Locale.KOREA));
	}

}
