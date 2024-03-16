package com.hdjunction.hospital.domain.repository;

import com.hdjunction.hospital.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
