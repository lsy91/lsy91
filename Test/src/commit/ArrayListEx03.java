package commit;

import java.util.ArrayList;
import java.util.Scanner;

class Music1 {
	private String title;
	private String singer;
	private int price;
	
	Music1(String title, String singer, int price) {
		this.title = title;
		this.singer = singer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return title + "/" + singer + "/" + price;
	}
}

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		ArrayList<Music1> list = new ArrayList<Music1>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("제목:");
			String title = sc.next();
			
			System.out.print("가수:");
			String singer = sc.next();
			
			System.out.print("가격:");
			int price = sc.nextInt();
			
			Music1 m = new Music1(title,singer,price);
			list.add(m);
//			System.out.println(m); // toString 메서드로 오버라이드 되기 전까진 ArrayList 번지값 호출
			
			System.out.println("계속?");
			String retry = sc.next();
			
			if(!retry.equals("y")) {
				break;
			}
		} // while
		
		System.out.println(list.toString());
		
		while(true) {
			
			boolean flag = false;
			
			System.out.print("찾는 제목 입력:");
			String searchTitle = sc.next();
			
			for(int i=0; i<list.size(); i++) {
				if(searchTitle.equals(list.get(i).getTitle())) {
					System.out.println( searchTitle +
							"의 가수명은 " + list.get(i).getSinger());
					
					flag = true;
				}
			} // for
			
			if (flag == false) {
				System.out.println("찾는 제목이 없습니다.");
			}
			
			System.out.println("계속?");
			String retry = sc.next();
			if(!retry.equals("y")) {
				break;
			}
		} // while
		
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
