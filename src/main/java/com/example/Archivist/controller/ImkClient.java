package com.example.Archivist.controller;

import com.example.Archivist.config.ApplicationConfiguration;
import com.example.Archivist.dto.PatientList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "imk-client", url = "${app.url}", configuration = ApplicationConfiguration.class)
public interface ImkClient {
    @RequestMapping( method = RequestMethod.GET, value = "iemk?patientSnils={snils}&patientLastName={lastName}",
            produces = "application/json")
    PatientList getPatient(@PathVariable("snils") String snils, @PathVariable("lastName") String lastName);

}
