package methodEx;

public class CalEx01 {

	public static void main(String[] args) {
		
		Cal01 myCalcu = new Cal01();
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}

}
