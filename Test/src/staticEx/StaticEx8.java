package staticEx;

public class StaticEx8 {
	
	static String name = "Kevin";
	static int age = 28;
	static String status = "single";
	static String job = "teacher";
	static String info;
	
	static {
		info = name + "-" + age + "-" + status + "-" + job;
	}
	
	public static void main(String[] args) {
		
		System.out.println(info); // Kevin-28-single-teacher
	}

}
