package staticEx;

public class StaticEx10 {
	
	static String name = "이수용";
	int age = 30;
	static int nextAge = 30;
	
	StaticEx10() {
		this.nextAge++;
	}
	
	public static int getAge() {
		return nextAge;
	}
	public static void main(String[] args) {
		
		StaticEx10 info = new StaticEx10();
		
		System.out.println(info.name); // 이수용
		System.out.println(info.age+"살"); // 30살
		System.out.println("내년에 " + getAge() + "살이 됩니다."); // 내년에 31살이 됩니다.
	}

}
