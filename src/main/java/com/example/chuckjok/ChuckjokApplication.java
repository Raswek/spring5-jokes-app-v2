package com.example.chuckjok;

import com.example.chuckjok.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class ChuckjokApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ChuckjokApplication.class, args);
//		JokServiceImpl bean = run.getBean(JokServiceImpl.class);
//
//		System.out.println(bean.getJok());
	}

}
