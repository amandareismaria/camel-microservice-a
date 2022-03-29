package com.in28minutes.microservices.camelmicroservicea.routes.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstTimerRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		//timer
		//transformation
		//log
		//[ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
		
		from("timer:first-timer")  //queue
		.transform().constant("My Constant Message")		
		.transform().constant("Time now is" + LocalDateTime.now())		
		.to("log:first-timer");    //database
	
	}
	

}
