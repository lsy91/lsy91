package staticEx;

public class ShopService01 {
	
	static ShopService01 ss = new ShopService01();
	
	ShopService01() {
		
	}
	
	static ShopService01 getInstance() {
		return ss;
	}
}
