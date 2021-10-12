package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * * Wrapper 클래스
		 * 	 => 기본자료형을 객체로 포장해 줄 수 있는 랩(포장랩)클래스
		 *  
		 * 	 기본자료형		<-->	Wrapper클래스
		 * 	 boolean			Boolean
		 * 	 byte				Byte
		 * 	 char				Character	*
		 * 	 short				Short
		 * 	 int				Integer		*
		 * 	 long				Long
		 * 	 float				Float
		 * 	 double				Double
		 * 
		 * => 기본자료형을 객체로 취급해야 하는 경우
		 * 		- 메소드 호출해야 될 떄
		 * 		- 메소드의 매개변수로 기본 자료형이 아닌 객체 타입만이 요구 될 때
		 * 		- 다형성을 적용시키고 싶을 때
		 * 
		 */
		
		// Boxing : 기본 자료형 => Wrapper클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num1 => i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		//compareTo = 앞의 숫자가 크면 1 뒤의 숫자가 크면 -1 같으면 0 반환
		
		// 2. 객체 생성따위 하지 않고 곧바로 대입하는 방법(AutoBoxing)
		Integer i3 = num1; // 자동형변환 됨
		System.out.println(i3);
		
		// 객체생성을 통해서 반드시 변환 해야 되는 경우  => 문자열을 Integer타입으로
		//Integer i4 = "123";
		Integer i4 = new Integer("123"); // "123" =>123
		System.out.println(i4);
		
		// UnBoxing : Wrapper 클래스 자료형 => 기본 자료형
		
		// 1. 해당 그 Wrapper클래스에서 제공하는 xxxValue() 메소드를 통해
		int num3 = i3.intValue(); // i3 => num3		10
		int num4 = i4.intValue(); // i4 => num4		123
		
		// 2. 메소드따위 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		int num5 = i1;
		
		System.out.println("========================");
		
		// 기본 자료형 <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		System.out.println(str1 + str2); // 문자열로 작업됨!!
		
		// 1. String --> 기본 자료형
		//		"10" --> 10
		//		"15.3"--> 15.3
		//	해당 Wrapper클래스.parseXXX() 사용
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d); // 수학적 계산됨
		
		// 2. 기본 자료형 --> String
		//		10 --> "10"
		//		15.3--> "15.3"
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		
		
	}

}
