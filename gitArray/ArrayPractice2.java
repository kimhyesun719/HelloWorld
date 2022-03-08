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
		
		System.out.print("������ �Է� �Ͻÿ�: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int [] arr = new int [num];
		
		for(int i=0; i<=arr.length; i++) {
			System.out.println("arr[" + i + "]: " +  i);
		}
		
	}
	
	public void pt4() {
		String [] arr = new String [] {"���","��","����","������","����"};
		
		System.out.println(arr[1]);
	}
	
	public void pt5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է� �ϼ���: ");
		String str = sc.nextLine();
		
		System.out.print("���ڸ� �Է� �ϼ���: ");
		char ch = sc.nextLine().charAt(0);
		
		char arr [] = new char [str.length()];
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			if(ch == arr[i]) {
				count ++;
			}
		}
		System.out.print(ch+" ���� : "+ count);	
		
	}

}
