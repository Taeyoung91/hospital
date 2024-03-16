package com.hdjunction.hospital.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "visit")
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
