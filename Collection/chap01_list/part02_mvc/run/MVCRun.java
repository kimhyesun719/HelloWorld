package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		
		/*
		 * * MVC����: �� Ŭ�������� ����(������, ȭ��, ��ûó��) �� �ο��ؼ� �۾�!
		 * 			=> �������� ���� �ϴ�!
		 * 
		 * - M(Model) : �����͸� ����ϴ� ����(�����͵��� ������� Ŭ����, 
		 * 	����Ͻ� ���� ó���ϱ� ���� Ŭ����, �����Ͱ� �����Ǿ� �ִ� �����԰� 
		 * 	�����ؼ� ����� �ϴ� Ŭ����)
		 * 
		 * - V(View) : ȭ���� ����ϴ� ���� ��, ����ڿ��� �������� �ð����� ���
		 * 	(��¹�(print��), �Է¹�(Scanner))
		 * 
		 * - C(Controller) : ����ڰ� ��û�� ������ ó���� �� �� ����� �����ִ� ����
		 * 	(��¹� ������ �� ������!!)
		 * 
		 */
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();

	}

}
