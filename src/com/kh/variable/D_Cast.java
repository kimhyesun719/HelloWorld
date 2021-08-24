package com.kh.variable;

public class D_Cast {
	
	/*
	 * * ����ȯ : ���� �ڷ����� �ٲٴ� ��
	 * 
	 * * ��ǻ�Ϳ����� �� ó�� ��Ģ (��, ����ȯ�� �ʿ��� ��Ȳ)
	 * 1. ���� �����ڸ� �������� ���ʰ� �������� ���� �ڷ��� �̿��� ��!!
	 *    => ��, ���� �ڷ����� �ش��ϴ� ���� ���� ����!!
	 *    => ��, �ٸ� �ڷ����� ���� ���� �ϰ��� �Ѵٸ� ����ȯ�� �ʼ�!!
	 *    
	 *    �ڷ��� ������ = (�ڷ���)��;
	 *    
	 * 2. ���� �ڷ��� ������ ������ ����
	 * 
	 *	  �� + ��			=> ��� ����� ���� �ڷ������� ����!
	 *
	 *
	 * * ����ȯ ����
	 * 1. �ڵ�����ȯ => �ڵ����� ����ȯ�� �̷����� �츮�� ����ȯ ��ų �ʿ䰡 ����!!
	 * 2. ����(�����)����ȯ => �츮�� ���� ����ȯ ���Ѿ� ��\
	 * 
	 * 		[ǥ����]  (�ٲ��ڷ���)��
	 * 
	 *  * ���ǻ���
	 * boolean�� ����ȯ �Ұ�
	 * 
	 * 
	 */
	public void autoCasting() {
		/*
		 * * �ڵ�����ȯ 
		 * ���� ������ ���� �ڷ���(int)�� ū �ڷ���(long) ���� ���� �� 
		 * �ڵ����� ������ ���� �ڷ����� ū �ڷ������� �ٲ㼭 ó�� ����
		 */
		
		// 1. int(4byte) => double(8byte) //����->�Ǽ��� ����
		int i1 = 12;
		double d1 = /*(double)*/i1; // ū �ڷ����� ���� �ڷ����� ��°� ���� (�ڵ� ����ȯ)
		
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2;// 12 + 3.3 => 12.0 +3.3 =>15.3
		
		System.out.println("result : " + result);
		
		// 2. int(4byte) => long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = /*(double)*/f4;
		
		// === Ư�����̽� ===
		// 4. long(8byte) => float(4byte)
		//	  float�� �Ǽ��� �̱� ������ �������� long���� ����Ʈ�� ��� ǥ�� ������ ���� �� ũ��
		long l5 = 10000000000L;
		float f5 = /*(float)*/l5;
		
		// 5. char(2byte) <=> int(4byte)
		int num = /*(int)*/'A';
		System.out.println("num : " + num);
		
		char ch = 52498;
		System.out.println("ch : " + ch);
		
		// �� ���ڵ鸶�� ������ ���ڰ� �����Ǿ� �ֱ� ������ �ֹ������� ����ȯ ����
		// char�� ������ ���� �Ұ� => ���� ������ 0~65535
		
		// 6. byte �Ǵ� short���� ����
		byte b1 = 1;
		byte b2 = 10;
		
		// byte b3 = b1 + b2; // byte �� short�� ����� int�� ó���ϱ� ������ ó�� �Ҽ� ����
							  //		���� ����� ������ �� ū int���� => byte���� ���� �Ұ�
		
		byte b3 = (byte)(b1 + b2); //"��������ȯ" �ϸ� ���� ����!
		System.out.println("b3 : " + b3);
			
		
		
	}
	
	public void forceCasting() {
		// ��������ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲٴ� ��
		
		// double(8byte) => float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		
		// double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum; // 10.0 + 5.89 => 15.89 (double)
								  // �������� double���� int���� ���� �Ұ�-> �����߻�
		// ���� �ذ� ���
		// ���1. ���� ����� int������ ��������ȯ
		int iSum1 = (int)(iNum + dNum);//10.0+5.89 => (int)15.89=>15
		
		System.out.println("iSum1 : " + iSum1);
		
		// ���2. double�� ������ int������ ��������ȯ
		int iSum2 = iNum + (int)dNum; // 5.89���� ���������� ��ȯ��Ű�� ������ 5�� ��ȯ��
		System.out.println("iSum2 : " + iSum2);
		
		// �Ǽ����� ���������� ���� ����ȯ �� �Ҽ��� �Ʒ� �κ��� ������(*������ �ս� �߻� ���ɼ� ��)
		
		// ���3. ���� ����� �ƿ� double�� ������ ����
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		// ** ������ �ս� �׽�Ʈ**
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		// -128 ~ 127
		System.out.println("bNum2 : " + bNum2);
		
		
	}
	
	
	

}
