package com.yujb.house.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	//返回min-max之间的随机整数
		public static int random(int min, int max){
			Random random = new Random();
			int t=0;
			if(max<min) {
				t=max;
				max=min;
				min=t;
			}
			return random.nextInt(max-min+1)+min;
		}
		
		public static int[] subRandom (int min, int max, int subs){
			int[] result = new int[subs];
			HashSet<Integer> set = new HashSet<Integer>();
 			while (set.size()!=subs) {
				set.add(random(min,max));
			}
 			int i=0;
 			for (Integer value : set) {
				result[i]=value;
				i++;
			}
			return result;
			
		}
		
		//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
			Random random = new Random();
			String str="0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
			char c = str.charAt(random.nextInt(str.length()));
			return c;
		}
		
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
			StringBuffer sbf = new StringBuffer();
			for(int i=0;i<length;i++) {
				sbf.append(randomCharacter());
			}
			return sbf.toString();
		}
}
