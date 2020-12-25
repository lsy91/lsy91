package methodEx;

public class OverloadEx01 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(); // Calculator 클래스 객체를 생성하여 해당 클래스 내에 있는 메서드를 호출
		
		System.out.println(c.add(10.5, 4));
		System.out.println(c.add(10.5, 4, 1));
		
		c.disp(9,5,'&');
		c.disp('@', '#', 7);
		
		double result1 = c.areaRectangle(10);
		double result2 = c.areaRectangle(10,20);
		System.out.println(result1);
		System.out.println(result2);
		

	}

}
