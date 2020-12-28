package staticEx;

public class StaticEx9 {
	
	static String nation = "Korea";
	String name = "Kevin";
	int age = 28;
	String status = "single";
	
	public static void main(String[] args) {
		System.out.println(nation); // Korea
		
		StaticEx9 info2 = new StaticEx9();
		System.out.println(info2.name); // Kevin
		System.out.println(info2.age); // 28
		System.out.println(info2.status); // single
	}

}
