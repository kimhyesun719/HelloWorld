package com.kh.practice1.example;

import java.util.Scanner;

public class VatiablePractice {
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하세요(여/남): ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(cm): ");
		double height = sc.nextDouble(); 
		
		//System.out.println("이름: " + name + "나이: " + age);
		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^ \n", height, age, gender, name);
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int b = sc.nextInt();
		
		System.out.println("더하기 결과: " + (a + b));
		System.out.println("빼기 결과: " + (a - b));		
		System.out.println("곱하기 결과: " + (a * b));
		System.out.println("나누기 몫 결과: " + (a / b));
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		double a = sc.nextDouble();
		System.out.print("세로: ");
		double b = sc.nextDouble();
		
		System.out.println("면적: " + (a*b));
		System.out.println("둘레: " + (a+b)*2);
			
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 하세요: ");
		String str = sc.nextLine();
		
		sc.nextLine();
		
		char a = str.charAt(0);
		System.out.println("첫번째 문자: " + a);
		
		char b = str.charAt(1);
		System.out.println("두번째 문자: " + b);
		
		char c = str.charAt(2);
		System.out.println("세번째 문자: " + c);
	    
	    
	    
		
	}
	
	
	
	
	

}
