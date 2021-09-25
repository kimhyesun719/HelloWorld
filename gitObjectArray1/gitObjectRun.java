package com.kh.gitObjectArray1;

import java.util.Scanner;

public class gitObjectRun {
	
	public static void main(String[] args) {
		
		// 객체 배열을 활용하여 gitBook 객체 생성 해 본 후
		// 도서 제목으로 검색까지 해보기
		
		Scanner sc = new Scanner(System.in);
		
		gitBook[] books = new gitBook[3];
		
		for(int i=0; i<books.length; i++) {
			System.out.println((i+1) + "번째 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사: ");
			String publisher = sc.nextLine();
			
			books[i] = new gitBook(title, author, price, publisher);
			
		}
		// 전체 도서 정보 조회
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.print("검색 할 책 제목 : ");
		String search = sc.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
	}
}
