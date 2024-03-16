package com.hdjunction.hospital.domain.patient.dto.search;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchPatientReq {

  private String searchType;
  private String searchValue;
}
