package com.kh.gitControl;

public class gitContinue {

	public static void main(String[] args) {
		
		// 1���� 20���� �� 3�� ����� ���� ����ϱ�
		// contunue ����-> �������� ���� ��� ��Ŵ
		
		for(int i=1; i<=20; i++) {
			if(i % 3 == 0) { // 3���� ���������� 0�� ���´� = 3�� ���
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
