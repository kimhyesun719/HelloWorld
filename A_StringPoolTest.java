package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// StringŬ������ toString�޼ҵ� �̹� �������̵� �Ǿ�����!(���� ��� ���ڿ��� ��ȯ�ϵ���)
		
		System.out.println(str1 == str2);//false(�ּҰ� �񱳶�)
		
		System.out.println(str1.equals(str2));
		// String Ŭ������ equals�޼ҵ� �̹� �������̵� �Ǿ�����!!(�ּҰ� �񱳰� �ƴ� ���� ��� ���ڿ��� ��)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String Ŭ������ hashCode�޼ҵ� �̹� �������̵� �Ǿ�����!!(�ּҰ��� �ƴ� ���� ��� ���ڿ� ������ ������)
		
		//��¥ �ּҰ��� �˰�ʹٸ� System.identityHashCode(���۷���)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. ���ڿ��� ���ͷ������� ����
		String str1 = "hello";
		String str2 = "hello";
		// ���ͷ� ���ý� ���Ǯ(String Pool)������ �ö�
		// String Pool�� Ư¡ : ������ ���ڿ��� ���� �� ����
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // true (�ּҰ���ġ)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		
		String str3 = "hi";
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
		// String Ŭ���� == �Һ�Ŭ����(������ �ʴ� Ŭ����)
		// ������ �����ϱ� �ϳ� �� �ڸ����� �����Ǵ� ������ �ƴϴ�
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// �����ϴ� ���� ������ ���ڿ� �ڸ����� ���� �Ǵ°� �ƴ�
		// ���ο� ���� �����ϵ��� ��(���ο� �ּҰ� �ο����� == �ּҰ� ����)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));

		
		
		
	}

}
