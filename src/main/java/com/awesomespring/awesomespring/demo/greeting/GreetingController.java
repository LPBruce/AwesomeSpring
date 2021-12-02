package com.awesomespring.awesomespring.demo.greeting;

import java.util.concurrent.atomic.AtomicLong;

import com.awesomespring.awesomespring.demo.greeting.vo.GreetingRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@PostMapping(path = "/greeting", consumes = "application/json", produces = "application/json")
	public Greeting greeting(@RequestBody GreetingRequest greetingRequest) {
		return new Greeting(counter.incrementAndGet(), String.format(template, greetingRequest.getName()));
	}
}
