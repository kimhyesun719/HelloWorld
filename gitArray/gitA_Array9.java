package com.kh.gitArray;

public class gitA_Array9 {

	public static void main(String[] args) {
		
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화
		// 3. 출력
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
