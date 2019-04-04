package com.nit.beans;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class AmoghaBillCounter {
private int orderId;
private String billClerk;
private Date date;
private List<String> items;
private int billAmt;
private boolean isSpecialItemAvailable;

}
