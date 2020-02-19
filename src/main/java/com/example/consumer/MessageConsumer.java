package com.example.consumer;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@EnableJms
@Component
public class MessageConsumer {

	@JmsListener(destination = "my-tpca")
	public void readMessage(String msg) {

		System.out.println("form consumer");
		System.out.println("msg is" + msg);
	}
}
