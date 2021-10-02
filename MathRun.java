package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		
		// java.lang.Math
		
		// ����ʵ�
		System.out.println("���� : " + Math.PI);
		
		// ���밪�� �˰��� �� �� : abs
		int num1 = -10;
		System.out.println("���밪: " + Math.abs(num1));
		
		// �ø� : ceil
		double num2 = 4.349;
		System.out.println("�ø�: " + /*(int)*/Math.ceil(num2));
		
		// �ݿø� : round
		System.out.println("�ݿø�: " + Math.round(num2));
		
		// ���� : floor
		System.out.println("����: " + Math.floor(num2));
		
		// ���� ����� �������� �˾Ƴ� �� �Ǽ��� ��ȯ : rint
		System.out.println("���� ����� ������: " + Math.rint(num2));
		
		// ������(��Ʈ) : sqrt
		System.out.println("4�� ������ : " + Math.sqrt(4));
		
		// ���� : pow
		System.out.println("2�� 10����: " + Math.pow(2, 10));
		
		//Math m = new Math();
		
		/*
		 * * Math Ư¡
		 * - ����ʵ� ����ʵ�, ��� �޼ҵ� static �޼ҵ�!!(��static��)
		 * - ������ �ƿ� private���� �Ǿ�����!! => �����Ұ��ϵ���
		 * 
		 * ** �ѹ��� �޸� ������ �÷����� �����ϴ� ���� => �̱�������
		 * 
		 * 
		 */
		
	}

}
