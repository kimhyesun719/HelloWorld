package com.kh.hyesun;

import java.util.Scanner;

public class gitOperatorPractice {

	public static void main(String[] args) {
		
		System.out.print("정수를 입력 하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수" : "양수가 아님" );
		

	}

}
