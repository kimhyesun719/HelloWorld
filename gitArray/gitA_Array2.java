package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array2 {

	public static void main(String[] args) {
			
			// 1.   ����ڿ��� �迭�� ���� �Է¹��� ��
			//		�ش� �� ũ�⸸ŭ�� ���ڿ� �迭 ����
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�迭�� ����: ");
			int size = sc. nextInt();
			sc.nextLine();
			
			String[] arr = new String[size];
			
			// 2. �ݺ����� Ȱ���ؼ� �Ź� ����ڿ��� ���ϸ� �Է� �޾Ƽ� �� ���� �� �ε��� �ڸ��� ����(0��~�������ε���)
			for(int i=0; i<arr.length; i++) {
				System.out.print("�����ϴ� ���ϸ� �Է� : ");
				arr[i] = sc.nextLine();
			}
			
			//3. �ݺ����� Ȱ���ؼ� 0~������ �ε������� ��� ���� ���
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		}

	}

