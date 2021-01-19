package collectionEx;

import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		return "이름" + "\t" + "전화번호" + "\n" + name + "\t" + tel;
	}
}
public class Ex10_05_ArrayList_Task {

	public static void main(String[] args) {
		
		ArrayList<Card> cd = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			boolean flag = false;
			
			System.out.print("1.명함추가  2.명함삭제  3.명함수정  4.명함보기  5.종료  ");
			int a = sc.nextInt();
			
			if(a==5) {
				break;
			}
			
			switch(a) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("전화번호를 입력하세요 : ");
				String tel = sc.next();
				
				Card c = new Card(name, tel);
				cd.add(c);
				break;
				
			case 2:
				System.out.println("이름을 입력하세요 : ");
				String n1 = sc.next();
				
				for(int i=0; i<cd.size(); i++) {
					if(cd.get(i).getName().equals(n1)) {
						cd.remove(cd.get(i));
						System.out.println("삭제되었습니다.");
						flag = true;
						break;
					}
					else {
						System.out.println("이름을 잘못입력하셨습니다.");
					}
				}
				
				//if(flag == false) {
				if(!flag) {
					System.out.println("이름 잘못 입력하셨음");
				}
				
				break;
				
			case 3:
				System.out.println("이름을 입력하세요 : ");
				String n2 = sc.next();
				
				for(int i=0; i<cd.size(); i++) {
					if(cd.get(i).getName().equals(n2)) {
						System.out.println("수정하실 전화번호는 : ");
						String t1 = sc.next();
						cd.get(i).setTel(t1);
						System.out.println("수정되었습니다.");
						flag = true;
					}
				} // for
				
				if(flag == false) {
					System.out.println("이름 잘못 입력하셨음");
				}
				
				break;
				
			case 4:
				System.out.println("이름\t\t전화번호");
				//for(int i=0; i<list.size(); i++) {
				for(Card one : cd) {
					//Card one = list.get(i);
					System.out.println(one.getName()+"\t\t"+one.getTel());
				}
				break;
				
			case 5:
				break;
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
