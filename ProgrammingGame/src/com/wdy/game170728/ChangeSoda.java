package com.wdy.game170728;

import java.util.Scanner;

/**
 * ��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ�������5ƿ��
 * �������£�
 * ����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�
 * Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ������Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ��
 * �����Ի�����ƿ��ˮ�ȣ�
 * @author wdy
 *
 */
public class ChangeSoda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		//��һ�ַ���
		System.err.println(func1(sum));
		
	}
	
	
//	public static int func2(int sum) {
//		
//	}
	
	
	/**
	 * ͨ���������Եõ����½��ۣ�
	 * ��������ˮƿ���Ի�һƿ��ˮ�������ֲ�����һ������ˮƿ��
	 * ��������ˮƿ���Խ�һƿ��һƿ��ˮȻ�󽫲�����һ������ˮƿ���أ�
	 * ����˵��������ˮƿ���Ի�һƿ��ˮ�����Ҳ���������ˮƿ��
	 */
	public static int func1(int sum) {
		
		if(sum == 0)
			return 0;
		return sum/2;
		
	}

}
