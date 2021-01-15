package inheritanceEx3;

class Human {
	private String name;
	private int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
} // Human

class Employee extends Human {
//	private String name;
//	private int age;
	private String workplace;
	private String part;

	Employee(String name, int age, String workplace, String part) {
		super(name, age);
		this.workplace = workplace;
		this.part = part;
	}

	void display() {
		super.display();
		System.out.println("직장: " + workplace);
		System.out.println("부서: " + part);
	}
} // Employee

class Teacher extends Employee {
//	private String name;
//	private int age;
//	private String workplace;
//	private String part;
	private String subject;

	Teacher(String name, int age, String workplace, String part, String subject) {
		super(name, age, workplace, part);
		this.subject = subject;
	}

	void display() {
		super.display();
		System.out.println("과목: " + subject);
	}
} // Teacher

public class Ex06_inheritance {

	public static void main(String[] args) {

		Human h = new Human("써니", 30);
		Employee e = new Employee("웬디", 20, "삼성", "홍보부");
		Teacher t = new Teacher("슬기", 40, "중앙고", "생활지도부", "음악");

		h.display();
		System.out.println();

		e.display();
		System.out.println();

		t.display();

		System.out.println("-------------------------");

		// 다형성 연습
		Human em = new Employee("웬디", 20, "삼성", "홍보부");
		Human te = new Teacher("슬기", 40, "중앙고", "생활지도부", "음악"); // 부모클래스 이름으로 자식객체 타입을 똑같이 맞춰준다.

		Human arr[] = { new Employee("웬디", 20, "삼성", "홍보부"), new Teacher("슬기", 40, "중앙고", "생활지도부", "음악") }; // 그래야 배열을
																											// 만들 수 있는
																											// 조건이 충족되기
																											// 때문 (타입이
																											// 같아야 배열생성
																											// 가능)

		for (int i = 0; i < arr.length; i++) {
			arr[i].display(); // 부모클래스에도 display 메서드가 있으므로 자식객체의 display 메서드를 쓸 수 있다.
								// 없으면 못 쓴다. 없을 경우 자식타입으로 형변환하여 사용해야 한다.
		}
	}

}

