package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array4 {

	public static void main(String[] args) {
		
		// 사용자에게 배열의 길이를 입력 받은 후 그 숫자만큼의 배열 생성
		// 1~100사이로 랜덤 정수 생성
		// 이후 이 중 홀수인 값들의 총 합을 구해줌
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 입력(정수로): ");
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
		System.out.println("홀수들의 총합: " + sum);

	}

}
