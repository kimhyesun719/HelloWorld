package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// 출력할 데이터(Phone객체)
		Phone ph = new Phone("아이폰", 1300000);
		
		// FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반 스트림
		// ObjectOutputStream : 객체 단위로 출력 할 수 있도록 도움을 주는 보조스트림(ObjectWriter없음)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램<-- 파일(입력)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트단위로 입력 받을 수 있는 기반 스트림
		// ObjectInputStream : 객체단위로 입력받을 수 있게 도와주는 보조스트림(ObjectReader없음)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
