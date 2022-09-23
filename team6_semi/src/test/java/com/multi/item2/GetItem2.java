package com.multi.item2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Item2DTO;
import com.multi.service.Item2Service;


@SpringBootTest
class GetItem2 {

	@Autowired
	Item2Service service;
	
	@Test
	void contextLoads() {
		Item2DTO item = null;
		try {
			item = service.get(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(item);
	}

}




