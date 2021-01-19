package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return title + "/" + price;
	}
}
public class Ex10_09_HashMap {

	public static void main(String[] args) {
		
		Map<String,Book> hm = new HashMap<String,Book>();
		
		Book bk1 = new Book("자바",3000);
		Book bk2 = new Book("오라클",2000);
		Book bk3 = new Book("JSP",1000);
		
		hm.put("교보문고", bk1);
		hm.put("영풍문고", bk2);
		hm.put("yes24", bk3);
		// hm.put("yes24", new Book("JSP",1000)); // bk3 변수 대신 이렇게 객체를 바로 넣어줘도 된다.
		
		System.out.println(hm);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("서점 입력: ");
		String bookstore = sc.next();
		
		// if(hm.get(bookstore) == null) {
		if(hm.containsKey(bookstore) == false) {
			System.out.println("서점 잘못 입력함");
		}
		else {
			System.out.println(hm.get(bookstore));
		}
		
		System.out.println(hm.size());
		
		hm.clear(); // 해쉬맵의 모든 데이터를 삭제하는 메서드
		System.out.println(hm.size());
		sc.close();
	}

}
