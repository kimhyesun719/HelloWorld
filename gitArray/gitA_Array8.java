package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array8 {

	public static void main(String[] args) {
		
		String[] chiks ={"불닭", "뿌링클", "양념"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨을 입력 하세요: ");
		String menu = sc.nextLine();
		
		boolean git = false;
		
		for(int i=0; i<chiks.length; i++) {
			
			if(chiks[i].equals(menu)) {
				git = true;
				break;
			}
		}
		if(git) { // git값이 true인경우
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}

	}

}
