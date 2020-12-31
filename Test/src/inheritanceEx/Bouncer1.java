package inheritanceEx;

public class Bouncer1 {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger(); // Animal1 클래스를 상속받은 Tiger 클래스의 객체생성
		tiger.setName("호랑이");
		System.out.println(tiger.name); // 호랑이
		tiger.bark(); // 어흥
		
		Lion lion = new Lion(); // Animal1 클래스를 상속받은 Lion 클래스의 객체생성
		lion.setName("사자");
		System.out.println(lion.name); // 사자
		lion.bark(); // 으르렁
		
	}

}
