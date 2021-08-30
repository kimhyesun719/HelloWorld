package com.kh.practice;

import java.util.Scanner;

public class hyesun {
	
	public void inputTest2 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("짜증 지수를 정수로 표현 하시오: ");
		
		int how = sc.nextInt();
		
		System.out.print("표현된 숫자: " + how);
		
	}
	
	public void inputTest3 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("강쥐의 이름은? ");
		String name = sc.nextLine();
		
		System.out.print("강쥐의 나이는? ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("강쥐의 성별은?(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("강쥐 이름:" + name);
		System.out.println("강쥐 나이:" + age);
		System.out.println("강쥐 성별: " + gender);
		
		
	
	}
	
	

}
