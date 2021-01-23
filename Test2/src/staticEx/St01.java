package staticEx;

public class St01 {
	
	private static St01 singleton = new St01();
	
	private St01() { // 생성자
		
	}
	
	static St01 getInstance() {
		return singleton;
	}
	
}
