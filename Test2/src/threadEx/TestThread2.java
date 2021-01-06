package threadEx;

public class TestThread2 extends Thread{
	
	int seq;
	
	public TestThread2(int seq) {
		this.seq = seq;
		
		System.out.println(this.seq + "thread start.");
		
		try {
		Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.seq + " thread end.");
	}
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			Thread t = new TestThread2(i);
			t.start();
		}
		System.out.println("main end");
	}
	
//	0thread start.
//	0 thread end.
//	1thread start.
//	1 thread end.
//	2thread start.
//	2 thread end.
//	3thread start.
//	3 thread end.
//	4thread start.
//		:

}
