package com.example.Archivist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableFeignClients
@SpringBootApplication
public class ArchivistApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArchivistApplication.class, args);
	}

}
