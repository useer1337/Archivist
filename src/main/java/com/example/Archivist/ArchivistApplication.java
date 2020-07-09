package com.example.Archivist;

import com.example.Archivist.wsdlclasess.GetUserResponseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class ArchivistApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ArchivistApplication.class, args);

		UserClient userClient = applicationContext.getBean(UserClient.class);
		GetUserResponseType response = userClient.getUser("28752377117");

		log.info(response.getLogin().getFirstname() + " "
				+ response.getLogin().getMiddlename() + " "
				+ response.getLogin().getLastname());
	}

}
