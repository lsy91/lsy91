package methodEx;

class Update2 {
	public void Updater(TestMethodEx2 counter) {
		counter.count++;
	}
}

public class TestMethodEx2 {
	
	int count = 10;
	
	public static void main(String[] args) {
		
		TestMethodEx2 myCounter = new TestMethodEx2();
		System.out.println("before update: " + myCounter.count);
		
		Update2 myUpdater = new Update2();
		myUpdater.Updater(myCounter);
		System.out.println("after update: " + myCounter.count);
	}

}

// before update: 10
// after update: 11