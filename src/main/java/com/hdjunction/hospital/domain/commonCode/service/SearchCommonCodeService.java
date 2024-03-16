package com.hdjunction.hospital.domain.commonCode.service;

import com.hdjunction.hospital.domain.model.CommonCode;
import com.hdjunction.hospital.domain.repository.CommonCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchCommonCodeService {

  private final CommonCodeRepository commonCodeRepository;

  public Map<String, String> nameByCode(String commonCodeGroupId) {
    return commonCodeRepository.findByCommonCodeGroup(commonCodeGroupId).stream().collect(Collectors.toMap(CommonCode::getCode, CommonCode::getName));
  }
}
