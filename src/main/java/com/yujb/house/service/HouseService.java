package com.yujb.house.service;

import java.util.List;


import com.github.pagehelper.PageInfo;
import com.yujb.house.domain.House;
import com.yujb.house.domain.HouseType;
import com.yujb.house.vo.HouseVo;

public interface HouseService {
	//批量添加
	int addHouses(List<House> houses);
	//列表展示
	PageInfo<House> selects(HouseVo vo,Integer pageNum);
	//添加单条
	int addOne(House house);
	
	List<HouseType> getAllType();
}
