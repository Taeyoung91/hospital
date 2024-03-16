package com.hdjunction.hospital.domain.patient.repository;

import com.hdjunction.hospital.domain.model.Patient;
import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientReq;

import java.util.List;

public interface SearchPatientRepository {

  List<Patient> find(SearchPatientReq searchPatientReq);
}
