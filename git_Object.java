package git_Object;

public class git_Object {
	
	// ��ü �����ϱ�
	// ��ü Ŭ���� �켱 �����ϱ�
	
	// git_Object �� �л� ��üŬ������ ��ƺ���
	
	// ����������: public > protecected > default > private
	// �� private�� �����ϱ�
	
	private String name;
	private int age;
	private double height;
	private int kor;
	private int math;
	
	// �л��� �̸��� ���� Ű ����,���� ������ �˾ƺ���
	
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
		return "�̸� : " + name + "���� : " + age + "Ű : " + height + "�������� : " + kor + "���� ���� : "+ math;
	}

}
