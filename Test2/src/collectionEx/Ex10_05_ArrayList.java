package collectionEx;

import java.util.ArrayList;
import java.util.Scanner;

class Card1 {
	private String name;
	private String tel;
	
	public Card1(String name, String tel) {
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
	
}
public class Ex10_05_ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Card1> list = new ArrayList<Card1>();
		
		while(true) {
			
			boolean flag = false;
			
			System.out.print("1.명함추가  2.명함삭제  3.명함수정  4.명함보기  5.종료  :");
			int select = sc.nextInt();
			
			if(select == 5) {
				break;
			}
			
			switch(select) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next(); // Card 클래스의 name 변수와 인덱스가 달라서 같은 변수명이라도 상관없다.
				
				System.out.print("전화번호를 입력하세요 : ");
				String tel = sc.next();
				
				Card1 input = new Card1(name, tel);
				list.add(input);
				break;
				
			case 2:
				System.out.println("삭제할 이름을 입력하세요 : ");
				String delName = sc.next();
				
				//for(Car1 delname : list) {
				for(int i=0; i<list.size(); i++) {
					Card1 delete = list.get(i);
					if(delete.getName().equals(delName)) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						flag = true;
						break; // ArrayList는 중복허용이기 때문에 리스트 안에 같은 이름이 있을 경우 break를 써주면 처음으로 찾은 이름 외엔 명령을 수행하지 못한다. 그래서 주의해야함.
					}
					// else { // 여기다 쓰면 리스트를 쭉 훑으면서 찾는 이름이 나타날 때마다 계속해서 삭제할 이름을 출력하기 때문에 비효율적
					//System.out.println("이름 잘못 입력");
					//}
					
					//if(flag == false) {
					
				} // for
				
				if(!flag) {
					System.out.println("이름 잘못 입력하셨음");
				}
				break;
			case 3:
				System.out.println("수정할 이름을 입력하세요"); // 수정은 삭제랑 공통된 부분이 많음
				
				String modifyName = sc.next();
				for(int i=0; i<list.size(); i++) {
					Card1 edit = list.get(i);
					if(edit.getName().equals(modifyName)) {
						System.out.print("수정할 전화번호는 : ");
						String modifyTel = sc.next();
						// edit.tel = modifyTel // private 변수라서 에러
						
						//edit.setTel(modifyTel); // 또는
						Card1 c = new Card1(modifyName,modifyTel);
						list.set(i, c);
						
						System.out.println("수정되었음");
						flag = true;
						
					}
				} // for
				
				if(flag == false) {
					System.out.println("이름 잘못 입력하셨음");
				}
				break;
				
			case 4:
				System.out.println("이름\t\t전화번호");
				// for(int i=0; i<list.size(); i++) {
					for(Card1 one : list) { // 확장 for문을 이용한 list 출력
						// Card one = list.get(i);
						System.out.println(one.getName() + "\t\t" + one.getTel());
				}
			
			default : System.out.println("번호 잘못 입력하셨음");
				
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
