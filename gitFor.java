package com.kh.hyesun;

import java.util.Scanner;

public class gitFor {

	public static void main(String[] args) {
		
		// 0부터 사용자가 입력한 값 까지의 총 합을 for문을 통해 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		int num = sc.nextInt();
		
		int sum =0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		
	}

}
