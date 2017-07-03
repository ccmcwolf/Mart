package com.zambrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


@SpringBootApplication
public class ZambroneApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZambroneApplication.class, args);
	}


}

