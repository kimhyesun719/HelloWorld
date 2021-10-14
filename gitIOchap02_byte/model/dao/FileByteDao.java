package gitIOchap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object)

public class FileByteDao {
	
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력 해보기!!
	 * 
	 * - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로임..1바이트면 한글도 깨짐)
	 * - 기반 스트림 :  외부매체와 직접적으로 연결되는 통로!!
	 * 
	 * XXXInputStream : XXX매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겠음!!)
	 * XXXOutputStream : XXX매체로 데이터를 출력하는 통로(외부로 데이터를 내보내겠다, 쓰겠다, 기록하겠다)
	 * 
	 * 
	 * 
	 */
	
	
	// 프로그램(자바 또는 메모리) --> 외부매체(파일) 
	//(출력: 프로그램 상의 데이터를 파일로 내보내기 , 즉 파일로 저장)
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림으로 데이터를 출력 (메소드 활용)
		// 3. 다 사용한 후 스트림 반납
		
		FileOutputStream fout = null;
		
		try {
			// 1. FileOutputStream 객체생성 => 해당 파일과의 연결통로가 만들어짐
			/*
			 * true 미작성시 =>새로고침 후 작성됨
			 * true 작성시 => 기존의 데이터에서 이어서 작성됨
			 * 
			 */
			
			fout = new FileOutputStream("a_byte.txt" /*,true*/);
			// ㄴ해당 파일이 없으면 새로 만들어주고 통로 연결/ 있으면 그냥 통로연결
			
			// 2. 파일에 데이터를 출력하고자 할 때 writer 메소드 사용
			//		숫자를 출력하던 문자를 출력하던 실상 파일에 기록되는건 문자로 기록됨(아스키코드표)
			//		숫자(0~127)
			fout.write(97); // 'a'문자가 저장
			fout.write('b'); // 'b'문자가 저장
			//fout.write('핳'); // 한글은 2바이트라 깨져서 저장됨
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // cde 문자가 저장
			
			// write(byte[] b, int off, int len) : byte배열의 off인덱스에서부터 len갯수만큼 출력
			fout.write(arr,1, 2); //1번인데스에서부터2개를 출력하겠다
			
			// 3. 스트림 다 이용 했으면 반납하기! (반드시!!)
			//fout.close();//위write에서IOException이발생하면 catch블럭으로 빠져나감(즉 반납코드는 실행안됨)
			// 때문에 여기서 사용안함
			// 반드시 실행해야 하는 구문이기 때문에finaly에서 기술함
			
			
		} catch (FileNotFoundException e) {//존재하지 않는 경로 제시시 발생할 수 있음
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //이안에 작성된 코드는 어떤 예외가 발생했던간에 마지막에 무조건 빠져나감
			//3. 스트림 다 이용 했으면 반납하기! (반드시!!)
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	// 프로그램 <== 파일 (입력: 파일로부터 데이터 가져오기)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력 받는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림 통해서 입력 받아옴(메소드 활용)
		// 3. 사용이 끝난 스트림 반납
		
		FileInputStream fin = null;
		try {
			// 1. FileInputStream 객체생성 => 해당파일과 연결통로 만들어짐
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터를 읽어들이고자 할 떄는 read 메소드 사용
			//		1byte단위로 하나씩 읽어옴 / 숫자로 읽어들임
			
			//실제로 파일에 얼마만큼의 데이터가 있는지 모를경우? =>반복문 활용
				/*
				System.out.println(fin.read());
				System.out.println(fin.read());
				System.out.println(fin.read());
				System.out.println(fin.read());
				System.out.println(fin.read());
				System.out.println(fin.read());
				System.out.println(fin.read());
				
				System.out.println(fin.read()); //파일의 끝을 만나는 순간 -1을 받아오는거 확인!!
				System.out.println(fin.read());
				*/
			
			/* 반복문 수행시 매번 read()이 두번씩 실행되게 떄문에 퐁당퐁당 읽혀짐
			while(fin.read() != -1) {// 읽어들인 값이 -1이 아닐경우에만 반복실행
				System.out.println(fin.read());
			}
			*/
			
			// read() 호출은 반복문 수행시 매번 한번씩 실행되도록
			// 해결방법1. 무한반복으로 돌리면서 매번 조건검사
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			//해결방법2. 권장 방법
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
			
			
		}catch (FileNotFoundException e) { //파일이 존재하지 않으면 예외발생
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}