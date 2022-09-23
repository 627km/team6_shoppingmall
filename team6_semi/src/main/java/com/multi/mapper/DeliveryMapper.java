package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.DeliveryDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface DeliveryMapper extends MyMapper<Integer,DeliveryDTO>{
}