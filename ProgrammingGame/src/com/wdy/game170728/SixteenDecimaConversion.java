package com.wdy.game170728;


/**
 * ����ת��
 * @author wdy
 * 
 */
public class SixteenDecimaConversion {

	public static void main(String[] args) {
		int n1 = 14;
		//ʮ����ת��ʮ�����ƣ�
		Integer.toHexString(n1);
		//ʮ����ת�ɰ˽���
		Integer.toOctalString(n1);
		//ʮ����ת�ɶ�����
		Integer.toBinaryString(12);
		 
		//ʮ������ת��ʮ����
		Integer.valueOf("FFFF",16).toString();
		//ʮ������ת�ɶ�����
		Integer.toBinaryString(Integer.valueOf("FFFF",16));
		//ʮ������ת�ɰ˽���
		Integer.toOctalString(Integer.valueOf("FFFF",16));
		 
		//�˽���ת��ʮ����
		Integer.valueOf("576",8).toString();
		//�˽���ת�ɶ�����
		Integer.toBinaryString(Integer.valueOf("23",8));
		//�˽���ת��ʮ������
		Integer.toHexString(Integer.valueOf("23",8));
		 
		//������תʮ����
		Integer.valueOf("0101",2).toString();
		//������ת�˽���
		Integer.toOctalString(Integer.parseInt("0101", 2));
		//������תʮ������
		Integer.toHexString(Integer.parseInt("0101", 2));
		
	}
	
}
