package com.wdy.game170728;

import java.util.Scanner;

/**
 * ����һ����������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ��
 * @author wdy
 *
 */
public class ApproximateValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		//����
		int integer = (int)num;
		//����(С������һλ)
		int remainder = (int) ((num*10)%10);
		if(remainder >= 5)
			integer += integer;
		
		System.err.println(integer);
		
	}

}
