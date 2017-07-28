package com.wdy.game170728;

import java.util.Scanner;

/**
 * 接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 * @author wdy
 *
 */
public class ApproximateValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		//整数
		int integer = (int)num;
		//余数(小数点后第一位)
		int remainder = (int) ((num*10)%10);
		if(remainder >= 5)
			integer += integer;
		
		System.err.println(integer);
		
	}

}
