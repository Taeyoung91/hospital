package com.hdjunction.hospital.domain.model;

import com.hdjunction.hospital.domain.patient.dto.update.UpdatePatientReq;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "patient")
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

  public void update(UpdatePatientReq updatePatientReq) {
    this.name = updatePatientReq.getName();
    this.gender = updatePatientReq.getGender();
    this.birth = updatePatientReq.getBirth();
    this.mobile = updatePatientReq.getMobile();
  }
}
