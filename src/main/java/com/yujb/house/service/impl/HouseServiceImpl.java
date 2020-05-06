package com.yujb.house.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yujb.house.dao.HouseMapper;
import com.yujb.house.domain.House;
import com.yujb.house.domain.HouseType;
import com.yujb.house.service.HouseService;
import com.yujb.house.vo.HouseVo;

@Service
@Transactional
public class HouseServiceImpl implements HouseService {
	@Autowired
	private HouseMapper mapper;

	@Override
	public int addHouses(List<House> houses) {
		
		return mapper.addHouses(houses);
	}

	@Override
	public PageInfo<House> selects(HouseVo vo,Integer pageNum) {
		PageHelper.startPage(pageNum, 10);
		List<House> list = mapper.selects(vo);
		PageInfo<House> info = new PageInfo<House>(list);
		return info;
	}

	@Override
	public int addOne(House house) {
		
		return mapper.addOne(house);
	}

	@Override
	public List<HouseType> getAllType() {
		
		return mapper.getAllType();
	}
}
