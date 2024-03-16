package com.hdjunction.hospital.domain.patient.service.patient;

import com.hdjunction.hospital.domain.model.Hospital;
import com.hdjunction.hospital.domain.model.Patient;
import com.hdjunction.hospital.domain.patient.dto.create.CreatePatientReq;
import com.hdjunction.hospital.domain.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreatePatientService {

  private final PatientRepository patientRepository;

  @Transactional
  public void one(CreatePatientReq createPatientReq) {
    if (validation(createPatientReq)) {
      return;
    }

    String registrationNumber = makeRegistrationNumber(createPatientReq);

    patientRepository.save(Patient.builder()
      .hospital(Hospital.builder().id(createPatientReq.getHospitalId()).build())
      .name(createPatientReq.getName())
      .registrationNumber(registrationNumber)
      .gender(createPatientReq.getGender())
      .birth(createPatientReq.getBirth())
      .mobile(createPatientReq.getMobile())
      .build());
  }

  private boolean validation(CreatePatientReq createPatientReq) {
    /// 병원 유효성 검사
    /// 성별 코드 유효성 검사 ... etc
    return false;
  }

  private String makeRegistrationNumber(CreatePatientReq createPatientReq) {
    String registrationNumber = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 13);

    while (patientRepository.findByRegistrationNumberAndHospital(registrationNumber, createPatientReq.getHospitalId()).isPresent()) {
      registrationNumber = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 13);
    }

    return registrationNumber;
  }

}
