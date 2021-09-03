package com.kh.hyesun;

import java.util.Scanner;

public class gitTriple {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.print("정수값 입력 : ");
			int num = sc.nextInt();
			
			String result = (num > 0 ? "양수이다" : (num == 0 ? "0이다" : "음수이다"));
			
			System.out.println(result);
			
		}

	}


