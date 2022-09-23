package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CartDTO {
	private int cartid;
	private int custid;
	private int itemid;
	private int cnt;
	private Date date;
	
	private String cust_name;
	private String item2_name;
	private int item2_price;
	private int totalprice;
}