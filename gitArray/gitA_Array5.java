package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array5 {

	public static void main(String[] args) {
		
		// 월 ~ 일요일 까지의 배열을 생성 한 후
		// 사용자에게 0~6 사이 숫자를 입력 받아서
		// 맞는 요일 출력
		// 0~6이의외 숫자를 입력하는 경우 숫자를 다시 입력하라는 문구 출력
		
		String [] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num>1 && num<7) {
			System.out.println(arr[num] + "요일 입니다.");
		}else {
			System.out.println("0에서 6사이의 정수만 입력 해 주세요.");
		}

	}

}
