package methodEx;

public class MethodEx1 {
	
	public void sub() {
		System.out.println("Hello Java!!!!!");
	}
	public static void main(String[] args) {
		
		MethodEx1 me = new MethodEx1(); // 객체 생성
		me.sub(); // 객체를 이용하여 MethodEx1의 sub 메서드 사용
		me.sub();
		me.sub();
	}

}
