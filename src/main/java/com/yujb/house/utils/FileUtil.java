package com.yujb.house.utils;

import java.io.File;

public class FileUtil {
	/**
	 * 获取文件后缀名
	 * @Title: getExtendName 
	 * @Description: TODO
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getExtendName(String fileName){
		//判断输入内容是否正确(空串或非文件格式)
		if(StringUtil.hasText(fileName) && !fileName.contains(".")) {
			throw new RuntimeException("请输入一个正确的文件");
		}
		return fileName.substring(fileName.lastIndexOf("."));
	}
	/**
	 * 拿到操作系统临时目录
	 * @Title: getTempDirectory 
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/**
	 * 拿到系统用户目录
	 * @Title: getUserDirectory 
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}
}
