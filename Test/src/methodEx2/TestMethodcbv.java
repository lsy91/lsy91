package methodEx2;

class Updater {
	public void update(int count) {
		count++;
	}
}

public class TestMethodcbv {
	
	int count = 0;
	
	public static void main(String[] args) {
		
		TestMethodcbv myCounter = new TestMethodcbv();
		System.out.println("before update: " + myCounter.count); // 0
		
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter.count);
		System.out.println("after update: " + myCounter.count); // 0
		
	}

}
