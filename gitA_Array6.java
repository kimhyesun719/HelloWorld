package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array6 {

	public static void main(String[] args) {
		
		// ����ڿ��� �迭 ���� �Է� �ϰ� �� ��
		// �� �迭 �ε����� ���� �Է� ��Ų ��
		// �� ������ ��� �ջ��Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		int [] arr = new int [num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n�� �� : " + sum);

	}

}
