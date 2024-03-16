package com.hdjunction.hospital.domain.patient.dto.update;

import lombok.Getter;

@Getter
public class UpdatePatientReq {

  private String name;

  private String gender;

  private String birth;

  private String mobile;
}
