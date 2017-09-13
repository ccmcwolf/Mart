package com.zambrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
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
	@Bean
	public EmbeddedServletContainerCustomizer exceptionHandling() {
		return container -> container.addErrorPages(new ErrorPage("/exception"));
	}

}

