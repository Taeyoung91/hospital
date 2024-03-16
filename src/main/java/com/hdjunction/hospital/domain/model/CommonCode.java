package com.hdjunction.hospital.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CommonCode {

  @Id
  private String code;

  @ManyToOne(fetch = FetchType.LAZY)
  private CommonCodeGroup commonCodeGroup;

  private String name;
}
