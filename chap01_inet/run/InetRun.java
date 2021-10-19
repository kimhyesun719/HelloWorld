package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		
		/*
		 * * ��Ʈ��ũ (Network) : �������� ��ǻ�͵��� ����Ǿ� �ִ� ��Ÿ� ������
		 * 					   => �̷� ��Ʈ��ũ�� ���� ���ΰ��� �����͸� ��ȯ ����!
		 * 
		 * * IP �ּ� : ��Ʈ��ũ �� �� ��ǻ�͵��� �ĺ��� �� �� �ִ� ��ȣ (��ǻ���� �ֹι�ȣ)
		 * 
		 * * ������ Ŭ���̾�Ʈ
		 * > ���� : Ŭ���̾�Ʈ(��)���� ���񽺸� �������ִ� ���α׷�(Ŭ���̾�Ʈ�� ��û�� ó���ؼ� �������ִ� pc)
		 * > Ŭ���̾�Ʈ : ������ ��û�ϴ� ��ǻ�� (���񽺸� �����޴� ��)
		 * 
		 * - ������ ��û�ϱ� ���ؼ��� �� ��û�ϰ��� �ϴ� ������ IP�ּ�(�Ǵ� �����θ�), ��Ʈ��ȣ�� �˾ƾߵ�!
		 * 
		 */
		
		// InetAddress : ��Ʈ��ũ ����(ip�ּ� ����)�� Ȯ�� �� �� �ִ� Ŭ����
		
		try {
			
			InetAddress localhost = InetAddress.getLocalHost(); //��pc(����ȣ��Ʈ)�� ���� ������ ��ȯ
			System.out.println(localhost); // ��pc�� + / + ��ip�ּ�
			
			System.out.println("�� pc�� : " + localhost.getHostName()); // ȣ��Ʈ�� �̸� ��ȯ
			System.out.println("�� IP�ּ� : " + localhost.getHostAddress()); // ȣ��Ʈ�� ip�ּ� ��ȯ
			
			System.out.println("============================");
			
			// ���� �˰� �ִ� �������� ���ؼ� �� �������õ� ���� ���
			InetAddress googleHost = InetAddress.getByName("www.google.com"); //�����θ��� ���ؼ� �ش� ȣ��Ʈ ���� ��ȯ
			
			System.out.println("���� ������ : " + googleHost.getHostName());
			System.out.println("���� IP�ּ� : " + googleHost.getHostAddress());
			
			System.out.println("============================");
			
			// �������� ���ؼ� �� ���������� �͵��� �迭�� ���� �� ����
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("���̹� ȣ��Ʈ ���� : " + naverHost.length);
			for(InetAddress n : naverHost) {
				System.out.println("���̹� ������ : " + n.getHostName());
				System.out.println("���̹� IP�ּ� : " + n.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * * ���� �������� ������ ������
		 * 	  Ŭ���̾�Ʈ�� �� ������ ��û ���� �� ���� ! => ������ ���ƿ�!
		 * 
		 * - ��û�� ���信 ���ؼ� ���α׷��� ���ư�("���"�Ѵ� ǥ��)
		 * 
		 * - �������� ��Ź�� : HTTP �������� ���
		 * 
		 * * �ڹٸ��� ������ ������ Ŭ���̾�Ʈ���� ������ ��� �غ���~!
		 * 	  �̶� �����͸� ����� �ϰ��� �Ѵٸ� ������ Ŭ���̾�Ʈ���� ��Ʈ��(�������)�� �ʿ���!!
		 * 
		 * * ���� : ���μ������� ����� ����ϴ°�! (��Ʈ���� �����ϱ� ���� ��)
		 * 
		 * * ���� ���α׷��� (TCP��� / UDP���)
		 * TCP��� : ������ ���ۼӵ��� ����! �����Ͱ� ��Ȯ�ϰ� ���������� ���� ������! (�ŷڼ��� �䱸�Ǵ� ���α׷� : HTTP, �̸���, ..)
		 * UDP��� : ������ ���ۼӵ��� ����! �ŷڼ� ���� ������ ���޵� �� ����!! (�����͸� ���� �ӵ��� �����ϰ��� �ϴ� ���α׷� : �ǽð� ������ ����)
		 * 
		 */
		
		
		
		
	}

}
