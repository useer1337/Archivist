package com.example.Archivist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class UserConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ru.hostco.reguser");
        return marshaller;
    }

    @Bean
    public UserClient userClient(Jaxb2Marshaller marshaller){
        UserClient userClient = new UserClient();
        userClient.setDefaultUri("https://cas-test.hostco.ru/RegUserService/services/RegUserService");
        userClient.setMarshaller(marshaller);
        userClient.setUnmarshaller(marshaller);
        return userClient;
    }
}