package com.springframework.free.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

	private final ResourceLoader resourceLoader;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Resource resource = resourceLoader.getResource("classpath:empty.txt");
		System.out.println(resource.exists()); //false

		Resource resource1 = resourceLoader.getResource("classpath:test.txt");
		System.out.println(resource1.exists()); //true
		System.out.println(resource1.getDescription()); //class path resource [test.txt]
		System.out.println(resource1.getFile()); // absoulte path
		System.out.println(resource1.getFilename()); // test.txt
		System.out.println(resource1.getURI()); // file  :/ absoulte path
		System.out.println(resource1.getURL()); //  file : /absoulte path
	}

}
