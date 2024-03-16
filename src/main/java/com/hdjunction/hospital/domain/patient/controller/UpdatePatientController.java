package com.hdjunction.hospital.domain.patient.controller;

import com.hdjunction.hospital.domain.patient.dto.update.UpdatePatientReq;
import com.hdjunction.hospital.domain.patient.service.patient.UpdatePatientService;
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
  public ResponseEntity<Void> byId(@PathVariable Long id, @RequestBody UpdatePatientReq updatePatientReq) {
    updatePatientService.byId(id, updatePatientReq);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
