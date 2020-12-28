package staticEx;

public class StaticEx1 {
	
	int count = 0;
	
	StaticEx1() {
		this.count++;
		System.out.println(this.count);
	}
	
	public static void main(String[] args) {
		
		StaticEx1 st1 = new StaticEx1(); // 1
		StaticEx1 st2 = new StaticEx1(); // 1
		
		System.out.println(st1);
		System.out.println(st2);
		
		// 서로 다른 객체이므로 독립적으로 값을 부여받음
		
	}

}
