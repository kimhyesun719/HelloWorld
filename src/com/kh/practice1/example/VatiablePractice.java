package com.kh.practice1.example;

import java.util.Scanner;

public class VatiablePractice {
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��): ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		double height = sc.nextDouble(); 
		
		//System.out.println("�̸�: " + name + "����: " + age);
		System.out.printf("Ű %.1f�� %d�� %c�� %s�� �ݰ����ϴ�^^ \n", height, age, gender, name);
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		int a = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		int b = sc.nextInt();
		
		System.out.println("���ϱ� ���: " + (a + b));
		System.out.println("���� ���: " + (a - b));		
		System.out.println("���ϱ� ���: " + (a * b));
		System.out.println("������ �� ���: " + (a / b));
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		double a = sc.nextDouble();
		System.out.print("����: ");
		double b = sc.nextDouble();
		
		System.out.println("����: " + (a*b));
		System.out.println("�ѷ�: " + (a+b)*2);
			
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է� �ϼ���: ");
		String str = sc.nextLine();
		
		sc.nextLine();
		
		char a = str.charAt(0);
		System.out.println("ù��° ����: " + a);
		
		char b = str.charAt(1);
		System.out.println("�ι�° ����: " + b);
		
		char c = str.charAt(2);
		System.out.println("����° ����: " + c);
	    
	    
	    
		
	}
	
	
	
	
	

}
