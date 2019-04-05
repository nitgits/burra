package com.nit.dao;

import java.util.List;

import com.nit.bo.ProductBO;

public interface ProductDAO {
  public List<ProductBO> getAllProducts();
}
