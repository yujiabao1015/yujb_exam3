package com.yujb.house.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	/**
	 * 批量关闭流或资源
	 * @Title: closeAll 
	 * @Description: TODO
	 * @param autoCloseable
	 * @return: void
	 */
	public static void closeAll(AutoCloseable ... autoCloseable){
		if(autoCloseable !=null && autoCloseable.length>0) {
			for (AutoCloseable autoCloseable2 : autoCloseable) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 读取文本文件对象内容
	 * @Title: readTextFile 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: String
	 */
	public static String readTextFile(InputStream src){
		BufferedInputStream bis = new BufferedInputStream(src);
		byte[] bytes = new byte[1024];
		int len=0;
		StringBuffer sbf = new StringBuffer();
		try {
			while((len=bis.read(bytes))!=-1) {
				sbf.append(new String(bytes, 0, len));
			}
		} catch (IOException e) {
			closeAll(bis);
			e.printStackTrace();
		}
 		return sbf.toString();
	}
	/**
	 * 读取文本文件内容
	 * @Title: readTextFile 
	 * @Description: TODO
	 * @param txtFile
	 * @return
	 * @return: String
	 */
	public static String readTextFile(File txtFile) {
		String textFile ="";
		try {
			textFile = readTextFile(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return textFile;
	}
	/**
	 * 读取文件内容到集合里
	 * @Title: readTextFile2List 
	 * @Description: TODO
	 * @param txtFile
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readTextFile2List(File txtFile){
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile)));
			String str = "";
			while((str=br.readLine())!=null) {
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
