package com.wdy.game160904;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ü��������N��1-10֮�����������������ظ������֣�ֻ����һ����
 * @author wdy
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		int index = 10 ;
		//����һ��Integer���͵�list����
		List<Integer> list = new ArrayList<Integer>();
		//Ϊ�����д��������
		for (int j = 0; j < index; j++) {
			int num = (int)(Math.random()*10);
			System.err.println("�������������"+num);
			list.add(num);
		}
		
		//ȥ��
		List<Integer> temp = new ArrayList<Integer>();
		for (Integer i : list) {
			if(!temp.contains(i)) {
				temp.add(i);
			}
		}
		for (Integer integer : temp) {
			System.err.println("���˺�"+integer);
		}
		
	}

}
