package com.springframework.free.demo;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		Event event = (Event) getValue();
		return event.getId().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new Event(Integer.parseInt(text)));
	}

	/**
	 *  PropertyEditor
	 *  서로 다른 쓰레드에 공유가 됨
	 *  Stateful (상태정보를 저장하고 있다) => Thread Safe X
	 *  EventEditor의 구현체들을 여러 쓰레드에 공유해서 사용하면 X => 빈으로 등록해서 공유하면 안됨!
	 *  cf) 쓰레드 Scope의 빈으로 등록해서 사용하는 것은 그나마 괜찮.
	 */
}
