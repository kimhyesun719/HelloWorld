package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {// ����ȭ
	// ��ü ��ü�� ����� �ϰ��� �Ѵٸ� �޵�� ����ȭ ���� �ʼ�
	
	private String name;
	private int price;
	
	// �⺻ ������, �Ű����� ������, getter/setter, toString
	public Phone() {
	}
	// alt + shift + s => o ����
	public Phone(String name, int price) {
		//super();
		this.name = name;
		this.price = price;
	}
	// alt + shift + s => r => (�ʵ� ��ü����)alt+a => (generate)alt+r ����
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
	// alt + shift + s => s ����
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	

}
