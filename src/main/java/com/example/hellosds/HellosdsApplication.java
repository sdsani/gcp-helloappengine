package com.example.hellosds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;

@SpringBootApplication
public class HellosdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellosdsApplication.class, args);
	}

}
