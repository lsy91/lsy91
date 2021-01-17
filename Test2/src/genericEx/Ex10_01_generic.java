package genericEx;

class Top<T> { // 미지정 자료형. 하나의 클래스 안에서 여러가지 값을 타입에 상관없이 사용할 수 있음
	private T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
}

public class Ex10_01_generic {

	public static void main(String[] args) {

		Top<String> t1 = new Top<String>(); // 제네릭 타입
		System.out.println(t1); // t1뒤에 .toStirng()이 생략된거
		System.out.println(t1.toString());
		//	t1.data = "abc";

		t1.setData("Hello");
		//	System.out.println(t1.getData());

		String str = t1.getData();
		System.out.println("str:" + str);
		System.out.println("-----------------------");

		//	wrapper 클래스 : 기본 자료형(8가지)을 객체로 만들 수 있는 클래스
		//	int : Integer
		//	double : Double
		//	boolean : Boolean

		Top<Integer> t2 = new Top<Integer>();
		t2.setData(123);
		Integer it = t2.getData(); // int it = t2.getData();도 가능하다.
		System.out.println("it:" + it);

		System.out.println("-----------------------");

		Top t3 = new Top(); // T 타입을 <String> 타입으로 확정해주지 않았을 경우 ↓ ↓ ↓ ↓

		t3.setData("Hello");

		String str3 = (String) t3.getData(); // Object 클래스의 String 타입으로 강제형변환(다운캐스팅)
		System.out.println("str3:" + str3);

	}
}
