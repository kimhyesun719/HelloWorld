package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// ����� ������(Phone��ü)
		Phone ph = new Phone("������", 1300000);
		
		// FileOutputStream : ���ϰ� �����ؼ� 1����Ʈ ������ ����� �� �ִ� ��� ��Ʈ��
		// ObjectOutputStream : ��ü ������ ��� �� �� �ֵ��� ������ �ִ� ������Ʈ��(ObjectWriter����)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ���α׷�<-- ����(�Է�)
	public void fileRead() {
		
		// FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ������ �Է� ���� �� �ִ� ��� ��Ʈ��
		// ObjectInputStream : ��ü������ �Է¹��� �� �ְ� �����ִ� ������Ʈ��(ObjectReader����)
		
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
