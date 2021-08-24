package com.kh.variable;

public class C_Printf {

	public void printfTest() {
		
		// System.out.print(출력하고자 하는 값); // 출력만 함 (줄바꿈 발생x)
		// System.out.println(출력하고자 하는 값); // 출력후 (줄바꿈 발생o)
		
		// System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값, 값, ...);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (한줄 띄어쓰기 안됨!!)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열 (문자도 가능)
		 * %f : 실수
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d%%", iNum1, iNum2); // 제시된 형식에서 적으면 오류, 넘치면 무시된 상태로 표시됨
						 	  //%를 표시하고 싶으면 %%두개
		System.out.println();
		
		System.out.printf("%5d\n", iNum1); //5칸의 공간 확보 후 오른쪽 정렬 (음수는 왼쪽 정렬)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 13);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f\n", dNum1, dNum2);//무조건 소숫점 아래 6자리까지 보여줌 (반올림도함)
		System.out.printf("%.2f %.1f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %s\n", ch, str, ch); // %s는 문자 문자열 둘다 포용가능
		System.out.printf("%C %S", ch, str); //대문자로도 출력 가능
		
		
		
		
	}
	
}
