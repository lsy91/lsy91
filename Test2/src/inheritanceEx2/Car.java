package inheritanceEx2;

public class Car{
	
	Tire fTire = new Tire("앞쪽",3);
	Tire bTire = new Tire("뒤쪽",2);
	
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		if(fTire.roll() == false) {stop(); return 1;};
		if(bTire.roll() == false) {stop(); return 2;};
		
		return 0;
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
