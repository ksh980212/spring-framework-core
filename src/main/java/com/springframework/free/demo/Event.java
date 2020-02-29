package com.springframework.free.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Event {

	private Integer id;

	private String title;

	public Event(Integer id) {
		this.id = id;
	}

}
