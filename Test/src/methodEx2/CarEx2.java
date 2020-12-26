package methodEx2;

public class CarEx2 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2("G80",80);
		Car2 yourCar = new Car2("V80",100);
		
		System.out.println("내 차는 " + myCar.model);
		System.out.println("내 차 속도는 " + myCar.speed);
		
		System.out.println("당신 차는 " + yourCar.model);
		System.out.println("당신 차 속도는 " + yourCar.speed);

	}

}
