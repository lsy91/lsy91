package operatorEx;

public class OperatorEx11 {

	public static void main(String[] args) {
		
		int score = 75 + 20;
		char grade = (score > 90)? 'A' : ((score>80)? 'B':'C'); // 삼항조건연산 안에 삼항조건연산
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
