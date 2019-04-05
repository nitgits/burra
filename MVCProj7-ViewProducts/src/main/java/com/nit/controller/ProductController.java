package com.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.dto.ProductDTO;
import com.nit.service.ProductService;

public class ProductController extends AbstractController{
	
	private ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}
	


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ProductDTO> listDTO=service.fetchAllProducts();
		ModelAndView mav=new ModelAndView();
		mav.addObject("prodList",listDTO);
		mav.setViewName("show_prod");
		return mav;
	}

}
