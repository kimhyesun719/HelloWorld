package com.kh.gitObjectArray1;

import java.util.Scanner;

public class gitObjectRun {
	
	public static void main(String[] args) {
		
		// ��ü �迭�� Ȱ���Ͽ� gitBook ��ü ���� �� �� ��
		// ���� �������� �˻����� �غ���
		
		Scanner sc = new Scanner(System.in);
		
		gitBook[] books = new gitBook[3];
		
		for(int i=0; i<books.length; i++) {
			System.out.println((i+1) + "��° ���� ���� �Է�");
			
			System.out.print("������ : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("����: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("���ǻ�: ");
			String publisher = sc.nextLine();
			
			books[i] = new gitBook(title, author, price, publisher);
			
		}
		// ��ü ���� ���� ��ȸ
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.print("�˻� �� å ���� : ");
		String search = sc.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
	}
}
