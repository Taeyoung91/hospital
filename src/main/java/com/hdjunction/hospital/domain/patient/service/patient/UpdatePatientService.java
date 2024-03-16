package com.hdjunction.hospital.domain.patient.service.patient;

import com.hdjunction.hospital.domain.patient.dto.update.UpdatePatientReq;
import com.hdjunction.hospital.domain.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdatePatientService {

  private final PatientRepository patientRepository;

  @Transactional
  public void byId(Long id, UpdatePatientReq updatePatientReq) {
    patientRepository.findById(id).ifPresent(patient ->
      patient.update(updatePatientReq));
  }
}
