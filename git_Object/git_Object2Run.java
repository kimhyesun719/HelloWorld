package git_Object;

import com.hw1.model.vo.Product;

public class git_Object2Run {

	public static void main(String[] args) {
		
		//1.�Ű����� �����ڸ� �̿��Ͽ� 3���� ��ü ���� �� ���
		git_Object2 pro1 = new git_Object2("ssgnote9", "�����ó�Ʈ9", 960000, 10.0);
		git_Object2 pro2 = new git_Object2("lgxnote5", "LG����Ʈ��5", 780000, 0.7);
		git_Object2 pro3 = new git_Object2("ktsnote3", "KT����Ʈ��3", 250000, 0.3);
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());
		
		System.out.println("==============================================================");
		
		// 2. setter�޼ҵ带 �̿��Ͽ� ������ ��� 120�������� ����, �ΰ������� ��� 0.05�� ���� �� ���
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);

		pro1.setTax(0.05);
		pro2.setTax(0.05);
		pro3.setTax(0.05);
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());
	}

}
