package com.kh.gitArray;

public class gitA_Array {

	public static void main(String[] args) {
		
		// 배열 : 변수와 달리 하나의 공간에 여러개의 값을 담을 수 있다.
		// 주의할점 : 같은 자료형의 값으로 담아야 함
		
		int[] arr = new int[10];
		
		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스 까지 순차적으로 접근하면서 값을 대입
		//		매번 1~100 사이에 발생되는 랜덤 값을 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] =(int)(Math.random() * 100 + 1);}
			
		// 3. 반복문을 활용해서 해달 배열의 0번 인덱스~ 마지막 인덱스 담겨있는 값 출력
		//		arr[x] : xx 형식대로 매번 출력이 되도록
		for(int i=0; i<arr.length; i++) {	
			System.out.println("arr["+i+"] : " + arr[i]);
		
			}
	}
}