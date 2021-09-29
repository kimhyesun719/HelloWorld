package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student [] s = new Student[3];
		s[0] = new Student("������", 26, 157.2, 37.8, 1, "���̰濵�а�");
		s[1] = new Student("���ҿ�", 28, 167.2, 57.8, 2, "����濵�а�");
		s[2] = new Student("����", 8, 30.2, 3.8, 3, "�������а�");
		
		for (int i=0; i<s.length; i++) {
		System.out.println(s[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		Employee [] e = new Employee[10];
		int count = 0;
		
		while(true) {
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("Ű: ");
		double height = sc.nextDouble();
		System.out.print("������: ");
		double weight = sc.nextDouble();
		System.out.print("�޿�: ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("����: ");
		String dept = sc.nextLine();
		
		e[count] = new Employee(name, age, height, weight, salary, dept);
		count++;
		System.out.print("��� �Ұž�?(y/n) :");
		String str = sc.nextLine();
		
			if(str.equals("n")) {
				break;
			}
		}for(int i=0; i<count; i++) {
			System.out.println(e[i]);
		}
	}
}