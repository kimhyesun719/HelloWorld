package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * * java.util.Date
		 */
		
		// 기본 생성자를 통해 생성
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜(2021년 07월 27일)로 셋팅
		// 1) 매개변수 생성자를 통해서 생성
		Date date2 = new Date(2021 - 1900, 7 - 1, 27);
		System.out.println(date2);
		
		// 2) 기본생성자로 생성한 후 setter메소드로 값 변경
		date1.setYear(2021-1900);
		date1.setMonth(7 - 1);
		date1.setDate(27);
		
		System.out.println(date1.toString());
		
		// 2021년 07월 27일 02시 56분 37초
		
		// 내 입맛대로 포맷을 적용해서 출력 가능
		// java.text.SimpleDateFormat 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
		
	}

}
