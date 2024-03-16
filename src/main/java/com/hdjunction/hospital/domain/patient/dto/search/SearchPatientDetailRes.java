package com.hdjunction.hospital.domain.patient.dto.search;

import com.hdjunction.hospital.domain.model.Patient;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@NoArgsConstructor
public class SearchPatientDetailRes {

  private long id;

  private String name;

  private long hospitalId;

  private String hospitalName;

  private String registrationNumber;

  private String gender;

  private String birth;

  private String mobile;

  public SearchPatientDetailRes(Patient patient, Map<String, String> genderCodeMap) {
    this.id = patient.getId();
    this.name = patient.getName();
    this.hospitalId = patient.getHospital().getId();
    this.hospitalName = patient.getHospital().getName();
    this.registrationNumber = patient.getRegistrationNumber();
    this.gender = genderCodeMap.get(patient.getGender());
    this.birth = patient.getBirth();
    this.mobile = patient.getMobile();
  }
}
