package staticEx;

public class StaticEx3 {
	
	static int count = 0;
	
	StaticEx3() {
		this.count++;
		System.out.println(StaticEx3.getCount());
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		
		StaticEx3 st1 = new StaticEx3(); // 1
		StaticEx3 st2 = new StaticEx3(); // 2
		StaticEx3 st3 = new StaticEx3(); // 3 // getCount 메서드를 공통으로 씀
		System.out.println(StaticEx3.getCount()); // 3
	}

}
