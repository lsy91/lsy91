package inheritanceEx2;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=0; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			
			case 1:
				System.out.println("Tire 교체");
				car.fTire = new Tire("앞쪽",5);
				break;
				
			case 2:
				System.out.println("Tire 교체");
				car.bTire = new Tire("뒤쪽",3);
				break;
				
			default :
				System.out.println("Tire 정상");
			}
			
			System.out.println("--------------------");
		}
	}

}
