package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array3 {

	public static void main(String[] args) {
		
		// 사용자에게 문자열을 입력 받은 후 그중 찾고자 하는 문자갯수를
		// 배열을 이용하여 찾아 주기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자: ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		
		if (ch == arr[i]) {
			count ++;
		}
	}	
		
	System.out.println("찾아진 문자 갯수 : " + count);
		

	}

}
