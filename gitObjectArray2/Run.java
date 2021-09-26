package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee [] em = new Employee [3];
		
		em[0] = new Employee();
		System.out.print("emp[0] : ");
		System.out.println(em[0].infor());
		
		em[1] = new Employee();
		em[1].setempNo(1);
		em[1].setempName("È«±æµ¿");
		em[1].setAge(19);
		em[1].setGender('M');
		em[1].setPhone("01022223333");
		em[1].setAddress("¼­¿ï Àá½Ç");
		
		System.out.print("emp[1] : ");
		System.out.println(em[1].infor());
		
		em[2] = new Employee(2, "±èÇý¼±", "±³À°ºÎ", "°­»ç", 20, 'F', 1000000, 0.01, "01011112222", "¼­¿ï ¸¶°î");
		System.out.print("emp[2] : ");
		System.out.println(em[2].infor());
		
		System.out.println("===============================================================");
		
		em[0] = new Employee(0 , "±è¸»¶Ë", "¿µ¾÷ºÎ", "ÆÀÀå", 30, 'M', 3000000, 0.2, "01055559999", "Àü¶óµµ ±¤ÁÖ");
		System.out.print("emp[0] : ");
		System.out.println(em[0].infor());
		
		em[1].setDept("±âÈ¹ºÎ");
		em[1].setJob("ºÎÀå");
		em[1].setSalary(4000000);
		em[1].setBonusPoint(0.3);
		System.out.print("emp[1] : ");
		System.out.println(em[1].infor());
		
		System.out.println("===============================================================");
		
		int a = 0;
		a = em[0].getSalary();
		int b = 0;
		b = em[1].getSalary();
		int c = 0;
		c = em[2].getSalary();
		
		double aa = 0;
		aa = em[0].getBonusPoint();
		double bb = 0;
		bb = em[1].getBonusPoint();
		double cc = 0;
		cc = em[2].getBonusPoint();
		
		int aaa = 0;
		aaa = ((int)(a + (a * aa)) * 12);
		int bbb = 0;
		bbb = ((int)(b + (b * bb)) * 12);
		int ccc = 0;
		ccc = ((int)(c + (c * cc)) * 12);
		
		System.out.print("±è¸»¶ËÀÇ ¿¬ºÀ : ");
		System.out.println(aaa +"¿ø");
		
		System.out.print("È«±æµ¿ÀÇ ¿¬ºÀ : ");
		System.out.println(bbb +"¿ø");
		
		System.out.print("°­¸»¼øÀÇ ¿¬ºÀ : ");
		System.out.println(ccc +"¿ø");
		
		System.out.println("===============================================================");
		
		System.out.print("Á÷¿øµéÀÇ ¿¬ºÀÀÇ Æò±Õ : ");
		System.out.println((aaa + bbb + ccc)/3 + "¿ø");

	}

}
