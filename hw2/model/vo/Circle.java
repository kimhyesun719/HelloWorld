package com.hw2.model.vo;

public class Circle extends Point{

	private int radius;
	
	public Circle() {
	}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void setRadius (int radius) {
		this.radius = radius;
	}
	
	public int getRadius () {
		return radius;
	}
	
	public void draw() {
		super.draw();
		System.out.printf("%s %.1f","���� : ",(Math.PI * radius * radius));
		System.out.printf("%s %.1f","\n�ѷ� : ",(Math.PI * radius * 2));
	}

}
