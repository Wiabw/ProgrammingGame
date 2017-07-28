package com.wdy.game160904;

import java.util.Scanner;

/**
 * 连续输入两行字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 例如输入：
 * abc
 * 123456789
 * 输出：
 * abc00000
 * 12345678
 * 90000000
 * @author wdy
 *
 */
public class StringPartitioning {

	public static int subStringLength = 8;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str = "";
		int length = 0;
		if(str1 != "" && str1 != null) {
			if(str1.length()*10%subStringLength != 0) {
				str += notMultipleSubStringLength(str1);
			}
		}
		if(str2 != "" && str2 != null) {
			if(str2.length()*10%subStringLength != 0) {
				str += notMultipleSubStringLength(str2);
			}
		}
		length = str.length()/subStringLength;
		String[] strs = new String[length];
		for(int i=0; i<length; i++) {
			strs[i]=str.substring(i*subStringLength, ((i+1)*subStringLength));
		}
		for(int j=0; j<length; j++) {
			System.err.println(strs[j]);
		}
		
	}
	
	public static String notMultipleSubStringLength(String str) {
		
		int strLength = subStringLength - str.length()%subStringLength;
		for(int i=0;i<strLength;i++) {
			str += "0";
		}
		return str;
	}
	
	
}
