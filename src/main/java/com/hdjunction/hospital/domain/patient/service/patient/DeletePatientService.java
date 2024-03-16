package com.hdjunction.hospital.domain.patient.service.patient;

import com.hdjunction.hospital.domain.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeletePatientService {

  private final PatientRepository patientRepository;

  public void byId(Long id) {
    patientRepository.deleteById(id);
  }
}
