package com.kh.gitControl;

import java.util.Scanner;

public class gitIf {

	public static void main(String[] args) {
		
		// ����ڿ��� ������ �Է¹޾� if���� ���ؼ� 
		// 1~13�� ���� ���, 14~19������ û�ҳ�, 20�� �̻��� �������� ǥ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է� �Ͻʽÿ�(������) : ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.print("���� �Դϴ�.");
		}else if(age < 14) {
			System.out.print("��� �Դϴ�.");
		}else {
			System.out.print("û�ҳ� �Դϴ�.");
		}

	}

}
