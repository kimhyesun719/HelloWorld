package com.kh.hyesun;

import java.util.Scanner;

public class gitFor {

	public static void main(String[] args) {
		
		// 0���� ����ڰ� �Է��� �� ������ �� ���� for���� ���� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		
		int sum =0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("�հ�: " + sum);
		
		
	}

}
