package com.kh.variable;

public class A_Variable {

	// 시급과 근무시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드(프로그램)
	public void printVariable() {
		
		System.out.println("==== 변수 사용 전 ====");
		
		System.out.println("시급 : 9450원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 김갑생 : 000000원 형식으로 출력
		System.out.println("김갑생 : " + (9450 * 6 * 8) + "원");
		System.out.println("윤아영: " + (9450 * 6 * 8) + "원");
		System.out.println("김혜선 : " + (9450 * 6 * 8) + "원");
		System.out.println("이채연 : " + (9450 * 6 * 8) + "원");
		System.out.println("보미 : " + (9450 * 6 * 8) + "원");// 자바에서 곱셈은 * 기호로 나타낸다.
		
		//변수 사용 후
		System.out.println("==== 변수 사용 후 ====");
		
		int pay = 9450; // 자바에서 =기호는 동등하단 뜻이 아니라 8500이라는 값을 pay라는 상자에 넣겠다 즉, 대입하겠다 라는 의미
		int time = 8;
		int day = 20;
		
		System.out.println("김혜선 : " + (pay * time * day) + "원");
		System.out.println("윤아영 : " + (pay * time * day) + "원");
		System.out.println("보미 : " + (pay * time * day) + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1.변수는 우선적으로 값에 의미를 부여할 목적으로 사용 ()
		 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다. (재사용성이 높아진다.)
		 * 3.유지보수를 보다 쉽게 할 수 있다.
		 */
		System.out.println("시급은?" + pay );
	}
	
	// 변수의 선언
	public void declareVariable() {
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. => 즉, 값을 보관하기 위한 상자를 만들겠다.
		 * 
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분 (의미부여!)
		 * 
		 * 변수 선언 시 주의 할 점
		 * 1. 변수 이름은 소문자로 시작 / 단, 낙타봉 표기법 지킬것/ 예약어는 불가
		 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가 => 즉, 중복이 불가능함
		 * 3. 해당 영역 안 ({}) 에서 선언된 변수는 그 영역 안에서만 사용 가능
		 *  => 다른 메소드에서는 사용이 불가하다!
		 * 
		 */
		
		// ----- 자료형에 대한 개념 -----
		// 1. 논리형 (논리값= true / false)
		boolean isTrue;
		boolean isFalse = true; // 1byte
		System.out.println("isFalse에 새로운 값을 대입 전: " + isFalse);
	
		
		isTrue = 1 + 3 < 1; // false
		
		isTrue = true; // 3 + 1 > 1 => 4는 1보다 큽니까? 참 (true)
		isFalse = false; // 4 + 2 < 1 => 6보다 1이 큽니까? 거짓 (false)
		
		// 2. 숫자형
		// 2_1. 정수형(소수점 없)
		byte bNum; // 1byte (-128~127)
		bNum = -128;
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte
		
		long lNum = 100000; // 8byte
		
		// 2_2. 실수형 (소수점 있)
		float fNum = 0.0f; // 4byte => 소숫점 7자리까지 가능
						   // float의 경우 double과 값을 구분하기 위해 값 뒤에 f를 붙여준다.
		
		double dNum = 0.0; // 8byte => 소숫점 15자리까지 가능, 실수형의 기본 자료형
		
		// 3. 문자형
		// 3_1. 문자
		char ch = 'a'; // 2byte 
		char kim;
		kim = '김';
		
		// 3_2. 문자열
		String str; // 참조형
		str = "abc";
		
		// 값이 잘 담겼는지 확인해보자!
		System.out.println(isTrue);
		System.out.println("isFalse에 새로운 값을 넣은 후: " + isFalse);
		System.out.println(bNum);
		//System.out.println(-128);
		
		// 변수이름: 값 의 형태로 출력하고 싶다~
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("kim : " + kim);
		System.out.println("str : " + str);
	
		// 상수의 선언!
		// [표현법] final 자료형 상수이름;
		final int AGE; // 상수이름은 모두 대문자로 적는다!
		AGE = 10; // 초기화
		
		System.out.println("AGE : " + AGE);
		
		// AGE = 11;
		
		System.out.println("AGE : " + (AGE * AGE));
		
		// 대표적인 상수의 예 : 3.14 (파이, 원주율) 과 같이 고정된 불변의 진리 표시에 용이
		System.out.println("파이: " + Math.PI);
		
		// 번외 
		int etc = 999_999_999;
		
		System.out.println("etc : " + etc);
		
		//* 변수명명 규칙
		int number;
		
		// 1) 같은 영역 내에서 중복된 이름 안됨
		//int number;
		//대소문자는 구분
		int numBer;
		
		// 2) 예약어(이미 자바에서 사용되고 있는 키워드)사용 안됨
		/*
		int true;
		int abstract;
		int class;
		int static;
		int public;
		*/
		
		// 3) 숫자 사용가능 하나 숫자로 시작 할 순 없다.
		int number1;
		int num1ber;
		//int 1number;
		
		// 4) 특수문자는 _,$만 사용가능
		int number_1;
		int _number;
		int number$1;
		//int number!1;
		//int number#1;
		
		// 권장사항! (오류는 안나나 지켜야 하는 것)
		// 1) 낙타 표기법 지킬걸
		String username; //관례상 틀림
		String userName; //관례상 맞음
		String userNameTest;
		
		// 2) 한글 사용 가능하나 무조건 영문으로 적을것
		int 나이; //한글 사용하지 않는 환경에선 오류 발생 가능성 있
		int userAge;
		
	}
	
	/*
	 *  **정리**
	 * = 값(리터럴) : 프로그램상에 필요한 명시적인 값
	 * 				또는 사용자가 마우스 또는 키보드로 입력한 값
	 * - 변수 : 값을 저장하기 위한 공간(메모리상에 값을 기록하기 위한 공간)
	 * 
	 */
	
	
}
