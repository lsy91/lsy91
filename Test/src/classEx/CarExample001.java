package classEx;

public class CarExample001 {

	public static void main(String[] args) {
		
		Car001 car1 = new Car001("현대자동차"); // ()안의 타입만큼 값을 받아주는 생성자로 매개변수를 넘김
		System.out.println("car1.company: " + car1.com);
		System.out.println();
		
		Car001 car2 = new Car001("현대자동차", "자가용");
		System.out.println("car2.company: " + car2.com);
		System.out.println("car2.model: " + car2.m1);
		System.out.println();
		
		Car001 car3 = new Car001("현대자동차","자가용","빨강");
		System.out.println("car3.company: " + car3.com);
		System.out.println("car3.model: " + car3.m1);
		System.out.println("car3.color: " + car3.c1);
		System.out.println();
		
		Car001 car4 = new Car001("현대자동차","택시","검정",200);
		System.out.println("car4.company: " + car4.com);
		System.out.println("car4.model: " + car4.m2);
		System.out.println("car4.color: " + car4.c2);
		System.out.println("car4.maxSpeed: " + car4.ms);

	}

}
