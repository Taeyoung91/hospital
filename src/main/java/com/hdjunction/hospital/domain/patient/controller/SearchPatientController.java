package com.hdjunction.hospital.domain.patient.controller;

import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientDetailRes;
import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientReq;
import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientRes;
import com.hdjunction.hospital.domain.patient.service.patient.SearchPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class SearchPatientController {

  private final SearchPatientService searchPatientService;

  @GetMapping
  public ResponseEntity<List<SearchPatientRes>> list(SearchPatientReq searchPatientReq) {
    return new ResponseEntity<>(searchPatientService.list(searchPatientReq), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<SearchPatientDetailRes> byId(@PathVariable Long id) {
    return new ResponseEntity<>(searchPatientService.byId(id), HttpStatus.OK);
  }

}
