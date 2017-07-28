package com.wdy.game160904;

import java.util.Scanner;

/**
 * �������������ַ������밴����Ϊ8���ÿ���ַ�����������µ��ַ������飻
 * ���Ȳ���8���������ַ������ں��油����0�����ַ���������
 * �������룺
 * abc
 * 123456789
 * �����
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
