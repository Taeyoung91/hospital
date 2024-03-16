package com.hdjunction.hospital.domain.repository;

import com.hdjunction.hospital.domain.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {

}
