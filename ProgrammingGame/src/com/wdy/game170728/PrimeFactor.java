package com.wdy.game170728;

import java.util.Scanner;

/**
 * ���մ�С�����˳����������������������ӣ��Կո���������һ��������ҲҪ�пո�
 * ʾ����
 * ���룺180
 * �����2 2 3 3 5 
 * @author wdy
 *
 */
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = "";
		//˼·��ÿ�ҵ�һ������������num��ֵ��������ǰforѭ������ʼ�µ�forѭ��ֱ��numΪ1
		while(num != 1) {
			for(int i = 2; i <= num; i++) {
				if(num%i == 0) {
					num = num/i;
					str += i + " ";
					break;
				}
			}
		}
		System.err.println(str);
	}

}
