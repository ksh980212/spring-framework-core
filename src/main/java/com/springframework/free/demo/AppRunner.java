package com.springframework.free.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

	private final EventService eventService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		eventService.createEvent(null);
	}

}
