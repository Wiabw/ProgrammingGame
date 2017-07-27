package com.wdy.game160903;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:一行字符串，非空，长度小于5000。
 * 输出描述:整数N，最后一个单词的长度。
 * 输入例子:hello world
 * 输出例子:5
 * @author wdy
 *
 */
public class TheLengthOfTheLastWordOfTheString {

	public static void main(String[] args) {
		String inputStr = "Hello World i am wdymaster";
		Scanner sc= new Scanner(System.in);
		inputStr = sc.nextLine();//获取输入信息
		String[] strs = inputStr.split(" ");
		int lastIndex = strs.length;
		System.err.println(strs[lastIndex - 1].length());
		
	}
	
	
}
