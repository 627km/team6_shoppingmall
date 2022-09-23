package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class UpdateCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(109, 125, 1003, 1, null, "윤진호", "청바지", 58000, 58000);
		try {
			service.modify(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UPDATE OK");
	}

}




