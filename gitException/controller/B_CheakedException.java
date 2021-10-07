package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheakedException {
	
	/*
	 * CheakedException은 반드시 예외처리를 해야 되는 예외들임
	 * => 조건문 미리 제시할 수 없음(왜? 예측이 불가한 곳에서 문제가 발생하기 때문에 미리 예외처리구문을 작성 해놔야됨!)
	 * => 외부 매개체와 입출력이 일어날 때 발생됨! (IOException)
	 * 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력 받을 수 있는 객체(단, 문자열로 읽어들여짐)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스캐너처럼 다양한 변수값 사용불가 무조건 문자열로 출력
		
		System.out.print("아무거나 입력 해주세요: ");
		
		// 1. try~catch 문 : 여기 이 자리에서 곧바로 예외를 처리하겠다!!
		// try{} : 예외가 발생할 가능성이 있는 코드를 작성
		// catch(발생될 에외 클래스 매개변수){} : try구문 내에서 예외가 발생했을 경우 어떻게 처리할건지에 대한 내용 작성
		
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			System.out.print("예외발생");
		}
		*/
		
		// 2. throws(던지다) : 지금 이 자리에서 예외를 처리하지 않고 현재 이 메소드를 호출하는곳으로 예외처리 떠넘기기 위임하기
		
		String str = br.readLine(); 
		// 아예 readLine() 메소드에서 throws IOExeption하고 있음
		System.out.println(str);
		
	}
	
	/*
	 * 							예외 클래스			예외 발생시점		예외처리 
	 * UnCheakedException	RuntimeException	  런타임에러		세모(필수는아님 /개발자 케바케 if문사용 가능)
	 *  CheakedException	RuntimeException외	컴파일에러(빨간줄)	필수(조건문안됨 무조건 예외처리 구문)
	 * 
	 * 
	 * 
	 */
	
	
	
	
	

}
