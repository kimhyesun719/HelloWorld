package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array7 {

	public static void main(String[] args) {
		
		// 3�̻��� Ȧ�� �ڿ��� �Է¹޾� �迭�� �߰������� 1���� 1�� ��������
		// �߰������� 1�� ��������
		// �Է� ���� Ȧ���� 3�̸��ϰ�� �ٽ� �Է��ϼ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("3�̻� Ȧ�� �ڿ����� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		
		if (num >= 3 && num % 2 ==1) {
			int[] arr = new int[num];
			
			int value = 1;
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = value;
				
				if(i < arr.length / 2) {
					value++;
				}else {
					value--;
				}
			}
			
			for(int i=0; i<arr.length; i++) {
				if (i < arr.length-1) {
					System.out.print(arr[i] + ", ");
				}else {
					System.out.println(arr[i]);
				}
			}
			
			break;
			
		}else {
			System.out.println("�ٽ� �Է� �� �ּ���.");
		}
		
		}
	}
}
