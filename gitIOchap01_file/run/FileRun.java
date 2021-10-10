package gitIOchap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 간단하게 파일(file) 만들어지는 과정
		// java.io.File 클래스 가지고!
		
		try {
			
			// 1. 경로지정을 딱히 하지 않은 상태로 파일 생성 =>현재 project폴더안에 파일이 생성됨
			File f1 = new File("test.txt");
			f1.createNewFile();	// 메소드까지 실행해야만 실제 파일이 만들어짐!
		
			// 2. 존재하는 폴더에 파일 생성 => 해당 경로까지 지정하면 됨
			File f2 = new File("E:\\test.txt"); // 경로이름 입력한다음에 \
			f2.createNewFile();// 존재하지 않는 경로를 제시하면 IOException 발생
			
			//File f3 = new File("E:\\temp\\test.txt"); 
			//f3.createNewFile();
			// 폴더가 존재하지 않으면 만들어 지지 않음
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하지
			File tempFolder = new File("E:\\temp");
			tempFolder.mkdir(); // 폴더가 만들어지게 하는 메소드
			
			File f3 = new File("E:\\temp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile()); // true 파일이다
			System.out.println(tempFolder.isFile()); // false 폴더다
			
			// =====================================
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
			
			
		} catch (IOException e) {
			e.printStackTrace(); // 어떤 오류가 있는지 보여줌
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 * 프로그램 상의 데이터를 외부매체로 출력을 한다거나 또는 외부매체로부터 입력을 받아 올 거임!!
	 * 반드시 그 외부매체와 통로를 만들어야 됨! 그게 바로 스트림!!
	 * 
	 * * 스트림(통로)의 특징
	 * - 단방향 : 입력이면 입력/ 출력이면 출력만 가능!!
	 * 			= > 입력과 출력을 동시에 하려면 => 입력용 스트림 따로 출력용 스트림 따로 있어야함
	 * - 선입선출(FIFO) : 통로가 파이프 같은 개념이기 때문에 먼저 보낸값이 먼저 나온다!!
	 * 					=> 시간지연(delay) 이라는 문제가 생길 수 있음!!
	 * 
	 * * 스트링의 구분
	 * > 통로의 사이즈 (1byte짜리 / 2byte짜리)
	 * - 바이트 스트림 : 1byte짜리만 왔다갔다 가능(완전 좁은 통로) => 입력(InputStream) / 출력(OutputStream)
	 * - 문자 스트림 : 2byte짜리까지 왔다리 갔다리 가능(넓은 통로) => 입력(Reader) / 출력(Writer)
	 * 
	 * > 외부매체와 직접 연결하는 유무
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로 (필수)
	 * - 보조 스트림 : 말그대로 보조 역할만 하는 통로 (속도를 빠르게 한다거나, 그외에 유용한 기능들을 제공하는 ..)
	 * 				보조스트림 단독 사용은 불가함!! 기반스트림 반드시 필수
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	

}
