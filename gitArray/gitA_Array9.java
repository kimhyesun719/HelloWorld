package com.kh.gitArray;

public class gitA_Array9 {

	public static void main(String[] args) {
		
		// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		// 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ
		// 3. ���
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
