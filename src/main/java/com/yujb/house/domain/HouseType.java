package com.yujb.house.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class HouseType implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	
	
	private BigInteger tid;
	private String tname;
	private	BigDecimal price;
	
	public BigInteger getTid() {
		return tid;
	}

	public void setTid(BigInteger tid) {
		this.tid = tid;
	}
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public HouseType() {
		super();
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public HouseType(BigInteger tid, String tname, BigDecimal price) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((tid == null) ? 0 : tid.hashCode());
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HouseType other = (HouseType) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HouseType [tid=" + tid + ", tname=" + tname + ", price=" + price + "]";
	}

	
	
	
	
	
	
}
