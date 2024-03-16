package com.hdjunction.hospital.domain.patient.dto.create;

import lombok.Getter;

@Getter
public class CreatePatientReq {

  private String name;

  private long hospitalId;

  private String gender;

  private String birth;

  private String mobile;

}
