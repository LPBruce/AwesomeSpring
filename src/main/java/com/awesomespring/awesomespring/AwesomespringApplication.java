package com.awesomespring.awesomespring;

import com.awesomespring.awesomespring.demo.consumingrest.vo.Quote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwesomespringApplication {

	private static final Logger log = LoggerFactory.getLogger(AwesomespringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AwesomespringApplication.class, args);
	}


	// 构建简单的RESTful Web Service
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}
}
