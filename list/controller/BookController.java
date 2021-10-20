package list.controller;

import java.util.ArrayList;

import list.model.vo.Book;

public class BookController {
	
	// ��������  ��� �ִ� bookList
	private ArrayList<Book> bookList = new ArrayList<Book>();
	{
		// �ʱⰪ 4������ �߰�
		bookList.add(new Book("�ڹ��� ����", "ȫ�浿", "��Ÿ", 20000));
		bookList.add(new Book("C���", "�踻��", "��Ÿ", 15000));
		bookList.add(new Book("������ �Ǿ�����", "������", "�ι�", 17500));
		bookList.add(new Book("������", "KH", "�Ƿ�", 10000));
	}
	
	
	public void insertBook(String title, String author, int category, int price) {
		/*
		 * 1. ���޹��� ������ ������ �Ű����� �����ڸ� �̿��Ͽ� Book ��ü ���� 
		 *    (��, ��ü ���� ��  ���ǻ��� :�帣 ��ȣ���� ���ǽ� �̿��ؼ� �帣��ȣ�� �ƴ� �帣���� �����ϸ鼭 ����!)
		 * 2. bookList�� 1���������� ������ Book��ü �߰�
		 */
		
		String ctg = "";
		
		if (category == 1) {
			ctg = "�ι�";
		}else if (category == 2) {
			ctg = "�ڿ�����";
		}else if (category == 3) {
			ctg = "�Ƿ�";
		}else if (category == 4) {
			ctg = "��Ÿ";
		}
		
		bookList.add(new Book(title, author, ctg, price));
		//
	}
	
	
	public ArrayList<Book> selectList(){
		/*
		 * 1. �ش� bookList ��ȯ
		 */
		
		return bookList; 	// �� �κ� �����ؾߵǿ�~! �켱�� null�� �س����
	}
	
	
	public ArrayList<Book> searchBook(String keyword){
		/*
		 * 1. �˻� ��� ����Ʈ�� ����� ����Ʈ(ArrayList<Book> searchList) ���� �� ����
		 * 2. �ݺ����� ���� bookList�� å�� �� å�� ���޹��� keyword�� "���� �Ǿ��ִ� ���" 
		 *    searchList�� �ش� Book��ü "�߰�"�ϱ� 
		 * 
		 * 3. searchList ��ȯ
		 */
		ArrayList<Book> searchList = new ArrayList<>() ;

		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		
		
		return searchList;   // �� �κ� �����ؾߵǿ�~! �켱�� null�� �س����
	}
	
	public int deleteBook(String title, String author) {
		/*
		 * 1. ����ڰ� �Է��� ������� ���ڸ��� ��ġ�� ��� ���������� ���� �� ���̰�, �װ� �ƴ� ��� ������ ������ ã�� ���� ����̴�.
		 *    �׷��� �̸� ó���ϱ� ���� result ������ 0���� �ʱ�ȭ �� ä�� ����� ����.
		 * 2. �ݺ����� ���� bookList�� å�� �� å���� ���޹��� title�� �����ϰ�, ���ڸ��� ���޹��� author�� ������ ��� 
		 *    �ش� �ε����� ���� "����"�ϰ� result 1�� ���� �� ����������(���̻� �ݺ����� ���� �ʿ�����ϱ� break!)
		 * 
		 * 3. result �� ��ȯ
		 */
		
		int result = 0;
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				bookList.remove(i);
				result = 1;
				break;
			}
		}
		
		
		
		return result;   // �� �κ� �����ؾߵǿ�~! �켱�� 0���� �س����
	}
	
	
	
	
}
