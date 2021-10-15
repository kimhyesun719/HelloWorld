package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	/*
	 * "���� ��� ��Ʈ��" �� ������ ����� �غ���!!
	 * 
	 * - ���� ��Ʈ�� : �����͸� 2byte ������ �����ϴ� ��δ�(���� ���)
	 * - ��� ��Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ��δ�
	 * 
	 * 	XXXReader : �Է¿� ��Ʈ��
	 * 	XXXWriter : ��¿� ��Ʈ��
	 */
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ��� �� �� �ִ� ��Ʈ��
		
		FileWriter fw = null;
		try {
			// 1. FileWriter ��ü ����
			fw = new FileWriter("b_char.txt");//�ش����� ������ ���� �� ����
			
			// 2. write �޼ҵ带 �̿��ؼ� ������ ���
			//	  2byte ������ ������ ����
			fw.write("�� �װʹ�");// �����δ� �ش� ���ڿ��� ���� �ϳ��� ���۵Ǵ� ����
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(arr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 3. ��Ʈ���ݳ�
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// FileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է¹޴� ��Ʈ��
		
		FileReader fr = null;
		try {
			// 1. FileReader ��ü ����
			fr = new FileReader("b_char.txt");
			
			// 2. read �޼ҵ� �̿��ؼ� �о������(������)
			//		������ ���� ������ ���� -1��ȯ
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
