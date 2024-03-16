package com.hdjunction.hospital.domain.patient.controller;

import com.hdjunction.hospital.domain.patient.service.DeletePatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class DeletePatientController {

  private final DeletePatientService deletePatientService;

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    deletePatientService.delete(id);
    return ResponseEntity.noContent().build();
  }
}

