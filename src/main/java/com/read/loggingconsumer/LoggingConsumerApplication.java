package com.read.loggingconsumer;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.read.dto.Person;


@SpringBootApplication
//@EnableBinding(Sink.class)
public class LoggingConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingConsumerApplication.class, args);
	}

	/*
	 * @StreamListener(Sink.INPUT) public void handle(List<Person> persons) {
	 * System.out.println("Received: " + persons); }
	 */

}