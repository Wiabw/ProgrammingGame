package com.wdy.game170728;

import java.util.Scanner;

/**
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 * 示例：
 * 输入：180
 * 输出：2 2 3 3 5 
 * @author wdy
 *
 */
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = "";
		//思路：每找到一个质数，更新num的值并结束当前for循环，开始新的for循环直到num为1
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
