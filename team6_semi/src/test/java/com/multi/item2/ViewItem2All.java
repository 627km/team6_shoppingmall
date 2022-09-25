package com.multi.item2;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Item2DTO;
import com.multi.service.Item2Service;

@SpringBootTest
class ViewItem2All {
	
	@Autowired
	Item2Service service;
	
	@Test
	void contextLoads() {
		
		List<Item2DTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Item2DTO i:list) {
			System.out.println(i);
		}
		
	}

}
