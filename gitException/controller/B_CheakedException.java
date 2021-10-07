package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheakedException {
	
	/*
	 * CheakedException�� �ݵ�� ����ó���� �ؾ� �Ǵ� ���ܵ���
	 * => ���ǹ� �̸� ������ �� ����(��? ������ �Ұ��� ������ ������ �߻��ϱ� ������ �̸� ����ó�������� �ۼ� �س��ߵ�!)
	 * => �ܺ� �Ű�ü�� ������� �Ͼ �� �߻���! (IOException)
	 * 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner�� ���� Ű����� ���� �Է� ���� �� �ִ� ��ü(��, ���ڿ��� �о�鿩��)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��ĳ��ó�� �پ��� ������ ���Ұ� ������ ���ڿ��� ���
		
		System.out.print("�ƹ��ų� �Է� ���ּ���: ");
		
		// 1. try~catch �� : ���� �� �ڸ����� ��ٷ� ���ܸ� ó���ϰڴ�!!
		// try{} : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ�
		// catch(�߻��� ���� Ŭ���� �Ű�����){} : try���� ������ ���ܰ� �߻����� ��� ��� ó���Ұ����� ���� ���� �ۼ�
		
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			System.out.print("���ܹ߻�");
		}
		*/
		
		// 2. throws(������) : ���� �� �ڸ����� ���ܸ� ó������ �ʰ� ���� �� �޼ҵ带 ȣ���ϴ°����� ����ó�� ���ѱ�� �����ϱ�
		
		String str = br.readLine(); 
		// �ƿ� readLine() �޼ҵ忡�� throws IOExeption�ϰ� ����
		System.out.println(str);
		
	}
	
	/*
	 * 							���� Ŭ����			���� �߻�����		����ó�� 
	 * UnCheakedException	RuntimeException	  ��Ÿ�ӿ���		����(�ʼ��¾ƴ� /������ �ɹ��� if����� ����)
	 *  CheakedException	RuntimeException��	�����Ͽ���(������)	�ʼ�(���ǹ��ȵ� ������ ����ó�� ����)
	 * 
	 * 
	 * 
	 */
	
	
	
	
	

}
