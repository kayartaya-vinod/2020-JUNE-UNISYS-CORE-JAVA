package com.unisys.apps;

import com.unisys.service.HelloService;

public class SayHello {

	public void run() {
		HelloService service = new HelloService();
		System.out.println(service.greet());
	}

}
