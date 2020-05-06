package com.yujb.house.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yujb.house.domain.House;
import com.yujb.house.domain.HouseType;
import com.yujb.house.vo.HouseVo;

public interface HouseMapper {
	//批量添加
	int addHouses(@Param("houses")List<House> houses);
	//查询列表
	List<House> selects(HouseVo vo);
	//添加单条数据
	int addOne(@Param("a")House house);
	//拿到所有房间
	List<HouseType> getAllType();
}
