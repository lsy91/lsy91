package commit;

import java.util.ArrayList;
import java.util.Scanner;

class Person {
	
	private String id;
	private String pw;
	
	Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String toString() {
		return id + ":" + pw;
	}
}

public class ArrayListEx02 {

	public static void main(String[] args) {
		
		Person p1 = new Person("kim", "1234");
		Person p2 = new Person("park", "5678");
		Person p3 = new Person("choi", "9876");
		
		System.out.println(p1);
		System.out.println(p1.toString());
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("list: " + list.toString());
		
		System.out.println(list.size());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID:");
			String id = sc.next();
			
			System.out.print("PW:");
			String pw = sc.next();
			
			Person p = new Person(id,pw);
			list.add(p);
			
			System.out.print("계속?");
			String retry = sc.next();
			if(!retry.equals("y")) {
				break;
			}
		} // while
		
		System.out.println("list:" + list);
		
		for(int i = 0; i < list.size(); i++) {
			Person ps = list.get(i);
			
			System.out.println("ps:" + ps);
		}
		
		boolean flag = false;
		System.out.print("찾는 ID 입력: ");
		String SearchId = sc.next();
		
		for(int i = 0; i < list.size(); i++) {
			Person ps = list.get(i);
			if(ps.getId().equals(SearchId)) {
				System.out.println("찾는 PW:" + ps.getPw());
				flag = true;
			}
		} // for
		
		if(flag == false) {
			System.out.println("찾는 ID가 없습니다.");
		}
	}

}
