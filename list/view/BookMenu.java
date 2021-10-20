package list.view;

import java.util.ArrayList;
import java.util.Scanner;

import list.controller.BookController;
import list.model.vo.Book;

public class BookMenu {
	
	private BookController bc = new BookController(); // BookController�� �޼ҵ���� ����ϱ� ���� ���۷���
	private Scanner sc = new Scanner(System.in); // ����ڿ��� Ű����� ���� �Է� �ޱ� ���� Scanner ��ü
	
	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("===== ���� �޴� ====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� �����ϱ�");
			
			System.out.println("0. ���α׷� �����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
		
	}
	
	// 1. �� ���� �߰��� view �޼ҵ�
	public void insertBook() {
		/*
		 * 1. ������ �Է¹ޱ� (String title)
		 * 2. ���ڸ� �Է¹ޱ� (String author)
		 * 3. �帣 �Է¹ޱ� (int category) --> ���ڷ� �Է¹ޱ� (1.�ι� / 2.�ڿ����� / 3.�Ƿ� / 4.��Ÿ)
		 * 4. ���� �Է¹ޱ� (int price)
		 * 
		 * 5. bc(BookController)�� insertBook�޼ҵ� ȣ���ϸ鼭 ���� ����� ����
		 */
		System.out.println("\n=== ���ο� ���� �߰� ===");
		
		System.out.print("�������� �Է� �� �ּ��� : ");
		String title = sc.nextLine();
		System.out.print("���ڸ��� �Է� �� �ּ��� : ");
		String author = sc.nextLine();
		System.out.print("�帣�� �Է� �� �ּ��� (1.�ι� / 2.�ڿ����� / 3.�Ƿ� / 4.��Ÿ) : ");
		int category = sc.nextInt();
		System.out.print("������ �Է� �� �ּ��� : ");
		int price = sc.nextInt();
		
		bc.insertBook(title, author, category, price);
		System.out.println("������ �߰� �Ǿ����ϴ�.");
		// ���� ������� �ۼ��غ����� ~ ����^^
	}
	
	
	// 2. ���� ��ü�� view �޼ҵ�
	public void selectList() {
		/*
		 * 1. bc(BookController)�� selectList() �޼ҵ带 ȣ�� ��
		 *    --> ���ƿ� ��� ���� ����Ʈ(ArrayList<Book> bookList)�ϳ� ���� ����
		 * 
		 * 2. ���ǽ� �̿��ؼ� 
		 * 2_1. bookList�� "����ִ� ���"    -->   "�����ϴ� ������ �����ϴ�." ��� �˶� ���� ���
		 * 2_2. bookList�� "������� ���� ���" -->   �ݺ����� ���� bookList ���� Book ��ü�� ���
		 * 
		 */
		
		System.out.println("\n=== ������� ��ü ��ȸ ===");
		
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("��������� ��� �ֽ��ϴ�.");
		}else
			for(int i=0; i<bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		
		// ���� ������� �ۼ��غ����� ~ ȭ����^^
	}
	
	
	// 3. ���� �˻��� view �޼ҵ�
	public void searchBook() {
		/*
		 * 1. �˻��� ������ Ű����� �Է¹ޱ� (String keyword) 
		 * 2. bc(BookController)�� searchBook() �޼ҵ�� ���� keyword �� ���� �ϸ鼭 ȣ��
		 *    --> �̶� ���ƿ� ��� ���� ����Ʈ(ArrayList<Book> searchList) �ϳ� ���� ����
		 *    
		 *    ** �� ��� ���� �� ������ Book ��ü�� �ƴ϶� ����Ʈ �ΰ���??
		 *    	  ���� Ű����� �˻��Ѵ�! ��, �� Ű���带 ������ ����� �ϳ��� �ƴ϶� �������� �� �ֱ� ������ ����Ʈ�� �޾ƺ���~!
		 * 
		 * 3. ���ǽ� �̿��ؼ�
		 * 3_1. searchList�� "����ִ� ���"    -->  "�˻� ����� �����ϴ�." ��� �˶� ���� ���
		 * 3_2. searchList�� "������� ���� ���" -->  �ݺ����� ���� searchList ���� Book ��ü�� ���
		 * 
		 */
		System.out.println("\n=== ���� �˻� �ϱ�(Ű����) ===");
		
		System.out.print("�˻��� ���� Ű���带 �Է� �Ͻʽÿ� : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		System.out.println("\n=== �˻� ��� ===");
		
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
		// ���� ������� �ۼ��غ����� ~ �� �ȳ��Ҿ��~!!
	}
	
	
	// 4. ���� ������ view �޼ҵ�
	public void deleteBook() {
		/*
		 * 1. ������ ������ �Է¹ޱ� (String title)
		 * 2. ������ ���ڸ� �Է¹ޱ� (String author)
		 * 
		 * ** �� ������ �Է¹޴°� �ƴ϶�  ���ڸ� �Է¹޳���??
		 *    ���� �������̶�� �ص� ���ڸ��� �ٸ� ������ ���� �� ���ڳ���~~����
		 *    �׷��� ���� �� Ȯ���� �Ϸ��� ������ ���ڸ� �� �� �Էƹ��� �ſ���~!!
		 *    
		 * 3. bc(BookConroller)�� deleteBook() �޼ҵ�� ���� title, author �� ���� �ϸ鼭 ȣ��
		 * 	  --> �̶� ���ƿ� ��� ���� result�� �ޱ�!
		 * 
		 * 4. ���ǽ� �̿��ؼ�
		 * 4_1. result�� 1�� ���               -->  "���������� ���������� �����Ǿ����ϴ�." ��� �˶� ���� ���
		 * 4_2. result�� 0�� ���    	  -->  "������ ������ ã�� ���߽��ϴ�." ��� �˶� ���� ���
		 *  
		 */
		
		System.out.println("\n=== ������ ���� �ϱ� ===");
		
		System.out.print("������ �������� �Է� �Ͻÿ� : ");
		String title = sc.nextLine();
		System.out.print("������ ���ڸ��� �Է� �Ͻÿ� : ");
		String author = sc.nextLine();
		
		int result = bc.deleteBook(title, author);
		
		if(result == 1) {
			System.out.println("���������� ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("���� �� ������ ã�� �� �߽��ϴ�.");
		}
		// ���� ������� �ۼ��غ����� ~ ���� ���� �������~!!
	}
	

}
