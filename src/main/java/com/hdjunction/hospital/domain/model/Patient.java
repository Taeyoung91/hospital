package com.hdjunction.hospital.domain.model;

import jakarta.persistence.*;

@Entity
public class Patient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Hospital hospital;

  private String name;

  private String registrationNumber;

  private String gender;

  private String birth;

  private String mobile;

}
