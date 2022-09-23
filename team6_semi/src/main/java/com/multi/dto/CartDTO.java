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
	private int cart_id;
	private int cust_id;
	private String cust_name;
	private int item2_id;
	private String item2_name;
	private int item2_price;
	private int cnt;
	private Date date;
	private int totalprice;
}