package com.wdy.game170728;

import java.util.Scanner;

/**
 * “某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
 * 方法如下：
 * 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，
 * 最多可以换多少瓶汽水喝？
 * @author wdy
 *
 */
public class ChangeSoda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		//第一种方法
		System.err.println(func1(sum));
		
	}
	
	
//	public static int func2(int sum) {
//		
//	}
	
	
	/**
	 * 通过分析可以得到以下结论：
	 * 三个空汽水瓶可以换一瓶汽水，但是又产生了一个空汽水瓶。
	 * 两个空汽水瓶可以借一瓶换一瓶汽水然后将产生的一个空汽水瓶还回，
	 * 等于说两个空汽水瓶可以换一瓶汽水，并且不产生空汽水瓶。
	 */
	public static int func1(int sum) {
		
		if(sum == 0)
			return 0;
		return sum/2;
		
	}

}
