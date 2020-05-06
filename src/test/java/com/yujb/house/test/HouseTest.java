package com.yujb.house.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.yujb.house.domain.House;
import com.yujb.house.service.HouseService;
import com.yujb.house.utils.DateUtil;
import com.yujb.house.utils.RandomUtil;
import com.yujb.house.utils.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-beans.xml")
public class HouseTest {
	@Autowired
	private HouseService service;
	@Test
	public void test() {
		List<House> list = new ArrayList<House>();//存放数据的集合
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2020, 04, 01);
		Date minDate = c.getTime();
		for(int i=0; i<100; i++) {
			list.add(new House(i, sdf.format(DateUtil.random(minDate, new Date())), StringUtil.generateChineseName(), "1391234560"+RandomUtil.random(0, 9), null, RandomUtil.random(1, 2), null, StringUtil.randomChineseStrings(RandomUtil.random(20, 50))));
		}
		service.addHouses(list);
	}
}
