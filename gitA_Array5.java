package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array5 {

	public static void main(String[] args) {
		
		// �� ~ �Ͽ��� ������ �迭�� ���� �� ��
		// ����ڿ��� 0~6 ���� ���ڸ� �Է� �޾Ƽ�
		// �´� ���� ���
		// 0~6���ǿ� ���ڸ� �Է��ϴ� ��� ���ڸ� �ٽ� �Է��϶�� ���� ���
		
		String [] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if (num>1 && num<7) {
			System.out.println(arr[num] + "���� �Դϴ�.");
		}else {
			System.out.println("0���� 6������ ������ �Է� �� �ּ���.");
		}

	}

}
