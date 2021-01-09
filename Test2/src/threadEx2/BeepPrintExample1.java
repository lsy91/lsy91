package threadEx2;

public class BeepPrintExample1 {

	public static void main(String[] args) { // 다른 작업 스레드가 없기 때문에 메인 스레드는 1개
		
		for(int i=0; i<5; i++) {
			System.out.println("beep");
			try { Thread.sleep(1000); } catch(Exception e) {} // sleep(값/1000(초)) 간격으로 실행한다.
		}
			
		for(int i=0; i<5; i++) {
			System.out.println("프린트");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
