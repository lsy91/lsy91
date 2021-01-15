package inheritanceEx3;

class Sports {

	String name; // 중복되는 멤버변수
	int inwon; // 중복되는 멤버변수

	Sports(String name, int inwon) { // 부모 생성자
		this.name = name;
		this.inwon = inwon;
	}

	void display() {
		System.out.println("종목명:" + name);
		System.out.println("인원수:" + inwon);
	}
}

class Baseball extends Sports {
//	String name;
//	int inwon;
	double ta;

	Baseball(String name, int inwon, double ta) {
		super(name, inwon); // 부모 생성자 호출
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}

	void display() {
//		System.out.println("종목명:" + name);
//		System.out.println("인원수:" + inwon);

		super.display(); // 부모 메서드 호출 (부모 메서드와 자식 메서드 이름이 똑같은 경우)
		System.out.println("타율:" + ta);
	}
}

class Football extends Sports {
//	String name;
//	int inwon;
	int goal;

	Football(String name, int inwon, int goal) {
		super(name, inwon);
//		this.name = name;
//		this.inwon = inwon;
		this.goal = goal;
	}

	void display() {
//		System.out.println("종목명:" + name);
//		System.out.println("인원수:" + inwon);

		super.display();
		System.out.println("골수:" + goal);
	}
}

public class Ex05_inheritance {

	public static void main(String[] args) {

		Sports bb = new Baseball("야구", 9, 0.345);
		bb.display();

		System.out.println();

		Sports fb = new Football("축구", 11, 6);
		fb.display();

		System.out.println("-------------------------");

		Sports arr[] = { new Baseball("야구", 9, 0.345), new Football("축구", 11, 6) }; // 객체배열

		for (int i = 0; i < arr.length; i++) {
			arr[i].display(); // 부모가 갖고있는 display() 메서드가 확인돼야 자식 display() 호출이 가능하다.
		}
	}

}
