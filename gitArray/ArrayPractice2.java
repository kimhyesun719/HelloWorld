package com.kh.array.practice.example;

import java.util.Scanner;

public class ArrayPractice2 {
	
	public void pt1() {
		int [] arr = new int [10];
		
		for(int i=1; i<=arr.length; i++) {
			System.out.println("arr[" + i + "]: " +  i);
		}
			
	}
	
	public void pt2() {
		int [] arr = new int [10];
		
		for(int i=10; i>0; i--) {
			System.out.println("arr[" + i + "]: " +  i);
		}
	}
	
	public void pt3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 하시오: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int [] arr = new int [num];
		
		for(int i=0; i<=arr.length; i++) {
			System.out.println("arr[" + i + "]: " +  i);
		}
		
	}
	
	public void pt4() {
		String [] arr = new String [] {"사과","귤","포도","복숭아","수박"};
		
		System.out.println(arr[1]);
	}
	
	public void pt5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력 하세요: ");
		String str = sc.nextLine();
		
		System.out.print("문자를 입력 하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		char arr [] = new char [str.length()];
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			if(ch == arr[i]) {
				count ++;
			}
		}
		System.out.print(ch+" 개수 : "+ count);	
		
	}

}
