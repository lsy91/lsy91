package inheritanceEx2;

class Product {
	String code;
	String company;

	Product(String code, String company) {
		this.code = code;
		this.company = company;
	}

	void show() {
		System.out.println("코드: " + code);
		System.out.println("회사: " + company);
	}
}

class Computer extends Product {

	String opSys;
	int ram;

	Computer(String code, String company, String opSys, int ram) {
		super(code, company);
		this.opSys = opSys;
		this.ram = ram;
	}

	void show() { // 메소드 오버라이딩 (같은 타입, 같은 이름) // 부모클래스랑 메서드 이름이 다르면 오버라이딩이 아니다.
		super.show();
		System.out.println("운영체제: " + opSys);
		System.out.println("램: " + ram);
	}
}

public class Ex07_inheritance {

	public static void main(String[] args) {

		Product p = new Product("P01", "중앙"); // code, company
		Computer c = new Computer("C01", "삼성", "window10", 64);

		p.show();
		System.out.println();

		c.show();

	}

}