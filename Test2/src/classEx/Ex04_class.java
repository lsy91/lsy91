package classEx;

class Person {
	private String name; // 다른 클래스에서는 사용할 수 없다. // 이럴 때 setter 메소드를 쓴다.
	int age;
	double height;
	static String nation; // static 접근제한자는 이 변수를 공통으로 사용하고 싶을 때

//  생성자 - 객체 p1,p2 생성자
	Person() {
		System.out.println("Person 생성자");
	}

//  생성자 (객체를 어떻게 만드느냐에 따라 여러개 만들 수 있다.) - 객체 p3 생성자
	Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

//	메서드 정의
	void setName(String n) {
		name = n;
	}

	String getName() {
		return name;
	}
}

public class Ex04_class {

	public static void main(String[] args) {
		// 클래스란 내가 만들어 쓰는 자료형

		int a;
		a = 11;

		Person p1 = new Person(); // name 공간 , age 공간 , height 공간 // p1 : 참조변수(주소)
//				p1.name = "홍길동";
		p1.age = 25;
		p1.height = 149.8;
//				p1.nation = "대한민국"; // static 변수라서 이것도 가능하지만 
		Person.nation = "대한민국"; // static 변수 사용은 보통 클래스.변수명으로 한다 // 어떤 객체든 이 변수를 사용할 수 있다.
		p1.setName("홍길동"); // setName호출
//				System.out.println(p1.name);
		System.out.println(p1.getName());

		Person p2 = new Person();
//				p2.name = "윤아";
		p2.age = 35;
		p2.height = 189.8;

//				System.out.println(p2.name);
		System.out.println(p2.nation);

		Person p3 = new Person("하니", 10, 123.4);
		System.out.println(p3.getName());
		System.out.println(p3.age);
		System.out.println(p3.height);

	}

}
