package com.wdy.game160903;

import java.util.Scanner;

/**
 * �����ַ������һ�����ʵĳ��ȣ������Կո������
 * ��������:һ���ַ������ǿգ�����С��5000��
 * �������:����N�����һ�����ʵĳ��ȡ�
 * ��������:hello world
 * �������:5
 * @author wdy
 *
 */
public class TheLengthOfTheLastWordOfTheString {

	public static void main(String[] args) {
		String inputStr = "Hello World i am wdymaster";
		Scanner sc= new Scanner(System.in);
		inputStr = sc.nextLine();//��ȡ������Ϣ
		String[] strs = inputStr.split(" ");
		int lastIndex = strs.length;
		System.err.println(strs[lastIndex - 1].length());
		
	}
	
	
}
