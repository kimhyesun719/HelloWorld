package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array6 {

	public static void main(String[] args) {
		
		// 사용자에게 배열 값을 입력 하게 한 후
		// 각 배열 인덱스도 직접 입력 시킨 후
		// 그 값들을 모두 합산한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int [] arr = new int [num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n총 합 : " + sum);

	}

}
