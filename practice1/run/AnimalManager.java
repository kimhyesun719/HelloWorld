package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("���״�", "��ũ��", 3);
		arr[1] = new Dog("����", "Ǫ��", 4);
		arr[2] = new Cat("�ż���", "�ڸ��Ƽ����", "�츮��", "���");
		arr[3] = new Cat("�ƿ���", "���þȺ��", "�츮��", "�Ͼ��");
		arr[4] = new Dog("����", "��ŰǪ", 4);
		
		for(Animal a : arr) {
			a.speak();
		}
		
	}

}
