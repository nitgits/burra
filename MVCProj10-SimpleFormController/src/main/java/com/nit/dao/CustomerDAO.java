package com.nit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nit.bo.CustomerBO;

public interface CustomerDAO {
  public int insert(CustomerBO bo);
  
  
}
