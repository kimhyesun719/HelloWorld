package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

// 사용자의 요청 처리 해주는 클래스
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	{// 초기화 블럭 설정 필요
		
		list.add(new Music("Good Bye", "소녀시대"));
		list.add(new Music("마들렌러브","치즈"));
		list.add(new Music("Good love","다이나믹듀오"));
	}
	
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}
	
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result =1;
				break;
			}
		}
		
		// result = 0 | 1  둘중 하나 담겨 있을것
		// 0 = 삭제할곡을 못찾음
		// 1 = 삭제할 곡 찾음
		
		return result;
	}
	// 1. 간단 버전
	public ArrayList<Music> searchMusic(String keyword) {
		
		 ArrayList<Music> searchList = new  ArrayList<>();
		 // 검색된 Music객체를 차곡차곡 담을list
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		
		// searchList=> 비어있을수도 | 검색된Music객체들이 담겨있을수도
		return searchList;
		
	}
	//2. 심화버전
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); //검색결과보관리스트(텅비어있음)
		
		
		if(menu == 1) { // => 곡명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}else { // => 가수명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
	}
	
	public int updateMusic(String title,String upArtist,String upTitle) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setArtist(upArtist);
				m.setTitle(upTitle);
				result = 1;
				break;
			}
		}
		
		// result = 0 | 1  둘중 하나 담겨 있을것
		// 0 = 수정할곡을 못찾음
		// 1 = 수정완.
		return result;
	}
	
}
