package com.multi.mapper;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import com.multi.dto.Order_DetailDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface Order_DetailMapper extends MyMapper<Integer,Order_DetailDTO> {

}
