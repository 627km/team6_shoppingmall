package com.multi.dto;



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
public class Order_DetailDTO {

	private int detailid;
	private int orderid;
	private int itemid;
	private int cnt;
	private int price;
	private String color;
	private String size;
	
	private String custname;
	private String itemname;
	
}
