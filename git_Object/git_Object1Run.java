package git_Object;
import git_Object.git_Object1;
public class git_Object1Run {

	// ��ü�� ĸ��ȭ ������ ���� Ŭ���� ���¸� �����غ���
	
	public static void main(String[] args) {
		
		//1. ù��° ��� ���
		
		git_Object1 stu = new git_Object1();
		
		stu.setName("������");
		stu.setAge(27);
		stu.setHeight(157.0);
		stu.setKor(95);
		stu.setMath(95);
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getHeight());
		System.out.println(stu.getKor());
		System.out.println(stu.getMath());
		
		//2. �ι�° ��� ���
		//�Ű����� �����ڷ� ������ ���ÿ� �� �ʱ�ȭ
		
		git_Object1 stu2 = new git_Object1("������", 27, 157.8, 95, 90);
		
		System.out.println(stu2.infor());
		
	}

}
