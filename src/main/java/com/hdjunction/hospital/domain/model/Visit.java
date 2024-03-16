package com.hdjunction.hospital.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Visit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Hospital hospital;

  @ManyToOne(fetch = FetchType.LAZY)
  private Patient patient;

  private LocalDateTime createAt;

  private String visitStateCode;
}
