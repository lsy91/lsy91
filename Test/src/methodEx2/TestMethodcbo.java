package methodEx2;

class Updater1 {
	public void update(TestMethodcbo counter) {
		counter.count++;
	}
}

public class TestMethodcbo {
	
	int count = 0;
	
	public static void main(String[] args) {
		
		TestMethodcbo myCounter = new TestMethodcbo();
		System.out.println("before update: " + myCounter.count); // 0
		
		Updater1 myUpdater = new Updater1();
		
		myUpdater.update(myCounter);
		System.out.println("after update: " + myCounter.count); // 1

	}

}
