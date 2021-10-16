package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 * 보조스트림 :기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 * 			기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 
	 * 		>>  외부매체와 직접적으로 연결되는 스트림 아님!!
	 * 			단독 사용 불가(반드시 기반스와 함께 사용)
	 * 
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조 스트림 (속도향상)
		
		
		// 1. 기반스트림 먼저 생성
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. 보조스트림 생성시 기반스트림 객체를 전달 하면서 생성
		//BufferedWriter bw = new BufferedWriter(fw);
		
		// 위의 두 줄을 한 줄로 작성
		
		/*
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("님들아 하이루~\n");
			bw.write("방가루~");
			bw.newLine(); // 추가적인 메소드 활용 가능
			bw.write("저리가세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도향상에 굿 ㅋㅋ
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try~with~resource  구문으로 자원반납까지 더 간단하게 작업 가능
		// jdk7버전 이상부터 사용 가능
		/*
		 * try(try블럭내에서 사용할 스트림 객체 생성 구문) {
		 * 	// 알아서 try다 끝나면 해당 스트림 반납까지 해줌
		 * }catch(예외클래스 e) {
		 * 
		 * }
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt)"))) {
			
			bw.write("님들아 하이루~\n");
			bw.write("방가루~");
			bw.newLine(); // 추가적인 메소드 활용 가능
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납 구문 안써도됨!! 자동으로 반납까지 해줄꺼임
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		// FileReader : 파일과 연결해서 2byte 단위로 데이터를 입력 받는 스트림(기반스트림)
		// BufferedReader : 속도 향상 도움이 되는 보조 스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			
			// readLine 메소드를 이용해서 한줄씩 읽어들이기
			
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value = br.readLine()) !=null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) { //IOException의 자식
			e.printStackTrace();			// 때문에 없어도됨(다형성적용됨)
		} catch (IOException e) { //부모
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}