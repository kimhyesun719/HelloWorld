package com.kh.gitControl;

import java.util.Scanner;

public class gitBreak {

	public static void main(String[] args) {
		// 사용자에게 문자열을 입력받아 "나가기" 일 경우 반복문 빠져 나가기
		// "나가기" 가 아닐경우 문자열의 길이 출력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력 하시오 : ");
			String str = sc.nextLine();
			
			if(str.equals("나가기")) {
				break;
			}else {
				System.out.println(str.length());
			}
		}
		System.out.println("시스템을 종료 하겠습니다.");
	}

}
