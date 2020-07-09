package com.example.Archivist;


import com.example.Archivist.config.ApplicationConfiguration;
import com.example.Archivist.wsdlclasess.GetUserRequestType;
import com.example.Archivist.wsdlclasess.GetUserResponseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

@Slf4j
public class UserClient extends WebServiceGatewaySupport {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    public GetUserResponseType getUser(String snils) {
        GetUserRequestType request = new GetUserRequestType();
        request.setSNILS(snils);
        request.setToken(applicationConfiguration.getSoapToken());

        JAXBElement<GetUserResponseType> response = (JAXBElement<GetUserResponseType>) getWebServiceTemplate()
                .marshalSendAndReceive("https://cas-test.hostco.ru/RegUserService/services/RegUserService",
                        request);

        log.info(response.getValue().getLogin().getFirstname());

        return response.getValue();
    }
}
