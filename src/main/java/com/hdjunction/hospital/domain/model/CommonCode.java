package com.hdjunction.hospital.domain.model;

import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Getter
@Table(name = "common_code")
public class CommonCode {

  @Id
  private String code;

  @ManyToOne(fetch = FetchType.LAZY)
  private CommonCodeGroup commonCodeGroup;

  private String name;
}
