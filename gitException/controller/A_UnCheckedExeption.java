package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedExeption {
	
	/*
	 * * RuntimeException
	 * - ���α׷� ����� �߻��Ǵ� ���ܵ�
	 * 
	 * * RuntimeException�� �ļյ�
	 * - IndexOutOfBoundsException : �������� �ε����� ������ ���� �� �� �߻��ϴ� ����
	 * - NullpointerException : ���������� null�� �ʱ�ȭ�� ���¿��� �������� �� �߻��Ǵ� ����
	 * - ArithmeticException : ������ ����� 0���� ������ �� �߻��Ǵ� ����
	 * - ClassCastException : ��� �� �� ���� ����ȯ�� ���� �� �� �߻��Ǵ� ���� 
	 * - NegativeArraySizeException : �迭 �Ҵ� �������� �迭�� ũ�⸦ ������ �����ϴ� ��� �߻��Ǵ� ����
	 * 
	 * => RuntimeException���õ� ���ܴ� ����� ���� ������ ��Ȳ�� �ִ�
	 * 		���ʿ� ���� ��ü�� �߻��� �ȵǰԲ� if�� ����ó�� ����
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1 () {
		// ArithmeticException : ������ ����� 0���� ������ �� �߻��Ǵ� ����
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2;
		// ����ڰ� �ι�° ������ 0���� �Է��ϴ� ���� ���� �߻� => �������� ���α׷� ����
		
		// ���ʿ� ���� ��ü�� �߻��� �ȵǰԲ� if������ ���� �˻� => ����ó�� �ƴ�!!
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2; // ������� ������ ���0���� ��� (�ʱ�ȭ��)
		}
		
		System.out.println("������~ ����� ����� �˷��ְ���");
		System.out.println("result : " + result);
		*/
		
		// ����ó���� �ذ��ϴ� ���
		// ���� ó�� : ���ܰ� "�߻�������" ������ ������ �̸� �ۼ��� ���� ���
		/*
		 * * try catch ���
		 * try {
		 * 		���ܰ� �߻� �� �� �ִ� ����;
		 * }catch(�߻��� ���� Ŭ���� �Ű�����) {
		 * 		�ش� ���ܰ� �߻� ���� ��� ������ ����;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
			e.printStackTrace(); // ������ ������ �̷��� ������ �� �� �����ϴ� ����
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void method2() {
		// NegativeArraySizeException 
		// �迭 �Ҵ� �������� �迭�� ũ�⸦ ������ �����ϴ� ��� �߻��Ǵ� ����
		// ArrayIndexOutOfBoundsException :
		// �迭�� �������� �ε����� �����ϸ鼭 �������� �� �߻��Ǵ� ����
		
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		
		/*
		if(size >= 101) {
			int [] arr = new int [size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("����Է���");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("101�̻� �Է���");
		}
		// ���� catch�� �ۼ� ����
		
		System.out.println("����2");
		
	}
	public void method3() {
		
		System.out.print("�迭�� ũ�� : ");
		
		/*
		try {
			
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("����Է���");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("101�̻� �Է���");
		}catch(InputMismatchException e) { //import�ʿ�
			System.out.println("���ڸ� �Է���");
		}
		*/
		
		/*
		try {

			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);

		} catch (RuntimeException e) {// ������ �����ؼ� �θ�Ÿ�� ���� Ŭ���� �ۼ�����
									  // ����ڽĿ��� �� ó������
			System.out.println("�迭�� ũ�� �߸���, �������� �ε����� ���õƾ�, ������ �ƴѰ� �Է��߾� ���� �ϳ���~!");
		}
		// ������ ���� �߻��� ������ ������ ������ ��� ����ȭ�ؼ� ����catch������ ����ϴ°� �����ϴ�
		*/
		
		try {

			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);

		}catch(InputMismatchException e) { //��RuntimeException�� �ֱ� ������ ������� �����Ŷ� ����� �߻�
			// �θ�Ÿ�Ժ��� �տ� ����ϸ� ���� �߻����� ����
			System.out.println("���ڸ� �Է���");
		} catch (RuntimeException e) {
			System.out.println("�迭�� ũ�� �߸���, �������� �ε����� ���õƾ� ���� �ϳ���~!");
		}
		// �θ𿹿� Ŭ������ �ڽ� ���� Ŭ������ catch������� ����Ҷ�
		// �ڽ�Ŭ������ �θ�Ŭ���� ���� �־����(�ƴҽ� unreachable catch block��)
		
		System.out.println("����2");
		
	}
	
	/*
	 * * RuntimeException ���� �ֵ��� UnCheackedException(����ó������ �ʼ��ƴ�)
	 * 	 if�� : ���ʿ� ������ü�� �߻��Ǳ� ���� �ҽ��ڵ�� �ڵ鸵 �ϴ°� (����ó������ �ƴ�)
	 * 	 try-catch�� : ���ܰ� "�߻�" ���� ��� ó���� �ִ� ����(����ó�� ���� ����)
	 * 
	 * 	 ���� ������ ��Ȳ��if������ ���ǰ˻�� �ذ��ϴ°� ���� ������
	 * 	 �ε��� �ϰ� ���ǹ����� �ڵ鸵 �ȵǴ� ���� ����ó���������� �ۼ��صѰ�!!
	 * 
	 */
	
	
	
}
