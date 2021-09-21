package git_Object;
import git_Object.git_Object1;
public class git_Object1Run {

	// 객체의 캡슐화 과정을 통해 클래스 형태를 진행해보자
	
	public static void main(String[] args) {
		
		//1. 첫번째 출력 방법
		
		git_Object1 stu = new git_Object1();
		
		stu.setName("김혜선");
		stu.setAge(27);
		stu.setHeight(157.0);
		stu.setKor(95);
		stu.setMath(95);
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getHeight());
		System.out.println(stu.getKor());
		System.out.println(stu.getMath());
		
		//2. 두번째 출력 방법
		//매개변수 생성자로 생성과 동시에 값 초기화
		
		git_Object1 stu2 = new git_Object1("김혜선", 27, 157.8, 95, 90);
		
		System.out.println(stu2.infor());
		
	}

}
