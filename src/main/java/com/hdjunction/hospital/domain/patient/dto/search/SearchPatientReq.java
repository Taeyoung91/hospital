package com.hdjunction.hospital.domain.patient.dto.search;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchPatientReq {

  private String searchType;
  private String searchValue;

  private boolean usePaging;
  private long pageSize;
  private long pageNo;

  public long getPageSize() {
    return Math.max(10, pageSize);
  }

  public long getPageNo() {
    return Math.max(0, pageNo);
  }
}
