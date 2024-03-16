package com.hdjunction.hospital.domain.patient.service.visit;

import com.hdjunction.hospital.domain.model.Visit;
import com.hdjunction.hospital.domain.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchVisitInPatientService {

  private final VisitRepository visitRepository;

  public Map<Long, LocalDateTime> latestCreateAtMapByPatientId() {
    return visitRepository.findAllWithPatient().stream().collect(Collectors.toMap(
      visit -> visit.getPatient().getId(),
      Visit::getCreateAt,
      (v1, v2) -> v1.isAfter(v2) ? v1 : v2
    ));
  }
}
