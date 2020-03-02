package com.springframework.free.demo;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@NonNull
	public String createEvent(@NonNull String name) {
		return "hello " + name;
	}

}
