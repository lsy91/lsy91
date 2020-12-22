package classEx;

public class StudentEx01 {

	public static void main(String[] args) {
		
		StudentEx02 studentHong = new StudentEx02(); // StudentEx02 객체를 참조하여 메서드를 빌려씀
		studentHong.studentName = "홍길동";
		studentHong.address = "서울시 마포구 대흥동";
		studentHong.showStudentInfor();

	}

}
