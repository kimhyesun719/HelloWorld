package com.kh.Collection.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// <Music> 로  제네릭 설정 함 =>	E == Music
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Good Bye", "소녀시대"));
		list.add(new Music("All night", "소녀시대"));
		// list.add("끝"); //뮤직타입만 담기 가능 문자열은 못담음
		
		System.out.println(list);
		
		list.add(1, new Music("불꽃놀이", "오마이걸"));
		
		System.out.println(list);
		
		list.set(0, new Music("Party", "소녀시대"));
		
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);
		
		list.addAll(sub);
		
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(1).getTitle());
		
		System.out.println("===================");
		
		for (Music o : list) {
			System.out.println(o);
		}
		
		/*
		 * * 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는 절차를 없애기 위해
		 * 
		 * 
		 * 
		 */

	}

}
