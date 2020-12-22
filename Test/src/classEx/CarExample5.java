package classEx;

public class CarExample5 {

	public static void main(String[] args) {
		
		Car4 myCar1 = new Car4("V80");
		System.out.println("모델명: "+myCar1.model);

		Car4 myCar2 = new Car4("V80" , "검정");
		System.out.println("모델명: "+myCar2.model);
		System.out.println("색상: "+myCar2.color);
		
		Car4 myCar3 = new Car4("V80" , "검정", 350);
		System.out.println("모델명: "+myCar3.model);
		System.out.println("색상: "+myCar3.color);
		System.out.println("최고속도: "+myCar3.maxSpeed);

	}

}
