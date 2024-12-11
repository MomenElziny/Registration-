package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.models.Registration;
import com.example.demo.payload.RegistrationDTO;

public interface RegistrationService {
    Registration insertRegistration(RegistrationDTO registrationDTO) throws IOException;
    public List<Registration> getAllRegistrations();
    Registration getRegistrationById(Long id);

    Registration updateRegistration(Registration existingRegistration, RegistrationDTO updatedData) throws IOException;
    Page<Registration> getAllRegistrationsWithPagination(int page);

    void deleteRegistration(Long id);

}
