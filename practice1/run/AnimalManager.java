package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("빙그니", "요크셔", 3);
		arr[1] = new Dog("보미", "푸들", 4);
		arr[2] = new Cat("돼서니", "코리아숏헤어", "우리집", "까만색");
		arr[3] = new Cat("아옹이", "러시안블루", "우리집", "하얀색");
		arr[4] = new Dog("빙봄", "요키푸", 4);
		
		for(Animal a : arr) {
			a.speak();
		}
		
	}

}
