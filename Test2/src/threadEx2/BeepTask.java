package threadEx2;

public class BeepTask implements Runnable{ // 작업 스레드
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
