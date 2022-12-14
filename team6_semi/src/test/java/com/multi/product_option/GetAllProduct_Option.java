package com.multi.product_option;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Product_OptionDTO;
import com.multi.service.Product_OptionService;


@SpringBootTest
	class GetAllProduct_Option {
	@Autowired
	Product_OptionService service;
	
	@Test
	void contextLoads() {
		List<Product_OptionDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Product_OptionDTO c:list) {
			System.out.println(c);
		}
	}

}
