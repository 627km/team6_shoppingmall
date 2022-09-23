package com.multi.purchase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.PurchaseDTO;
import com.multi.service.PurchaseService;

@SpringBootTest
class GetPurchase {
	@Autowired
	PurchaseService service;
	
	@Test
	void contextLoads() {

		PurchaseDTO purcase=null;
		try {
			purcase=service.get(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
