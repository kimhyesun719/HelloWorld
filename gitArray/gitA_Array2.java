package com.kh.gitArray;

import java.util.Scanner;

public class gitA_Array2 {

	public static void main(String[] args) {
			
			// 1.   사용자에게 배열의 길이 입력받은 후
			//		해당 그 크기만큼의 문자열 배열 생성
			
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 길이: ");
			int size = sc. nextInt();
			sc.nextLine();
			
			String[] arr = new String[size];
			
			// 2. 반복문을 활용해서 매번 사용자에게 과일명 입력 받아서 그 값을 매 인덱스 자리에 대입(0번~마지막인덱스)
			for(int i=0; i<arr.length; i++) {
				System.out.print("좋아하는 과일명 입력 : ");
				arr[i] = sc.nextLine();
			}
			
			//3. 반복문을 활용해서 0~마지막 인덱스까지 담긴 값들 출력
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		}

	}

