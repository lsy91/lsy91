package staticEx;

public class SingletonEx01 {

	public static void main(String[] args) {
		
		St01 sv1 = St01.getInstance();
		St01 sv2 = St01.getInstance();
		
		if(sv1 == sv2) {
			System.out.println("같은 ShopService 객체 입니다.");
		}
		else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}

}

// 같은 ShopService 객체 입니다.
