package com.kh.hyesun;

import java.util.Scanner;

public class gitSwitch {

	public static void main(String[] args) {
		
		// ���� �ϰ��� �ϴ� ���ڸ� �Է� �޾Ƽ� switch������ ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϰ��� �ϴ� ����(��īĨ, ����Ĩ, ��Ϲ���Ĩ) �Է� : ");
		String snack = sc.nextLine();
		
		int price = 0;
		
		switch(snack) {
		case "��īĨ" : price = 2000; break; //�´°� ����� �극��ũ�� �ڿ� ���� ����� ������
		case "����Ĩ" : price = 1500; break;
		case "��Ϲ���Ĩ" : price = 1000; break;
		default : System.out.println("���ÿ� �����ִ� ���ڸ� �Է� �� �ּ���.");
		}
		
		System.out.println(snack + "�� ������" + price + "�� �Դϴ�.");

	}

}
