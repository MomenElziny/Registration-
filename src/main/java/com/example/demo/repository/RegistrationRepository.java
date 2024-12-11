package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long>{
    @SuppressWarnings("null")
    @Override
    Page<Registration> findAll(Pageable pageable);
}
    

  

