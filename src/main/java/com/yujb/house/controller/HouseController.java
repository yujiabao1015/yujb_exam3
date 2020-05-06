package com.yujb.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yujb.house.domain.House;
import com.yujb.house.domain.HouseType;
import com.yujb.house.service.HouseService;
import com.yujb.house.vo.HouseVo;
/**
 * 
 * @ClassName: 房间预定系统 
 * @Description: TODO
 * @author: www17
 * @date: 2020年5月6日 上午11:49:45
 */
@Controller
public class HouseController {
	@Autowired
	private HouseService service;
	/**
	 * 查询多条记录
	 * @Title: selects 
	 * @Description: TODO
	 * @param vo
	 * @param pageNum
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("selects")
	public String selects(HouseVo vo ,@RequestParam(defaultValue = "1")Integer pageNum,Model model) {
		PageInfo<House> info = service.selects(vo, pageNum);
		model.addAttribute("info", info);
		model.addAttribute("vo", vo);
		return "selects";
	}
	//中间跳转页面
	@GetMapping("add")
	public String add() {
		return "add";
	}
	
	@RequestMapping("getType")
	@ResponseBody
	public List<HouseType> getType(){
		List<HouseType> list = service.getAllType();
		return list;
	}
	
	@PostMapping("add")
	public String addOne(House house){
		System.out.println(house);
		int count = service.addOne(house);
		return "redirect:selects";
	}
}
