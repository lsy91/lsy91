package threadEx2;

public class BeepPrintExample31 {

	public static void main(String[] args) {
		
		Thread thread1 = new BeepThread();
		thread1.start();
		Thread thread2 = new ClickThread();
		thread2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("print");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	
	}

}
