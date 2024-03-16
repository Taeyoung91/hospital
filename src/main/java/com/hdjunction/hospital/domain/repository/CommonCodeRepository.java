package com.hdjunction.hospital.domain.repository;

import com.hdjunction.hospital.domain.model.CommonCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommonCodeRepository extends JpaRepository<CommonCode, String> {

  @Query("SELECT c FROM CommonCode c JOIN FETCH c.commonCodeGroup cg WHERE cg.id = :commonCodeGroupId")
  List<CommonCode> findByCommonCodeGroup(@Param("commonCodeGroupId") String commonCodeGroupId);
}
