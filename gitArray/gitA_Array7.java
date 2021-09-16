package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array7 {

	public static void main(String[] args) {
		
		// 3이상인 홀수 자연수 입력받아 배열의 중간까지는 1부터 1씩 오름차순
		// 중간까지는 1씩 내림차순
		// 입력 값이 홀수나 3미만일경우 다시 입력하세요 출력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("3이상 홀수 자연수를 입력 하세요 : ");
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
			System.out.println("다시 입력 해 주세요.");
		}
		
		}
	}
}
