package staticEx;

public class ShopServiceExam01 {

	public static void main(String[] args) {
		
		ShopService01 sv1 = new ShopService01();
		ShopService01 sv2 = new ShopService01();
		
		if(sv1 == sv2) {
			System.out.println("같은 ShopService 객체 입니다."); // false
		}
		else {
			System.out.println("다른 ShopService 객체 입니다."); // true
		}
		
		// 라이브러리 클래스의 접근 제한자 차이
	}

}
