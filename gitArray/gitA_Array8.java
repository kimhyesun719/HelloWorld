package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array8 {

	public static void main(String[] args) {
		
		String[] chiks ={"�Ҵ�", "�Ѹ�Ŭ", "���"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ�� �Է� �ϼ���: ");
		String menu = sc.nextLine();
		
		boolean git = false;
		
		for(int i=0; i<chiks.length; i++) {
			
			if(chiks[i].equals(menu)) {
				git = true;
				break;
			}
		}
		if(git) { // git���� true�ΰ��
			System.out.println(menu + "ġŲ ��� ����");
		}else {
			System.out.println(menu + "ġŲ�� ���� �޴��Դϴ�.");
		}

	}

}
