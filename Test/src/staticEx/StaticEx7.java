package staticEx;

public class StaticEx7 {
	
	static int i = 10;
	
	static {
		System.out.println("Static i=" + i++); // 10
		System.out.println("Static i=" + ++i); // 12
	}
	public static void main(String[] args) {
		
		System.out.println("Main " + StaticEx7.i); // Main 12
	}

}
