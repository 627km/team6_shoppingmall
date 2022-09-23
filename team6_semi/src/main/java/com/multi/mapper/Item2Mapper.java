package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Item2DTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface Item2Mapper extends MyMapper<Integer, Item2DTO>{

	public List<Item2DTO> item2all(int itemid) throws Exception;
	
}