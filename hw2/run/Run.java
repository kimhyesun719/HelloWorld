package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
			
		Circle [] c = new Circle[2];
		Rectangle [] r = new Rectangle[2];
		
		System.out.println("==========Circle=========");
		c[0] = new Circle (1,2,3);
		c[1] = new Circle (3,3,4);
		
		for(Circle o : c) {
			o.draw();
			System.out.println(" ");
		}
		System.out.println("=========Rectangle=========");
		
		r[0] = new Rectangle (-1,-2,5,2);
		r[1] = new Rectangle (-2, 5,2,8);
		
		for(Rectangle a : r) {
			a.draw();
			System.out.println(" ");
		}
	}
}
