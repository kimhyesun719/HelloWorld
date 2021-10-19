package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	
	/*
	 * * TCP(Transmission Control Protocol)
	 * - 서버, 클라이언트 간의 1:1 소켓 통신
	 * - 데이터를 교환하기에 앞서서 서버, 클라이언트 연결 되어 있어야 됨!!(서버가 먼저 실행되어 클라이언트의 요청 기다릴거임)
	 * - 신뢰성 있는 데이터 전달 가능
	 * 
	 *  * Socket 
	 *  - 프로세스간의 통신을 담당
	 *  - Input / OutputStream 을 가지고 있음(이 스트림을 통해 입출력이 이루어짐)
	 *  
	 *  * ServerSocket
	 *  - 포트와 연결 (Bind)되어 외부의 연결 요청을 기다리다 연결 요청이 들어오면 수락해줄 용도
	 *  수락 => 통신 할 수 있는 Socket 생성
	 *  
	 */
	
	// 서버용 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) 포트 번호 지정 (서버측에서 몇 번 포트로 통로를 열겠냐는걸 의미)
		int port = 3000;
		
		ServerSocket server;
		
		// 2) ServerSocket 객체 생성시 포트 결합 (Bind) (ServerSocket은 클라이언트의 연결요청을 받아줄 용도의 소켓)
		try {
			server = new ServerSocket(port);
			
			// 3) 클라이언트로 부터 접속 요청이 올 때 까지 대기 상태
			System.out.println("클라이언트의 요청을 기다리고 있습니다..");
			
			// 4) 연결 요청이 오면 요청 수락 후 해당 클라이언트와 통신 할 수 있는 서버측 소켓 객체 생성
			Socket socket = server.accept(); //socket ==클라이언트와 통신 할 수 있는 소켓객체
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함...");
			
			// 5) 클라이언트와 입출력 스트림 생성(바이트 스트림으로밖에 안됨...)
			// 6) 보조스트림을 통해서 성능 개선
			
			// 입력용 스트림 (클라이언트로 부터 전달된 값을 한줄 단위로 읽어 드리기 위한 입력용 스트림!)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 출력용 스트림 (클라이언트 에게 값을 한줄 단위로 출력 할 수 있는 출력용 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter : 데이터 출력시 print(), println() 메소드를 가지고 있는 보조 스트림
			
			while(true) {
				// 7) 스트림을 통해 읽고 쓰기
				// 클라이언트로 부터 전달된 메세지가 있을 경우 서버측 읽어들일거! (입력)
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달 받은 메시지 : " + message);
				
				// 반대로 클라이언트에게 데이터 전달!! (출력)
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); //클라이언트에게 출력
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내는 메소드(close메소드 호출되면 자동으로 flush)
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 8) 통신 종료
				br.close();
				pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		

	}

}
