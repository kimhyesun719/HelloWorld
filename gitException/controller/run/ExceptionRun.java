package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnCheckedExeption;
import com.kh.exception.controller.B_CheakedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException{
		
		/*
		 * * ���� ����
		 * - �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� => �ҽ��ڵ�� �ذ�ȵ� =>�ɰ��� ����
		 * - ������ ���� : �ҽ��ڵ� ������ ���� => �����ٷ� ������ �˸�(������ �Ǽ�)
		 * - ��Ÿ�� ���� : �ڵ� ������ ������ ���µ� ���α׷� ���� �߿� �߻��ϴ� ���� (������� �Ǽ� Ȥ�� �������� �Ǽ�)
		 * 
		 * - �� ���� : ���������ε� �������� �������� ���� ���� ������ ������ ���α׷� �ǵ��� ���� �ʴ°�
		 * 
		 * �ý��� ������ ������ ������ ����, ��Ÿ�� ����, �������� ���� ���� �� �ɰ��� �͵��� ������ �۾�
		 * �̷��͵��� "����" �����! => Exception
		 * 
		 * �̷� "����"�� "�߻�" ���� ��쿡 ����� "ó��" �ϴ� ����� "����ó��" �����
		 * 
		 * * ����ó���� �ϴ� ����
		 * - ����ó���� �����ʰ� �״�� ���ܰ� �߻��Ǵ� ��� ���α׷��� �� ���������� ���� �� �� ����
		 * 
		 * * ����ó�� ���
		 * 1. try~catch���� �̿� (try~with~resourse)
		 * 2. throws�� �̿�(���ѱ�� == ����)
		 * 
		 * 
		 * 
		 */
		A_UnCheckedExeption a = new A_UnCheckedExeption();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheakedException b = new B_CheakedException();
		b.method1();
		
		
	}

}
