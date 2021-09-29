package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student [] s = new Student[3];
		s[0] = new Student("김혜선", 26, 157.2, 37.8, 1, "보미경영학과");
		s[1] = new Student("윤소울", 28, 167.2, 57.8, 2, "강쥐경영학과");
		s[2] = new Student("보미", 8, 30.2, 3.8, 3, "강쥐사료학과");
		
		for (int i=0; i<s.length; i++) {
		System.out.println(s[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		Employee [] e = new Employee[10];
		int count = 0;
		
		while(true) {
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		System.out.print("급여: ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("직위: ");
		String dept = sc.nextLine();
		
		e[count] = new Employee(name, age, height, weight, salary, dept);
		count++;
		System.out.print("계속 할거야?(y/n) :");
		String str = sc.nextLine();
		
			if(str.equals("n")) {
				break;
			}
		}for(int i=0; i<count; i++) {
			System.out.println(e[i]);
		}
	}
}