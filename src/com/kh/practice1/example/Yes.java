package com.kh.practice1.example;

import java.util.Scanner;

public class Yes {
	
	public void method1() {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("�̸��� �Է��ϼ��� : ");
	      String name = sc.nextLine();
	      System.out.print("���̸� �Է��ϼ��� : ");
	      int age = sc.nextInt();
	      sc.nextLine(); // nextInt() �޼ҵ� �ڿ� nextLine() �޼ҵ尡 �� ���̱� ������ �� ���̿� ���͸� ���ۿ��� ���ִ� �۾��� ����ߵȴ�. 
	      
	      System.out.print("������ �Է��ϼ���(��/��) : ");
	      char gender = sc.nextLine().charAt(0);
	      System.out.print("Ű�� �Է��ϼ���(cm) : ");
	      double height = sc.nextDouble();
	      
	      System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^");
	   }
	   
	   public void method2() {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("ù ��° ������ �Է��ϼ��� : ");
	      int num1 = sc.nextInt();
	      System.out.print("�� ��° ������ �Է��ϼ��� : ");
	      int num2 = sc.nextInt();
	      
	      // ��� ���� ���� (*,/,%    >    +,-)
	      System.out.println("���ϱ� ��� : " + (num1 + num2));   // ��ȣ�� ���ϰ� �Ǹ� ���ڿ��� �ν��Ͽ� ���� �ΰ��� �پ ���´�.
	      System.out.println("���� ��� : " + (num1 - num2));   // ���������� ��ȣ�� ���ϰԵǸ�  '���ڿ�-����'�� �ν��Ͽ� ���� �߻�
	      System.out.println("���ϱ� ��� : " + num1 * num2);      
	      System.out.println("������ �� ��� : " + num1 / num2);
	   }
	   
	   public void method3() {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("���� : ");
	      double width = sc.nextDouble();
	      System.out.print("���� : ");
	      double height = sc.nextDouble();
	      
	      /* ������ �ѷ��� ���� ���� �� ������ ��Ƶ� �� ����ϴ� ���
	      double area = width * height;         // ���� ���ؼ� ����ϱ�
	      double perimeter = (width + height) * 2;// �ѷ� ���ؼ� ����ϱ�
	      
	      System.out.println("���� : " + area);
	      System.out.println("�ѷ� : " + perimeter);
	      */
	      
	      // �ƽθ� �ٷ� ������ �ѷ��� ���� ��� �ٷ� ����ϴ� ���
	      System.out.println("���� : " + width * height);
	      System.out.println("�ѷ� : " + (width + height) * 2);
	      
	   }
	   
	   public void method4() {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("���ڿ��� �Է��ϼ��� : ");
	      String str = sc.nextLine();
	      
	      /* ���ڿ��� ���� �� ���ڰ��� �̾Ƽ� �� char ������ ��Ƶ� �� ����ϴ� ���
	      char ch1 = str.charAt(0);
	      char ch2 = str.charAt(1);
	      char ch3 = str.charAt(2);
	      
	      System.out.println("ù ��° ���� : " + ch1);
	      System.out.println("�� ��° ���� : " + ch2);
	      System.out.println("�� ��° ���� : " + ch3);
	      */
	      
	      // �ƽθ� char������ �ȴ���ְ� �ٷ� �̾Ƽ� ����ϴ� ���
	      System.out.println("ù ��° ���� : " + str.charAt(0));
	      System.out.println("�� ��° ���� : " + str.charAt(1));
	      System.out.println("�� ��° ���� : " + str.charAt(2));
	   }

}
