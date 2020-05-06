package com.yujb.house.vo;

import com.yujb.house.domain.House;

public class HouseVo extends House{
	private Double p1;
	private Double p2;
	private String t1;
	private String t2;
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public HouseVo() {
		super();
	}
	public HouseVo(Double p1, Double p2, String t1, String t2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.t1 = t1;
		this.t2 = t2;
	}
	@Override
	public String toString() {
		return "HouseVo [p1=" + p1 + ", p2=" + p2 + ", t1=" + t1 + ", t2=" + t2 + "]";
	}
	
}
