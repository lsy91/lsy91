package methodEx;

public class ComEx {

	public static void main(String[] args) {
		
		Com c = new Com(); // 객체를 생성하면 라이브러리 클래스의 생성자로 이동한다
		
		int values1[] = {1,2,3};
		int result1 = c.sum1(values1);
		System.out.println("result1: " + result1);
		
		int values2[] = {1,2,3,4,5};
		int result2 = c.sum1(values2);
		System.out.println("result: " + result2);
	}

}
