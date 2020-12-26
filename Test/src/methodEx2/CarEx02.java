package methodEx2;

public class CarEx02 {

	public static void main(String[] args) {
		
		Car02 myCar = new Car02();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(gasState) {
			System.out.println("gas를 주입하세요.");
		}
	}

}
