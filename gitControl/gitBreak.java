package com.kh.gitControl;

import java.util.Scanner;

public class gitBreak {

	public static void main(String[] args) {
		// ����ڿ��� ���ڿ��� �Է¹޾� "������" �� ��� �ݺ��� ���� ������
		// "������" �� �ƴҰ�� ���ڿ��� ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ��� �Է� �Ͻÿ� : ");
			String str = sc.nextLine();
			
			if(str.equals("������")) {
				break;
			}else {
				System.out.println(str.length());
			}
		}
		System.out.println("�ý����� ���� �ϰڽ��ϴ�.");
	}

}
