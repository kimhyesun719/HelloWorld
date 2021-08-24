package com.kh.variable;

public class A_Variable {

	// �ñް� �ٹ��ð��� �ٹ��ϼ��� ���ؼ� ������ ����ؼ� ����ϴ� �޼ҵ�(���α׷�)
	public void printVariable() {
		
		System.out.println("==== ���� ��� �� ====");
		
		System.out.println("�ñ� : 9450��");
		System.out.println("�ٹ��ð� : 6�ð�");
		System.out.println("�ٹ��ϼ� : 8��");
		
		// ���� = �ñ� x �ٹ��ð� x �ٹ��ϼ�
		// �谩�� : 000000�� �������� ���
		System.out.println("�谩�� : " + (9450 * 6 * 8) + "��");
		System.out.println("���ƿ�: " + (9450 * 6 * 8) + "��");
		System.out.println("������ : " + (9450 * 6 * 8) + "��");
		System.out.println("��ä�� : " + (9450 * 6 * 8) + "��");
		System.out.println("���� : " + (9450 * 6 * 8) + "��");// �ڹٿ��� ������ * ��ȣ�� ��Ÿ����.
		
		//���� ��� ��
		System.out.println("==== ���� ��� �� ====");
		
		int pay = 9450; // �ڹٿ��� =��ȣ�� �����ϴ� ���� �ƴ϶� 8500�̶�� ���� pay��� ���ڿ� �ְڴ� ��, �����ϰڴ� ��� �ǹ�
		int time = 8;
		int day = 20;
		
		System.out.println("������ : " + (pay * time * day) + "��");
		System.out.println("���ƿ� : " + (pay * time * day) + "��");
		System.out.println("���� : " + (pay * time * day) + "��");
		
		/*
		 * ������ ����ϴ� ����
		 * 1.������ �켱������ ���� �ǹ̸� �ο��� �������� ��� ()
		 * 2. �� �ѹ� ���� ����ϰ� �ʿ��� ������ ������ ���� �������� ����. (���뼺�� ��������.)
		 * 3.���������� ���� ���� �� �� �ִ�.
		 */
		System.out.println("�ñ���?" + pay );
	}
	
	// ������ ����
	public void declareVariable() {
		
		/*
		 * ������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ Ȯ��, �Ҵ��Ѵ�. => ��, ���� �����ϱ� ���� ���ڸ� ����ڴ�.
		 * 
		 * [ǥ����] �ڷ��� �����̸�;
		 * 
		 * �ڷ��� : ������ ũ�� �� ����� �������ִ� �κ�
		 * �����̸� : ������ �̸��� �ٿ��ִ� �κ� (�ǹ̺ο�!)
		 * 
		 * ���� ���� �� ���� �� ��
		 * 1. ���� �̸��� �ҹ��ڷ� ���� / ��, ��Ÿ�� ǥ��� ��ų��/ ������ �Ұ�
		 * 2. ���� ���� �� ({}) ������ ������ ���������� ���� �Ұ� => ��, �ߺ��� �Ұ�����
		 * 3. �ش� ���� �� ({}) ���� ����� ������ �� ���� �ȿ����� ��� ����
		 *  => �ٸ� �޼ҵ忡���� ����� �Ұ��ϴ�!
		 * 
		 */
		
		// ----- �ڷ����� ���� ���� -----
		// 1. ���� (����= true / false)
		boolean isTrue;
		boolean isFalse = true; // 1byte
		System.out.println("isFalse�� ���ο� ���� ���� ��: " + isFalse);
	
		
		isTrue = 1 + 3 < 1; // false
		
		isTrue = true; // 3 + 1 > 1 => 4�� 1���� Ů�ϱ�? �� (true)
		isFalse = false; // 4 + 2 < 1 => 6���� 1�� Ů�ϱ�? ���� (false)
		
		// 2. ������
		// 2_1. ������(�Ҽ��� ��)
		byte bNum; // 1byte (-128~127)
		bNum = -128;
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte
		
		long lNum = 100000; // 8byte
		
		// 2_2. �Ǽ��� (�Ҽ��� ��)
		float fNum = 0.0f; // 4byte => �Ҽ��� 7�ڸ����� ����
						   // float�� ��� double�� ���� �����ϱ� ���� �� �ڿ� f�� �ٿ��ش�.
		
		double dNum = 0.0; // 8byte => �Ҽ��� 15�ڸ����� ����, �Ǽ����� �⺻ �ڷ���
		
		// 3. ������
		// 3_1. ����
		char ch = 'a'; // 2byte 
		char kim;
		kim = '��';
		
		// 3_2. ���ڿ�
		String str; // ������
		str = "abc";
		
		// ���� �� ������ Ȯ���غ���!
		System.out.println(isTrue);
		System.out.println("isFalse�� ���ο� ���� ���� ��: " + isFalse);
		System.out.println(bNum);
		//System.out.println(-128);
		
		// �����̸�: �� �� ���·� ����ϰ� �ʹ�~
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("kim : " + kim);
		System.out.println("str : " + str);
	
		// ����� ����!
		// [ǥ����] final �ڷ��� ����̸�;
		final int AGE; // ����̸��� ��� �빮�ڷ� ���´�!
		AGE = 10; // �ʱ�ȭ
		
		System.out.println("AGE : " + AGE);
		
		// AGE = 11;
		
		System.out.println("AGE : " + (AGE * AGE));
		
		// ��ǥ���� ����� �� : 3.14 (����, ������) �� ���� ������ �Һ��� ���� ǥ�ÿ� ����
		System.out.println("����: " + Math.PI);
		
		// ���� 
		int etc = 999_999_999;
		
		System.out.println("etc : " + etc);
		
		//* ������� ��Ģ
		int number;
		
		// 1) ���� ���� ������ �ߺ��� �̸� �ȵ�
		//int number;
		//��ҹ��ڴ� ����
		int numBer;
		
		// 2) �����(�̹� �ڹٿ��� ���ǰ� �ִ� Ű����)��� �ȵ�
		/*
		int true;
		int abstract;
		int class;
		int static;
		int public;
		*/
		
		// 3) ���� ��밡�� �ϳ� ���ڷ� ���� �� �� ����.
		int number1;
		int num1ber;
		//int 1number;
		
		// 4) Ư�����ڴ� _,$�� ��밡��
		int number_1;
		int _number;
		int number$1;
		//int number!1;
		//int number#1;
		
		// �������! (������ �ȳ��� ���Ѿ� �ϴ� ��)
		// 1) ��Ÿ ǥ��� ��ų��
		String username; //���ʻ� Ʋ��
		String userName; //���ʻ� ����
		String userNameTest;
		
		// 2) �ѱ� ��� �����ϳ� ������ �������� ������
		int ����; //�ѱ� ������� �ʴ� ȯ�濡�� ���� �߻� ���ɼ� ��
		int userAge;
		
	}
	
	/*
	 *  **����**
	 * = ��(���ͷ�) : ���α׷��� �ʿ��� ������� ��
	 * 				�Ǵ� ����ڰ� ���콺 �Ǵ� Ű����� �Է��� ��
	 * - ���� : ���� �����ϱ� ���� ����(�޸𸮻� ���� ����ϱ� ���� ����)
	 * 
	 */
	
	
}
