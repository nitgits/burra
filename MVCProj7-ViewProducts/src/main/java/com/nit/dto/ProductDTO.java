package com.nit.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class ProductDTO implements Serializable{
 private int pid;
 private String pname;
 private float price;
 private float stockQty;
 private Date mfgDate;
 private Date expDate;
 
}
