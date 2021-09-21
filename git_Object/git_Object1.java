package git_Object;

public class git_Object1 {
	
	// 객체 이해하기
	// 객체 클래스 우선 구성하기
	
	// git_Object 에 학생 객체클래스를 담아보자
	
	// 접근제한자: public > protecected > default > private
	// ㄴ private로 생성하기
	
	private String name;
	private int age;
	private double height;
	private int kor;
	private int math;
	
	// 학생의 이름과 나이 키 국어,수학 점수를 알아보자
	
	public git_Object1() {
	}
	
	
	public git_Object1(String name, int age, double height, int kor, int math) {
		this.name = name;
		this.age = age;
		this.height =height;
		this.kor = kor;
		this.math = math;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public String getName() {
		return name;
	}public int getAge() {
		return age;
	}public double getHeight() {
		return height;
	}public int getKor() {
		return kor;
	}public int getMath() {
		return math;
	}
	
	public String infor() {
		return "이름 :" + name + " 나이 :" + age + " 키 :" + height + " 국어점수 :" + kor + " 수학 점수 :"+ math;
	}

}
