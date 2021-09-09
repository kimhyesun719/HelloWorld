package com.kh.gitControl;

import java.util.Scanner;

public class gitWhile {

	public static void main(String[] args) {
		
		// while문 : true일 경우 반복문 실행 false빠져나옴
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 하십시오: ");
		
		String a = sc.nextLine();
		
		//System.out.println("문자열의 길이: " + a.length());
		
		int i=0;
		while (i<a.length()) {
			System.out.println(a.charAt(i++));
	}
	}
}
