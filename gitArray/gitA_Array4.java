package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array4 {

	public static void main(String[] args) {
		
		// ����ڿ��� �迭�� ���̸� �Է� ���� �� �� ���ڸ�ŭ�� �迭 ����
		// 1~100���̷� ���� ���� ����
		// ���� �� �� Ȧ���� ������ �� ���� ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ���� �Է�(������): ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			if(arr[i] %2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println("Ȧ������ ����: " + sum);

	}

}
