package com.kh.gitArray;

public class gitA_Array {

	public static void main(String[] args) {
		
		// �迭 : ������ �޸� �ϳ��� ������ �������� ���� ���� �� �ִ�.
		// �������� : ���� �ڷ����� ������ ��ƾ� ��
		
		int[] arr = new int[10];
		
		// 2. �ݺ����� Ȱ���ؼ� 0�� �ε������� ������ �ε��� ���� ���������� �����ϸ鼭 ���� ����
		//		�Ź� 1~100 ���̿� �߻��Ǵ� ���� ���� ����
		for(int i=0; i<arr.length; i++) {
			arr[i] =(int)(Math.random() * 100 + 1);}
			
		// 3. �ݺ����� Ȱ���ؼ� �ش� �迭�� 0�� �ε���~ ������ �ε��� ����ִ� �� ���
		//		arr[x] : xx ���Ĵ�� �Ź� ����� �ǵ���
		for(int i=0; i<arr.length; i++) {	
			System.out.println("arr["+i+"] : " + arr[i]);
		
			}
	}
}