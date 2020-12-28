package staticEx;

public class Calcu {
	
	static double pi = 3.14159; // static을 안 붙여주면 실행클래스에 객체를 만들어줘야 함.
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
