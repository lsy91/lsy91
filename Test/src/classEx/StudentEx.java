package classEx;

public class StudentEx {

	public static void main(String[] args) {
		
		Student s3 = new Student() { // Student 객체 생성
			public void dd() { // Student 클래스의 dd 메서드 오바라이딩
				System.out.println("됌?");
			}
		};
		
		s3.dd();
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		if(s1 == s2) {
			System.out.println("서로 다른 객체"); // 객체 타입은 같지만 서로 다른 번지를 참조하므로 출력되지 않는다.
		}

	}

}

class Student1 {
	
}
