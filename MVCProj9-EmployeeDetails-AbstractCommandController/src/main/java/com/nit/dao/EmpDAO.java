package com.nit.dao;

import java.util.List;

import com.nit.bo.EmpInputBO;
import com.nit.bo.EmpResultBO;

public interface EmpDAO {
 public List<EmpResultBO> getEmpList(EmpInputBO ibo);
}
