package methodEx;

public class CarEx3 {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3("소나타", "검정색", "휘발유", 200, 3000, 5);
		Car3 yourCar = new Car3("스타렉스", "하얀색", "경유", 250, 3500, 9);
		
		System.out.println("내 차는 " + myCar.model);
		System.out.println("내 차 색깔은 " + myCar.color);
		System.out.println("내 차 최고속도는 " + myCar.maxSpeed);
		System.out.println("내 차 연료는 " + myCar.fuel);
		System.out.println("내 차 배기량은 " + myCar.cc);
		System.out.println("내 차는 " + myCar.carry + "인승");
		
		System.out.println();
		
		System.out.println("당신 차는 " + yourCar.model);
		System.out.println("당신 차 색깔은" + yourCar.color);
		System.out.println("당신 차 최고속도는 " + yourCar.maxSpeed);
		System.out.println("당신 차 연료는 " + yourCar.fuel);
		System.out.println("당신 차 배기량은 " + yourCar.cc);
		System.out.println("당신 차는 " + yourCar.carry + "인승");
	}

}
