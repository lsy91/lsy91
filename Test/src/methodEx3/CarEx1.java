package methodEx3;

public class CarEx1 {

	public static void main(String[] args) {
		
		Car1 myCar = new Car1();
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed()); // 현재 속도: 0
	
	
		myCar.setSpeed(60);
	
		if(!myCar.isStop()) { // myCar.isStop() 자체가 true 나 false가 된다.
			myCar.setStop(true);
		}
	
		System.out.println("현재 속도: " + myCar.getSpeed()); // 현재 속도: 60
	}
}
