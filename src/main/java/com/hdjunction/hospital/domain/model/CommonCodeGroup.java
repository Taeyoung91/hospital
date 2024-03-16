package com.hdjunction.hospital.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "common_code_group")
public class CommonCodeGroup {

  @Id
  private String id;

  private String name;

  private String description;

}
