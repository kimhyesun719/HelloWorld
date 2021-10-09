package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnCheckedExeption;
import com.kh.exception.controller.B_CheakedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException{
		
		/*
		 * * 에러 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결안됨 =>심각한 에러
		 * - 컴파일 에러 : 소스코드 문법상 오류 => 빨간줄로 오류를 알림(개발자 실수)
		 * - 런타임 에러 : 코드 상으로 문제가 없는데 프로그램 실행 중에 발생하는 에러 (사용자의 실수 혹은 개발자의 실수)
		 * 
		 * - 논리 에러 : 문법적으로도 문제없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는것
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업
		 * 이런것들을 "예외" 라고함! => Exception
		 * 
		 * 이런 "예외"가 "발생" 했을 경우에 대비해 "처리" 하는 방법을 "예외처리" 라고함
		 * 
		 * * 예외처리를 하는 목적
		 * - 예외처리를 하지않고 그대로 예외가 발생되는 경우 프로그램이 비 정상적으로 종료 될 수 있음
		 * 
		 * * 예외처리 방법
		 * 1. try~catch문을 이용 (try~with~resourse)
		 * 2. throws를 이용(떠넘기기 == 위임)
		 * 
		 * 
		 * 
		 */
		A_UnCheckedExeption a = new A_UnCheckedExeption();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheakedException b = new B_CheakedException();
		b.method1();
		
		
	}

}
