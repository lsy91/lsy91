package methodEx;
	
class Update1 {
	public void update(int count) {
		count++;
	}
}

public class TestMethodEx1 {

	int count = 10;
	
	public static void main(String[] args) {
		
		TestMethodEx1 myCounter = new TestMethodEx1();
		System.out.println("before update: " + myCounter.count);
		
		Update1 myUpdater = new Update1();
		myUpdater.update(myCounter.count);
		System.out.println("after update: " + myCounter.count);
		
	}

}

// before update : 10
// after update : 10
