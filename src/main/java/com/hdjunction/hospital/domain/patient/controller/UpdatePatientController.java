package com.hdjunction.hospital.domain.patient.controller;

import com.hdjunction.hospital.domain.patient.dto.update.UpdatePatientReq;
import com.hdjunction.hospital.domain.patient.service.UpdatePatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class UpdatePatientController {

  private final UpdatePatientService updatePatientService;

  @PutMapping("/{id}")
  public ResponseEntity<Void> updatePatient(@PathVariable Long id, @RequestBody UpdatePatientReq updatePatientReq) {
    updatePatientService.update(updatePatientReq);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
