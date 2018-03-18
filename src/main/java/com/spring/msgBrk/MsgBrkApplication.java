package com.spring.msgBrk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MsgBrkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgBrkApplication.class, args);
	}
	

}
