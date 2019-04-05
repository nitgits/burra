package com.nit.service;

import java.util.List;

import com.nit.dto.EmpInputDTO;
import com.nit.dto.EmpResultDTO;

public interface EmpService {
public List<EmpResultDTO> fetchEmpDetails(EmpInputDTO edto);
}
