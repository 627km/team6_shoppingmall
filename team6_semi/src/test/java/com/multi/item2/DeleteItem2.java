package com.multi.item2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.Item2Service;

@SpringBootTest
class DeleteItem2 {
	
	@Autowired
	Item2Service service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1008);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
