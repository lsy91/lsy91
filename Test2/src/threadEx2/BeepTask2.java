package threadEx2;

public class BeepTask2 implements Runnable{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("click");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
