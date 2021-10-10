package gitIOchap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// �����ϰ� ����(file) ��������� ����
		// java.io.File Ŭ���� ������!
		
		try {
			
			// 1. ��������� ���� ���� ���� ���·� ���� ���� =>���� project�����ȿ� ������ ������
			File f1 = new File("test.txt");
			f1.createNewFile();	// �޼ҵ���� �����ؾ߸� ���� ������ �������!
		
			// 2. �����ϴ� ������ ���� ���� => �ش� ��α��� �����ϸ� ��
			File f2 = new File("E:\\test.txt"); // ����̸� �Է��Ѵ����� \
			f2.createNewFile();// �������� �ʴ� ��θ� �����ϸ� IOException �߻�
			
			//File f3 = new File("E:\\temp\\test.txt"); 
			//f3.createNewFile();
			// ������ �������� ������ ����� ���� ����
			
			// 3. ���� ���� ����� ���ϱ��� ��������� ����
			File tempFolder = new File("E:\\temp");
			tempFolder.mkdir(); // ������ ��������� �ϴ� �޼ҵ�
			
			File f3 = new File("E:\\temp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile()); // true �����̴�
			System.out.println(tempFolder.isFile()); // false ������
			
			// =====================================
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ : " + file.getAbsolutePath());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			
			
			
		} catch (IOException e) {
			e.printStackTrace(); // � ������ �ִ��� ������
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	/*
	 * ���α׷� ���� �����͸� �ܺθ�ü�� ����� �Ѵٰų� �Ǵ� �ܺθ�ü�κ��� �Է��� �޾� �� ����!!
	 * �ݵ�� �� �ܺθ�ü�� ��θ� ������ ��! �װ� �ٷ� ��Ʈ��!!
	 * 
	 * * ��Ʈ��(���)�� Ư¡
	 * - �ܹ��� : �Է��̸� �Է�/ ����̸� ��¸� ����!!
	 * 			= > �Է°� ����� ���ÿ� �Ϸ��� => �Է¿� ��Ʈ�� ���� ��¿� ��Ʈ�� ���� �־����
	 * - ���Լ���(FIFO) : ��ΰ� ������ ���� �����̱� ������ ���� �������� ���� ���´�!!
	 * 					=> �ð�����(delay) �̶�� ������ ���� �� ����!!
	 * 
	 * * ��Ʈ���� ����
	 * > ����� ������ (1byte¥�� / 2byte¥��)
	 * - ����Ʈ ��Ʈ�� : 1byte¥���� �Դٰ��� ����(���� ���� ���) => �Է�(InputStream) / ���(OutputStream)
	 * - ���� ��Ʈ�� : 2byte¥������ �Դٸ� ���ٸ� ����(���� ���) => �Է�(Reader) / ���(Writer)
	 * 
	 * > �ܺθ�ü�� ���� �����ϴ� ����
	 * - ��� ��Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ��� (�ʼ�)
	 * - ���� ��Ʈ�� : ���״�� ���� ���Ҹ� �ϴ� ��� (�ӵ��� ������ �Ѵٰų�, �׿ܿ� ������ ��ɵ��� �����ϴ� ..)
	 * 				������Ʈ�� �ܵ� ����� �Ұ���!! ��ݽ�Ʈ�� �ݵ�� �ʼ�
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
