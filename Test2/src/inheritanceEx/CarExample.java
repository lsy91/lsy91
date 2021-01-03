package inheritanceEx;

public class CarExample {

	public static void main(String[] args) {
		
		Car01 car = new Car01();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HTire로 교체");
				car.tires[0] = new HTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 HTire로 교체");
				car.tires[1] = new HTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HTire로 교체");
				car.tires[2] = new HTire("뒤왼쪽", 17);
				break;
			case 4:
				System.out.println("뒤오른쪽 HTire로 교체");
				car.tires[3] = new HTire("뒤오른쪽", 17);
				break;
			default:
				System.out.println("Tire 정상");
			}
			
			System.out.println("------------------------------");
		}
	}

}
