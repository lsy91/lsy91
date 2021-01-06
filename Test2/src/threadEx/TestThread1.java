package threadEx;

public class TestThread1 extends Thread{ // API에서 상속받음
	
	public void run() {
		System.out.println("thread run.");
	}
	public static void main(String[] args) {
		
		TestThread1 test = new TestThread1();
		test.start(); // Thread 메서드
		System.out.println("main run."); // 메인메서드라서 최우선 실행됨.
	}
	
	// main run.
	// thread run.

}
