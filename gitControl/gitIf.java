package com.kh.gitControl;

import java.util.Scanner;

public class gitIf {

	public static void main(String[] args) {
		
		// 사용자에게 정수를 입력받아 if문을 통해서 
		// 1~13세 까진 어린이, 14~19세까진 청소년, 20세 이상은 성인으로 표시하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력 하십시오(정수만) : ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.print("성인 입니다.");
		}else if(age < 14) {
			System.out.print("어린이 입니다.");
		}else {
			System.out.print("청소년 입니다.");
		}

	}

}
