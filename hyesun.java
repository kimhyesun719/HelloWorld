package com.kh.practice;

import java.util.Scanner;

public class hyesun {
	
	public void inputTest2 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¥�� ������ ������ ǥ�� �Ͻÿ�: ");
		
		int how = sc.nextInt();
		
		System.out.print("ǥ���� ����: " + how);
		
	}
	
	public void inputTest3 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �̸���? ");
		String name = sc.nextLine();
		
		System.out.print("������ ���̴�? ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ ������?(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("���� �̸�:" + name);
		System.out.println("���� ����:" + age);
		System.out.println("���� ����: " + gender);
		
		
	
	}
	
	

}
