package com.hdjunction.hospital.domain.patient.repository;

import com.hdjunction.hospital.domain.model.Patient;
import com.hdjunction.hospital.domain.patient.dto.search.SearchPatientReq;
import com.hdjunction.hospital.domain.patient.enumeration.SearchType;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

import static com.hdjunction.hospital.domain.model.QPatient.patient;

@RequiredArgsConstructor
public class SearchPatientRepositoryImpl implements SearchPatientRepository {

  private final JPAQueryFactory queryFactory;

  @Override
  public List<Patient> find(SearchPatientReq searchPatientReq) {
    return queryFactory.select(
      Projections.fields(Patient.class, patient.id, patient.name, patient.registrationNumber, patient.gender, patient.birth, patient.mobile))
      .from(patient)
      .where(condition(searchPatientReq))
      .fetch();
  }

  private BooleanExpression condition(SearchPatientReq searchPatientReq) {
    if (StringUtils.equalsIgnoreCase(searchPatientReq.getSearchType(), SearchType.NAME.name())) {
      return patient.name.contains(searchPatientReq.getSearchValue());
    }

    if (StringUtils.equalsIgnoreCase(searchPatientReq.getSearchType(), SearchType.BIRTH.name())) {
      return patient.birth.contains(searchPatientReq.getSearchValue());
    }

    if (StringUtils.equalsIgnoreCase(searchPatientReq.getSearchType(), SearchType.REGISTRATION_NUMBER.name())) {
      return patient.registrationNumber.eq(searchPatientReq.getSearchValue());
    }

    return null;
  }
}
