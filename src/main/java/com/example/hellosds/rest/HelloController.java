package com.example.hellosds.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
   @Value("${message}")
   String message;
   
   @GetMapping(value = "demo")
   public ResponseEntity<String> displayHelloMessage() {
      return ResponseEntity.ok(message);
   }
   
   @GetMapping("hello")
	public String hello() {
		StringBuilder message = new StringBuilder("Hello Google App Engine!");
		try {
			InetAddress ip = InetAddress.getLocalHost();
			message.append(" From host: " + ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return message.toString();
	}
}