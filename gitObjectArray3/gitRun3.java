package gitObjectArray3;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class gitRun3 {

	public static void main(String[] args) {
		
		// �迭�� ���� �л� ��� �� 'N'�� �Է½� �ݺ��� ����������
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			Student[] st = new Student[10]; 
			
			int count = 0;
			for(int i=0; i<st.length; i++) {
				System.out.print("�г�: ");
				int grade = sc.nextInt();
				System.out.print("��: ");
				int classroom = sc.nextInt();
				System.out.print("�̸�: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("����: ");
				int kor = sc.nextInt();
				System.out.print("����: ");
				int eng = sc.nextInt();
				System.out.print("����: ");
				int math = sc.nextInt();
				
			//st[i] = new Student();
			st[i] = new Student(grade, classroom, name, kor, eng, math);
			
			if(sc.equals("N")) {
				System.out.println("����2");
				break;
			}
			}
		}
	}
}
