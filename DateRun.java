package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * * java.util.Date
		 */
		
		// �⺻ �����ڸ� ���� ����
		Date date1 = new Date();
		System.out.println(date1);
		
		// ���� ���ϴ� ��¥(2021�� 07�� 27��)�� ����
		// 1) �Ű����� �����ڸ� ���ؼ� ����
		Date date2 = new Date(2021 - 1900, 7 - 1, 27);
		System.out.println(date2);
		
		// 2) �⺻�����ڷ� ������ �� setter�޼ҵ�� �� ����
		date1.setYear(2021-1900);
		date1.setMonth(7 - 1);
		date1.setDate(27);
		
		System.out.println(date1.toString());
		
		// 2021�� 07�� 27�� 02�� 56�� 37��
		
		// �� �Ը���� ������ �����ؼ� ��� ����
		// java.text.SimpleDateFormat Ŭ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
		
	}

}
