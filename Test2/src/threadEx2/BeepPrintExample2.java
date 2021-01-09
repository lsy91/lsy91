package threadEx2;

public class BeepPrintExample2 {

	public static void main(String[] args) { // 메인스레드
		
		Runnable beepTask = new BeepTask();
		Thread thread1 = new Thread(beepTask);
		thread1.start();
		// 작업 스레드에 의해 BeepTask 객체의 run 메소드가 실행
		
		for(int i=0; i<5; i++) {
			System.out.println("프린트");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
