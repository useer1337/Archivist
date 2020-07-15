package com.example.Archivist.soap;

import com.example.Archivist.config.ApplicationConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserConfig {
    private final ApplicationConfiguration applicationConfiguration;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ru.hostco.reguser.types");
        return marshaller;
    }

    @Bean
    public UserClient soapConnector(Jaxb2Marshaller marshaller) {
        UserClient client = new UserClient();
        client.setDefaultUri(applicationConfiguration.getSoapUrl());
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}