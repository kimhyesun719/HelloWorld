package gitObjectArray3;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class gitRun3 {

	public static void main(String[] args) {
		
		// 배열을 통해 학생 출력 후 'N'을 입력시 반복문 빠져나가기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			Student[] st = new Student[10]; 
			
			int count = 0;
			for(int i=0; i<st.length; i++) {
				System.out.print("학년: ");
				int grade = sc.nextInt();
				System.out.print("반: ");
				int classroom = sc.nextInt();
				System.out.print("이름: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("국어: ");
				int kor = sc.nextInt();
				System.out.print("영어: ");
				int eng = sc.nextInt();
				System.out.print("수학: ");
				int math = sc.nextInt();
				
			//st[i] = new Student();
			st[i] = new Student(grade, classroom, name, kor, eng, math);
			
			if(sc.equals("N")) {
				System.out.println("ㅂㅂ2");
				break;
			}
			}
		}
	}
}
