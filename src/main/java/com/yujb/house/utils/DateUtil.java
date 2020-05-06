package com.yujb.house.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: charles
 * @date: 2020年4月23日 下午4:38:21
 */
public class DateUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: 随机产生一个min 和max之间的日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min ,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);		
	}
	/**
	 * 根据日期计算年龄
	 * @Title: getAgeByBirthday 
	 * @Description: TODO
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date  birthday) {
		Calendar ca = Calendar.getInstance();//获取系统当前时间
		int nowYear = ca.get(Calendar.YEAR);//获取系统当前年
		int nowMonth = ca.get(Calendar.MONTH);//获取系统当前月
		int nowDay = ca.get(Calendar.DAY_OF_MONTH);//获取系统当前日
		/*
		 * 获取生日的年月日
		 */
		Calendar ca2 = Calendar.getInstance();
		ca2.setTime(birthday);
		int bYear = ca2.get(Calendar.YEAR);//获取当前年
		int bMonth = ca2.get(Calendar.MONTH);//获取当前月
		int bDay = ca2.get(Calendar.DAY_OF_MONTH);//获取当前日
		if(nowYear< bYear) {
			throw new RuntimeException("请输入正确的日期");
		}
		int age = nowYear-bYear;
		if(nowMonth<bMonth) {
			age--;
		}
		if(bMonth==nowMonth && nowDay<bDay) {
			age--;
		}
		return age;
	}
	/**
	 * 获取月初
	 * @Title: getInitMonth 
	 * @Description: TODO
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		//设置当前时间为月初
		ca.set(Calendar.DAY_OF_MONTH, 1);
		ca.set(Calendar.HOUR_OF_DAY, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		return ca.getTime();
	}
	/**
	 * 获取输入日期的月末
	 * @Title: getEndMonth 
	 * @Description: TODO
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		//让当前月份+1
		ca.add(Calendar.MONTH, 1);
		//获得加一月后的月初
		ca.setTime(getInitMonth(ca.getTime()));
		//减一秒拿到月末时间
		ca.add(Calendar.SECOND, -1);
		return ca.getTime();
	}
}
