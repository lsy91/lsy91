package methodEx;

public class Calculator01 {
	
	int plus(int x, int y) { // 디폴트 접근제한자는 default ㅋㅋ
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		System.out.println("실행결과: " + result);
	}
	
	void printIn(String message) {
		System.out.println(message);
	}
}
