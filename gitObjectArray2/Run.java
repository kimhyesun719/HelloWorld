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
		em[1].setempName("ȫ�浿");
		em[1].setAge(19);
		em[1].setGender('M');
		em[1].setPhone("01022223333");
		em[1].setAddress("���� ���");
		
		System.out.print("emp[1] : ");
		System.out.println(em[1].infor());
		
		em[2] = new Employee(2, "������", "������", "����", 20, 'F', 1000000, 0.01, "01011112222", "���� ����");
		System.out.print("emp[2] : ");
		System.out.println(em[2].infor());
		
		System.out.println("===============================================================");
		
		em[0] = new Employee(0 , "�踻��", "������", "����", 30, 'M', 3000000, 0.2, "01055559999", "���� ����");
		System.out.print("emp[0] : ");
		System.out.println(em[0].infor());
		
		em[1].setDept("��ȹ��");
		em[1].setJob("����");
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
		
		System.out.print("�踻���� ���� : ");
		System.out.println(aaa +"��");
		
		System.out.print("ȫ�浿�� ���� : ");
		System.out.println(bbb +"��");
		
		System.out.print("�������� ���� : ");
		System.out.println(ccc +"��");
		
		System.out.println("===============================================================");
		
		System.out.print("�������� ������ ��� : ");
		System.out.println((aaa + bbb + ccc)/3 + "��");

	}

}
