package com.huarui;

import com.huarui.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Import(MyConfig.class)
//@ImportResource(value = "classpath:beans.xml")
public class Sb1360102Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb1360102Application.class, args);
	}
}
