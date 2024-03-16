package com.hdjunction.hospital.domain.patient.dto.search;

import com.hdjunction.hospital.domain.model.Patient;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Getter
public class SearchPatientRes {

  private String patientName;
  private String registrationNumber;
  private String gender;
  private String birth;
  private String mobile;
  private String latestCreateAt = "";

  public SearchPatientRes(Patient patient, Map<String, String> genderCodeMap, Map<Long, LocalDateTime> latestCreateAtMapByPatientId) {
    this.patientName = patient.getName();
    this.registrationNumber = patient.getRegistrationNumber();
    this.gender = genderCodeMap.get(patient.getGender());
    this.birth = patient.getBirth();
    this.mobile = patient.getMobile();
    if (latestCreateAtMapByPatientId.containsKey(patient.getId())) {
      this.latestCreateAt = latestCreateAtMapByPatientId.get(patient.getId()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
  }
}
