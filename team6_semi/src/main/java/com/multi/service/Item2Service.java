package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Item2DTO;
import com.multi.frame.MyService;
import com.multi.mapper.Item2Mapper;

@Service
public class Item2Service implements MyService<Integer, Item2DTO>{
	
	@Autowired
	Item2Mapper mapper;

	@Override
	public void register(Item2DTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Item2DTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Item2DTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Item2DTO> get() throws Exception {
		return null;
	}
	
	public List<Item2DTO> item2all(int itemid) throws Exception {
		return mapper.item2all(itemid);
	}
}
