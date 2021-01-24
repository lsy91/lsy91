package inheritanceEx2;

class Product1 {
	String code;
	String company;
	
	Product1(String code, String company) {
		this.code = code;
		this.company = company;
	}
	
	void show() {
		System.out.println("코드: " + code);
		System.out.println("회사: " + company);
	}
}

class Computer1 extends Product1 {
	
	String opSys;
	int bit;
	
	Computer1(String code, String company, String opSys, int bit) {
		super(code, company);
		this.opSys = opSys;
		this.bit = bit;
	}
	
	void show() {
		super.show();
		System.out.println("운영체제: " + opSys);
		System.out.println("비트: " + bit);
	}
}

public class Ex07_상속 {

	public static void main(String[] args) {
		
		Product1 p = new Product1("P01","중앙"); // code, company
		Computer1 c = new Computer1("C01","삼성","window10",64);
		
		p.show();
		System.out.println();
		
		c.show();
	}

}

// 자식클래스의 부모클래스 멤버변수 상속, show 메서드 오버라이딩

//코드 : P01
//회사 : 중앙
//
//코드 : C01
//회사 : 삼성
//운영체제 : window10
//비트 : 64