package com.hdjunction.hospital.domain.repository;

import com.hdjunction.hospital.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

  @Query("SELECT p FROM Patient p JOIN FETCH p.hospital h WHERE p.registrationNumber = :registrationNumber AND h.id = :hospitalId")
  Optional<Patient> findByRegistrationNumberAndHospital(@Param("registrationNumber") String registrationNumber, @Param("hospitalId") long hospitalId);
}
