package inheritanceEx;

public class CarEx1 {

	public static void main(String[] args) {
		
		Car1 car = new Car1();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("Tire 교체");
				car.fTire = new Tire1("앞쪽",5);
				break;
			case 2:
				System.out.println("Tire 교체");
				car.bTire = new Tire1("뒤쪽",3);
				break;
			default:
				System.out.println("Tire 정상");
			}
			System.out.println("-----------------------");
		}
	}

}
