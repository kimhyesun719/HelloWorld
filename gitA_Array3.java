package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array3 {

	public static void main(String[] args) {
		
		// ����ڿ��� ���ڿ��� �Է� ���� �� ���� ã���� �ϴ� ���ڰ�����
		// �迭�� �̿��Ͽ� ã�� �ֱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ�: ");
		String str = sc.nextLine();
		
		System.out.print("ã���� �ϴ� ����: ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		
		if (ch == arr[i]) {
			count ++;
		}
	}	
		
	System.out.println("ã���� ���� ���� : " + count);
		

	}

}
