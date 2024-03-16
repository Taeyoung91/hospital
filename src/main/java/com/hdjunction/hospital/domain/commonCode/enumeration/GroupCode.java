package com.hdjunction.hospital.domain.commonCode.enumeration;

import lombok.Getter;

@Getter
public enum GroupCode {
  GENDER("성별코드");

  private final String code;

  GroupCode(String code) {
    this.code = code;
  }
}
