package com.kh.variable;

import java.util.Scanner;

// ����ڰ� Ű����� �Է��� ���� �޾Ƶ��̴� Scanner �Ǳ�
public class B_KeyboardInput {
	
	public void inputTest1() {
		
	/*
	 * Ű����� ���� �Է��ϴ� ���
	 * Scanner �� ����Ѵ�!
	 * (�� java.util.Scanner Ŭ������ �̿��ϴ� ���̴�!)
	 * Scanner Ŭ���� ������ �޼ҵ带 ȣ���Ͽ� �Է¹޴°�.
	 */
		
		// ��ĳ�� Ŭ������ ��ü ����
		Scanner sc = new Scanner(System.in);
		// System.in �� �Է¹��� ���� ����Ʈ ������ �޾Ƶ��̰ڴٴ� �ǹ�
		// ��� �ÿ��� System.out �̶�� ������ �����!
		
		System.out.println("�ƹ��ų� �Է��ϼ��� : ");
		String amuguna = sc. nextLine();
		
		System.out.println("�Է¹��� ����: " + amuguna);

	}
	
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����ΰ��� : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� (next(), nextLine())
		//String name = sc.next();
		// next() : ����ڰ� �Է��� ���� ������ ������� ���� ���� ���� �о��
		// 			(���� ������,Ư¡ ����� ������ ������ ���� �� �ֱ� ������ ���� ����� �������� �� �� ����)
		
		String name = sc.nextLine();
		// nextLine() : ����ڰ� �Է��� �� ��θ� �о��(���� �������� ����)
		
		System.out.print("����� ���̴� ����Դϱ� : ");
		int age = sc.nextInt();  //���� �Է� �޼ҵ�
		
		System.out.print("����� Ű�� ���ΰ���(�Ҽ��� ù° �ڸ�����): ");
		double height = sc.nextDouble(); // �Ǽ� ǥ�� �޼ҵ�
		
		// xxx���� xx���̸�, Ű�� xxx.x cm�Դϴ�.
		System.out.println(name + "����" + age + " �� �̸�," + height + " cm �Դϴ�.");
		
	}
	// Ű����� ���� �Է� ���� �� ���� �߻��Ǵ� ����
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		// ���ۿ� �����ִ� ���͸� ����ִ� �ڵ� �߰�
		sc.nextLine();
		// ��� : sc.nextXXX() �޼ҵ� �ڿ� sc.ncxtLine() �޼ҵ尡 ���� �ȴٸ� '����'�� �����ִ� ������ �ʼ��̴�.
	
		System.out.print("�ּ�: ");
		String address = sc.nextLine();
		
		System.out.print("Ű: ");
		double height = sc.nextDouble();
		
		// xxx���� xx���̸�, ��°��� xxxxxx�̰�, Ű�� xxx.x cm �Դϴ�.
		//System.out.println(name + " ����" + age + "�� �̸�" + " ��°���" + address + " �̰�," + " Ű��" + height + " cm �Դϴ�." );
		System.out.printf("%s���� %d���̸�, ��°��� %s�̰�, Ű�� %.1f cm �Դϴ�.", name, age, address, height);
		
		
	}
	public void inputTest4 () {
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է� ������ => sc.nextLine()
		// �������� �Է� ������ => sc.nextInt()
		// �Ǽ����� �Է� ������ => sc.nextDouble()
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		//char gender = sc.nextChar(); //nextChar�� ���� �޼ҵ�� �������� �ʱ� ������ ������
		char gender = sc.nextLine().charAt(0);
		// ���ڿ�.charAt(�ε���) : �ش� ���ڿ��κ��� �ش� �ε����� ���ڸ� �������ִ� �޼ҵ�
		//** �ε��� : ���� ���� ����. ��, 0���� ������!!
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		Double height = sc.nextDouble();
		
		System.out.println (name + "���� ���� ����"); 
		System.out.println ("����: " + gender);
		System.out.println ("����" + age);
		System.out.println ("Ű" + height);
			
	}
	
	public void charAtTest() {
		String str = "Hello";
		// 			  01234
		char ch = str.charAt(0);
		System.out.println(ch);
		
		System.out.println(str.charAt(4));
		
		//System.out.println(str.charAt(10)); // StringIndexoutofBoundsException�߻� ���� �������� ������ ���� ����
			
	}
	
	/*
	 * **����**
	 * 1. �ܼ�â (�����)�� ����ϱ� ����: System.out.print[ln]() �޼ҵ� �̿�
	 * 2. �ܼ�â (Ű����)�� �Է¹ޱ� ����: Scanner �̿��ؼ� (nextLine(), next(), nextInt(), nextDouble() ...)
	 * 
	 * 		>���ǻ���
	 * 		1) sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 �;� �� ���
	 * 			sc.nextLine() �޼ҵ带 �ѹ� �� ���༭ ���ۿ� �����ִ� '����'�� ���ִ� ���� �ʼ�!!
	 * 		2) '����' ���� �Է� �޾ƾ� �� ���
	 * 			sc.nextLine() �޼ҵ带 ���� �켱 ���ڿ��� �Է¹ް� �� �ڿ� .charAt(�ε���) �޼ҵ带 ���ؼ� ���� �ϳ� ����
	 * 
	 */
		
}
