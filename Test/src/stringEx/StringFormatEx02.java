package stringEx;

public class StringFormatEx02 {

	public static void main(String[] args) {
		
		int k = 81;
		int e = 75;
		int m = 91;
		int sum = k + e + m;
		double avg = sum / 3.0;
		
		System.out.println("println을 사용");
		System.out.println("국어 : "+ k +"점");
		System.out.println("영어 : "+ e +"점");
		System.out.println("수학 : "+ m +"점");
		System.out.println("총점 : "+sum+"점");
		
		System.out.println();
		
		System.out.printf("printf를 사용");
		System.out.printf("\n국어 : %d점",k);
		System.out.printf("\n영어 : %d점",e);
		System.out.printf("\n수학 : %d점",m);
		System.out.printf("\n총점 : %d점",sum);
		System.out.printf("\n평균 : %.2f",avg);
		
		// PrintStream에 따라 달라지는 문법
	}

}
