package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {// 직렬화
	// 객체 자체를 입출력 하고자 한다면 받드시 직렬화 과정 필수
	
	private String name;
	private int price;
	
	// 기본 생성자, 매개변수 생성자, getter/setter, toString
	public Phone() {
	}
	// alt + shift + s => o 엔터
	public Phone(String name, int price) {
		//super();
		this.name = name;
		this.price = price;
	}
	// alt + shift + s => r => (필드 전체선택)alt+a => (generate)alt+r 엔터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	// alt + shift + s => s 엔터
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	

}
