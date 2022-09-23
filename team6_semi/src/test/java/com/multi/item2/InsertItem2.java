package com.multi.item2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Item2DTO;
import com.multi.service.Item2Service;


@SpringBootTest
class InsertItem2 {

	@Autowired
	Item2Service service;
	
	@Test
	void contextLoads() {
		Item2DTO item = new Item2DTO(0, 11, 1, "유넥", 18000, null, null, null, 0);
		try {
			service.register(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}




