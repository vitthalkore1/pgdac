package com.vitthal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vitthal.serv.MyService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		MyService m = (MyService)appCntx.getBean(MyService.class);
		m.add();
	}

}

