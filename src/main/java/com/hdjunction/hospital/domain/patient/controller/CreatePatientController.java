package com.hdjunction.hospital.domain.patient.controller;

import com.hdjunction.hospital.domain.patient.dto.create.CreatePatientReq;
import com.hdjunction.hospital.domain.patient.service.patient.CreatePatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class CreatePatientController {

  private final CreatePatientService createPatientService;

  @PostMapping
  public ResponseEntity<Void> one(@RequestBody CreatePatientReq createPatientReq) {
    createPatientService.one(createPatientReq);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
