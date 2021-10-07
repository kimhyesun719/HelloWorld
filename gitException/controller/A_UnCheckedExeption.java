package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedExeption {
	
	/*
	 * * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근 할 때 발생하는 예외
	 * - NullpointerException : 참조변수가 null로 초기화된 상태에서 접근했을 때 발생되는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
	 * - ClassCastException : 허용 할 수 없는 형변환이 진행 될 때 발생되는 예외 
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * 
	 * => RuntimeException관련된 예외는 충분히 예측 가능한 상황에 있다
	 * 		애초에 예외 자체가 발생이 안되게끔 if문 조건처리 가능
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1 () {
		// ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2;
		// 사용자가 두번째 정수를 0으로 입력하는 순간 예외 발생 => 비정상적 프로그램 종료
		
		// 애초에 예외 자체가 발생이 안되게끔 if문으로 조건 검사 => 예외처리 아님!!
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2; // 실행되지 않을시 결과0으로 출력 (초기화값)
		}
		
		System.out.println("ㅎㅇㄹ~ 당신의 결과를 알려주겠음");
		System.out.println("result : " + result);
		*/
		
		// 예외처리로 해결하는 방법
		// 예외 처리 : 예외가 "발생했을때" 실행할 내용을 미리 작성해 놓는 방법
		/*
		 * * try catch 방법
		 * try {
		 * 		예외가 발생 될 수 있는 구문;
		 * }catch(발생될 예외 클래스 매개변수) {
		 * 		해당 예외가 발생 됐을 경우 실행할 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			e.printStackTrace(); // 강제로 오류난 이력을 보고자 할 때 실행하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void method2() {
		// NegativeArraySizeException 
		// 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
		// ArrayIndexOutOfBoundsException :
		// 배열에 부적절한 인덱스로 제시하면서 접근했을 때 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		/*
		if(size >= 101) {
			int [] arr = new int [size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("양수입력해");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("101이상 입력해");
		}
		// 다중 catch블럭 작성 가능
		
		System.out.println("ㅂㅂ2");
		
	}
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("양수입력해");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("101이상 입력해");
		}catch(InputMismatchException e) { //import필요
			System.out.println("숫자만 입력해");
		}
		*/
		
		/*
		try {

			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);

		} catch (RuntimeException e) {// 다형성 적용해서 부모타입 예외 클래스 작성가능
									  // 모든자식예외 다 처리가능
			System.out.println("배열의 크기 잘못됨, 부적절한 인덱스가 제시됐어, 정수가 아닌걸 입력했어 셋중 하나야~!");
		}
		// 각각의 예외 발생시 실행할 내용이 별개일 경우 세분화해서 다중catch블럭으로 기술하는게 적절하다
		*/
		
		try {

			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);

		}catch(InputMismatchException e) { //위RuntimeException가 있기 때문에 실행되지 않을거란 경고문구 발생
			// 부모타입보다 앞에 기술하면 오류 발생하지 않음
			System.out.println("숫자만 입력해");
		} catch (RuntimeException e) {
			System.out.println("배열의 크기 잘못됨, 부적절한 인덱스가 제시됐어 둘중 하나야~!");
		}
		// 부모예외 클래스와 자식 예외 클래스를 catch블로으로 사용할땐
		// 자식클래스가 부모클래스 위에 있어야함(아닐시 unreachable catch block뜸)
		
		System.out.println("ㅂㅂ2");
		
	}
	
	/*
	 * * RuntimeException 관련 애들은 UnCheackedException(예외처리구문 필수아님)
	 * 	 if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링 하는거 (예외처리구문 아님)
	 * 	 try-catch문 : 예외가 "발생" 했을 경우 처리해 주는 구문(예외처리 구문 맞음)
	 * 
	 * 	 예측 가능한 상황은if문으로 조건검사로 해결하는게 권장 사항임
	 * 	 부득이 하게 조건문으로 핸들링 안되는 구문 예외처리구문으로 작성해둘것!!
	 * 
	 */
	
	
	
}
