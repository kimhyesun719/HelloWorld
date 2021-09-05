package com.kh.hyesun;

import java.util.Scanner;

public class gitSwitch {

	public static void main(String[] args) {
		
		// 구매 하고자 하는 과자를 입력 받아서 switch문으로 가격을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매 하고자 하는 과자(포카칩, 스윙칩, 허니버터칩) 입력 : ");
		String snack = sc.nextLine();
		
		int price = 0;
		
		switch(snack) {
		case "포카칩" : price = 2000; break; //맞는값 출력후 브레이크로 뒤에 문구 출력을 막아줌
		case "스윙칩" : price = 1500; break;
		case "허니버터칩" : price = 1000; break;
		default : System.out.println("예시에 나와있는 과자를 입력 해 주세요.");
		}
		
		System.out.println(snack + "의 가격은" + price + "원 입니다.");

	}

}
