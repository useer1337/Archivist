package com.example.Archivist;


import com.example.Archivist.config.ApplicationConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import ru.hostco.reguser.types.GetUserRequest;
import ru.hostco.reguser.types.GetUserResponse;

import javax.xml.bind.JAXBElement;

@Slf4j
public class UserClient extends WebServiceGatewaySupport {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

//    public GetUserResponse getUser(String snils) {
//        GetUserRequest request = new GetUserRequest();
//        request.setSNILS(snils);
//        request.setToken(applicationConfiguration.getSoapToken());
//
//        JAXBElement<GetUserResponse> response = (JAXBElement<GetUserResponse>) getWebServiceTemplate()
//                .marshalSendAndReceive("https://cas-test.hostco.ru/RegUserService/services/RegUserService",
//                        request);
//
//        log.info(response.getValue().getLogin().getFirstname());
//
//        return response.getValue();
//    }
}
