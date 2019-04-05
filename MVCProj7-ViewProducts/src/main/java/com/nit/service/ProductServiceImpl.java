package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nit.bo.ProductBO;
import com.nit.dao.ProductDAO;
import com.nit.dto.ProductDTO;

public class ProductServiceImpl implements ProductService {
private ProductDAO dao;


	public ProductServiceImpl(ProductDAO dao) {
	this.dao = dao;
}


	@Override
	public List<ProductDTO> fetchAllProducts() {
		// TODO Auto-generated method stub
		
		List<ProductDTO> listDTO=new ArrayList();
		List<ProductBO> listBO=dao.getAllProducts();
	/*	for (ProductBO pBO : listBO) {
			dto.setPid(pBO.getPid());
			dto.setPname(pBO.getPname());
			dto.setPrice(pBO.getPrice());
			dto.setStockQty(pBO.getStockQty());
			dto.setMfgDate(pBO.getMfgDate());
			dto.setExpDate(pBO.getExpDate());
			listDTO.add(dto);
		}*/
		
		listBO.forEach(bo->{
			ProductDTO dto=new ProductDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
