package packageEx;

public class Aclass1 {
	
	Aclass1 a1 = new Aclass1(true);
	Aclass1 a2 = new Aclass1(1);
	Aclass1 a3 = new Aclass1("문자열");
	
	public Aclass1(boolean b) {} // 모든 클래스,필드,생성자,메서드 빌려쓰기 가능
	Aclass1(int b) {} // 같은 패키지의 클래스,필드,생성자,메서드 빌려쓰기 가능
	private Aclass1(String s) {} // 해당 클래스 외에 빌려쓰기 불가능
}
