package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		//countTokens(); 토큰의 개수 확인
		//hasMoreTokens(); 토큰이 더 남아있는지 확인
		//nextToken(); 다음 토큰을 불러옴
		
		// 구분자를 기준으로 해서 문자열을 분리 시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할때
		// 		 String클래스에 제공하는split 메소드 이용
		//		  문자열.split(구분자) : String[]
		//
		
		String[] arr = str.split(",");
		
		System.out.println("배열의 길이 : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		*/
		int i = 0;
		for(String s : arr) { // s = arr[0]; => s = arr[1]; ...
			System.out.println(i + "번째 인덱스 : " +s);
			i ++;
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰으로서 관리하고자 할 때
		//		 java.util.StringTokenizer 클래스를 이용하는 방법
		//		 StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 개수 : " + stn.countTokens());
		
		/*
		
		System.out.println(stn.nextToken()); //java
		System.out.println(stn.nextToken()); //oracle
		System.out.println(stn.nextToken()); //jdbc
		
		System.out.println(stn.countTokens()); // 남은갯수3
		
		System.out.println(stn.nextToken()); //html
		System.out.println(stn.nextToken()); //css
		System.out.println(stn.nextToken()); //spring
		
		System.out.println(stn.countTokens());// 0
		
		//System.out.println(stn.nextToken()); // 오류남 
		//ㄴ=> NoSuchElementException 더이상 뽑을 요소가 없다
		
		*/
		
		/* 잘못된 방법 반복문이 세번만 돌음
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		} // => JDBC 까지만 출력됨
		
		// j=0 j<6 true 출력java j++
		// j=1 j<5 <-자바가 출력이 된 후라 5임 
		// j=2 j<4 <-자바가 출력이 된 후라 4임
		// j=3 j<3 false => 반복문 빠져나옴
		*/
		
		/*
		// 해결방법1.
		int count = stn.countTokens(); // count = 6
		
		for(int j=0; j<count; j++) {
			System.out.println(j + "번째 인덱스 : " + stn.nextToken());
		}
		*/
		
		
		// 해결방법2.
		while(stn.hasMoreTokens()) { //hasMoreTokens()
			System.out.println(stn.nextToken());
		}
		
		
		
	}

}
