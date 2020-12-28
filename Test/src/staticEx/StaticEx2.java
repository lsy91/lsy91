package staticEx;

public class StaticEx2 {

	static int count = 0; // static은 클래스영역에 저장돼 있는 거라서 객체들이 공통으로 쓴다.
	
	StaticEx2() {
		this.count++;
		System.out.println(this.count);
	}
	
	public static void main(String[] args) {
		
		StaticEx2 st1 = new StaticEx2(); // 1
		StaticEx2 st2 = new StaticEx2(); // 2
		
		// 주소는 다르지만 static 클래스영역에 저장되어 있으므로 값을 종속적으로 부여받음
	}

}
