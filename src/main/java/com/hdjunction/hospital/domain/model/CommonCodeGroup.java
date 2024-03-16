package com.hdjunction.hospital.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CommonCodeGroup {

  @Id
  private String id;

  private String name;

  private String description;

}
