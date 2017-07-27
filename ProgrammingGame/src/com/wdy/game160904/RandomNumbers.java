package com.wdy.game160904;

import java.util.ArrayList;
import java.util.List;

/**
 * 先用计算机生成N个1-10之间的随机整数，对于重复的数字，只保留一个，
 * @author wdy
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		int index = 10 ;
		//声明一个Integer类型的list集合
		List<Integer> list = new ArrayList<Integer>();
		//为数组中存入随机数
		for (int j = 0; j < index; j++) {
			int num = (int)(Math.random()*10);
			System.err.println("生成是随机数："+num);
			list.add(num);
		}
		
		//去重
		List<Integer> temp = new ArrayList<Integer>();
		for (Integer i : list) {
			if(!temp.contains(i)) {
				temp.add(i);
			}
		}
		for (Integer integer : temp) {
			System.err.println("过滤后："+integer);
		}
		
	}

}
