package com.kh.gitControl;

public class gitContinue {

	public static void main(String[] args) {
		
		// 1부터 20까지 중 3의 배수만 빼고 출력하기
		// contunue 구문-> 위에값을 빼고 출력 시킴
		
		for(int i=1; i<=20; i++) {
			if(i % 3 == 0) { // 3으로 나누었을때 0이 나온다 = 3의 배수
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
