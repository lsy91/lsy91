package inheritanceEx;

public class Car1 {
	
	Tire1 fTire = new Tire1("앞쪽", 3);
	Tire1 bTire = new Tire1("뒤쪽", 2);
	
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		if(fTire.roll() == false) {stop(); return 1;};
		if(bTire.roll() == false) {stop(); return 2;};
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
