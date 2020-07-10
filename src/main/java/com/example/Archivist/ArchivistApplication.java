package com.example.Archivist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.hostco.reguser.types.GetUserResponse;

@Slf4j
@SpringBootApplication
public class ArchivistApplication {
	private static ApplicationContext applicationContext;



	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ArchivistApplication.class, args);
		// SpringApplication.run(ArchivistApplication.class, args);

			// todo попозже открыть
//		UserClient userClient = applicationContext.getBean(UserClient.class);
//		GetUserResponse response = userClient.getUser("28752377117");
//
//		log.info(response.getLogin().getFirstname() + " "
//				+ response.getLogin().getMiddlename() + " "
//				+ response.getLogin().getLastname());
	}

}
