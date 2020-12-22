package classEx;

public class Car001 {
	
	String com = "현대자동차";
	String m1 = "자가용";
	String m2 = "택시";
	String c1 = "검정";
	String c2 = "빨강";
	int ms = 200;
	
	Car001(String company) {
//		this.company = company; // 필드에 선언되지 않은 변수명
		company = com;
	}
	
	Car001(String company, String model) {
//		this.company = company;
//		this.model = model;
		company = com;
		model = m1;
	}
	
	Car001(String company, String model, String color) {
//		this.company = company;
//		this.model = model;
//		this.color = color;
		company = com;
		model = m1;
		color = c1;
	}
	
	Car001(String company, String model, String color, int maxSpeed) {
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
		company = com;
		model = m2;
		color = c2;
		maxSpeed = ms;
	}
}
