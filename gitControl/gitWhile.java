package com.kh.gitControl;

import java.util.Scanner;

public class gitWhile {

	public static void main(String[] args) {
		
		// while�� : true�� ��� �ݺ��� ���� false��������
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� �Ͻʽÿ�: ");
		
		String a = sc.nextLine();
		
		//System.out.println("���ڿ��� ����: " + a.length());
		
		int i=0;
		while (i<a.length()) {
			System.out.println(a.charAt(i++));
	}
	}
}
