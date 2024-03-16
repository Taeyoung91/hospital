package com.hdjunction.hospital.domain.patient.service.patient;

import com.hdjunction.hospital.domain.commonCode.enumeration.GroupCode;
import com.hdjunction.hospital.domain.commonCode.service.SearchCommonCodeService;
import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientDetailRes;
import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientRes;
import com.hdjunction.hospital.domain.patient.service.visit.SearchVisitInPatientService;
import com.hdjunction.hospital.domain.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchPatientService {

  private final PatientRepository patientRepository;

  private final SearchVisitInPatientService searchVisitInPatientService;

  private final SearchCommonCodeService searchCommonCodeService;

  public List<SearchPatientRes> all() {
    Map<Long, LocalDateTime> latestCreateAtMapByPatientId = searchVisitInPatientService.latestCreateAtMapByPatientId();
    Map<String, String> genderCodeMap = searchCommonCodeService.nameByCode(GroupCode.GENDER.getCode());

    return patientRepository.findAll().stream().map(patient -> new SearchPatientRes(patient, genderCodeMap, latestCreateAtMapByPatientId)).collect(Collectors.toList());
  }

  public SearchPatientDetailRes byId(Long id) {
    Map<String, String> genderCodeMap = searchCommonCodeService.nameByCode(GroupCode.GENDER.getCode());
    return patientRepository.findById(id).map(patient -> new SearchPatientDetailRes(patient, genderCodeMap)).orElseGet(SearchPatientDetailRes::new);
  }

}
