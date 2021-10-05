package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		//countTokens(); ��ū�� ���� Ȯ��
		//hasMoreTokens(); ��ū�� �� �����ִ��� Ȯ��
		//nextToken(); ���� ��ū�� �ҷ���
		
		// �����ڸ� �������� �ؼ� ���ڿ��� �и� ��Ű�� ���
		
		// ���1. �и��� ���ڿ����� String[] �迭�� �������� ����� �Ҷ�
		// 		 StringŬ������ �����ϴ�split �޼ҵ� �̿�
		//		  ���ڿ�.split(������) : String[]
		//
		
		String[] arr = str.split(",");
		
		System.out.println("�迭�� ���� : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° �ε��� : " + arr[i]);
		}
		*/
		int i = 0;
		for(String s : arr) { // s = arr[0]; => s = arr[1]; ...
			System.out.println(i + "��° �ε��� : " +s);
			i ++;
		}
		
		// ���2. �и��� ���ڿ����� ���� ��ū���μ� �����ϰ��� �� ��
		//		 java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		//		 StringTokenizer stn = new StringTokenizer(�и���Ű���� �ϴ� ���ڿ�, ������);
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("�и��� ���ڿ��� ���� : " + stn.countTokens());
		
		/*
		
		System.out.println(stn.nextToken()); //java
		System.out.println(stn.nextToken()); //oracle
		System.out.println(stn.nextToken()); //jdbc
		
		System.out.println(stn.countTokens()); // ��������3
		
		System.out.println(stn.nextToken()); //html
		System.out.println(stn.nextToken()); //css
		System.out.println(stn.nextToken()); //spring
		
		System.out.println(stn.countTokens());// 0
		
		//System.out.println(stn.nextToken()); // ������ 
		//��=> NoSuchElementException ���̻� ���� ��Ұ� ����
		
		*/
		
		/* �߸��� ��� �ݺ����� ������ ����
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		} // => JDBC ������ ��µ�
		
		// j=0 j<6 true ���java j++
		// j=1 j<5 <-�ڹٰ� ����� �� �Ķ� 5�� 
		// j=2 j<4 <-�ڹٰ� ����� �� �Ķ� 4��
		// j=3 j<3 false => �ݺ��� ��������
		*/
		
		/*
		// �ذ���1.
		int count = stn.countTokens(); // count = 6
		
		for(int j=0; j<count; j++) {
			System.out.println(j + "��° �ε��� : " + stn.nextToken());
		}
		*/
		
		
		// �ذ���2.
		while(stn.hasMoreTokens()) { //hasMoreTokens()
			System.out.println(stn.nextToken());
		}
		
		
		
	}

}
