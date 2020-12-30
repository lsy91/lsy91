package classEx2;

public class ClassStudy {

	int total;
	float average;
	String pass;
	int s1, s2, s3;
	
	ClassStudy(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = 93;
	}
	
	public int total() {
		return s1 + s2 + s3;
	}
	public double average() {
		return (double)(s1 + s2 + s3) / 3;
	}
	public String pass() {
		 return average() >=70 ? "합격":"불합격";
		
	}
	
	public static void main(String[] args) {
		
		ClassStudy cs = new ClassStudy(47,55,91); // 생성자를 통해 매개변수 91이 93이 됌
		System.out.println("총점: " + cs.total()); // 195
		System.out.printf("평균: %.2f\n" , cs.average()); // 65.00
		System.out.println("당락: " + cs.pass()); // 불합격
	}

}
