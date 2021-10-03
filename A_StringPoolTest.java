package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String클래스에 toString메소드 이미 오버라이딩 되어있음!(실제 담긴 문자열을 반환하도록)
		
		System.out.println(str1 == str2);//false(주소값 비교라서)
		
		System.out.println(str1.equals(str2));
		// String 클래스에 equals메소드 이미 오버라이딩 되어있음!!(주소값 비교가 아닌 실제 담긴 문자열간 비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashCode메소드 이미 오버라이딩 되어있음!!(주소값이 아닌 실제 담긴 문자열 가지고 만들음)
		
		//진짜 주소값이 알고싶다면 System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello";
		String str2 = "hello";
		// 리터럴 제시시 상수풀(String Pool)영역에 올라감
		// String Pool의 특징 : 동일한 문자열을 가질 수 없음
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // true (주소값일치)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		
		String str3 = "hi";
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
		// String 클래스 == 불변클래스(변하지 않는 클래스)
		// 변경이 가능하긴 하나 그 자리에서 수정되는 개념이 아니다
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경 되는게 아닌
		// 새로운 곳을 참조하도록 됨(새로운 주소값 부여받음 == 주소값 변경)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));

		
		
		
	}

}
