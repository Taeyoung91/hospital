package com.hdjunction.hospital.domain.repository;

import com.hdjunction.hospital.domain.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {

  @Query("SELECT v FROM Visit v JOIN FETCH v.patient")
  List<Visit> findAllWithPatient();
}
