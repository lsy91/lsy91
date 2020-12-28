package staticEx;

public class ShopServiceExam {

	public static void main(String[] args) {
		
		ShopService sv1 = ShopService.getInstance();
		ShopService sv2 = ShopService.getInstance();
		
		if(sv1 == sv2) {
			System.out.println("같은 ShopService 객체 입니다."); // true
		}
		else {
			System.out.println("다른 ShopService 객체 입니다."); // false
		}
	}

}
