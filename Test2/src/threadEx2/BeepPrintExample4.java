package threadEx2;

public class BeepPrintExample4 extends Thread{

	public static void main(String[] args) {
		
		Runnable beepTask41 = new BeepTask41();
		Thread thread41 = new Thread(beepTask41);
		thread41.start();
		
		try {
			thread41.join();
		} catch (InterruptedException e) {}
		

		Runnable beepTask42 = new BeepTask42();
		Thread thread42 = new Thread(beepTask42);
		thread42.start();
		
		try {
			thread42.join();
		} catch (InterruptedException e) {}

		Runnable beepTask43 = new BeepTask43();
		Thread thread43 = new Thread(beepTask43);
		thread43.start();
		
		try {
			thread43.join();
		} catch (InterruptedException e) {}
		
		System.out.println("end");
	}

}
