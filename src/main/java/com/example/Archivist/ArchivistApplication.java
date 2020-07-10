package com.example.Archivist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class ArchivistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchivistApplication.class, args);

		//TODO раскоментировать когда доделаю SOAP
//		UserClient userClient = applicationContext.getBean(UserClient.class);
//		GetUserResponse response = userClient.getUser("28752377117");
//
//		log.info(response.getLogin().getFirstname() + " "
//				+ response.getLogin().getMiddlename() + " "
//				+ response.getLogin().getLastname());
	}

}
