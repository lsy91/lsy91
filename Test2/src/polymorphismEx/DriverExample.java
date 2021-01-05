package polymorphismEx;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 차량이 달립니다 -> 버스가 달립니다.
		driver.drive(taxi); // 차량이 달립니다. -> 택시가 달립니다.
	}

}
