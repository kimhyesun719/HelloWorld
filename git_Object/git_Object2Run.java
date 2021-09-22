package git_Object;

import com.hw1.model.vo.Product;

public class git_Object2Run {

	public static void main(String[] args) {
		
		//1.매개변수 생성자를 이용하여 3개의 객체 생성 후 출력
		git_Object2 pro1 = new git_Object2("ssgnote9", "갤럭시노트9", 960000, 10.0);
		git_Object2 pro2 = new git_Object2("lgxnote5", "LG스마트폰5", 780000, 0.7);
		git_Object2 pro3 = new git_Object2("ktsnote3", "KT스마트폰3", 250000, 0.3);
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());
		
		System.out.println("==============================================================");
		
		// 2. setter메소드를 이용하여 가격을 모두 120만원으로 수정, 부가세율도 모두 0.05로 수정 후 출력
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
