package stringEx;

public class StringFormatEx01 {

	public static void main(String[] args) {
		
		System.out.println("# 위치: 오른쪽 붙임, 왼쪽 붙임");
		System.out.printf("%10s %10s\n","Java","PYTHON");
		// 앞에서 10칸 띄운다
		System.out.printf("%-10s %-10s\n","Java","PYTHON");
		// 뒤로 10칸 띄운다
		System.out.println();
		
		System.out.println("# 자리수: 10");
		System.out.printf("%d %d\n",12345,67890);
		System.out.printf("%10d %10d\n",12345,67890);
		System.out.println(); // 숫자열도 문자열과 같다
		
		System.out.println("# 순서: 2$ 1$");
		System.out.printf("%d %d\n",12345,67890);
		// 기본값 : %1$d %2$d
		System.out.printf("%2$d %1$d\n",12345,67890);
		// 앞의 숫자열이 2번째로, 뒤의 숫자열이 1번째로
		System.out.println();
		
		System.out.println("# 정밀도: .숫자");
		System.out.printf("%d %d\n",100,100);
		System.out.printf("%.3f %.5f\n",100.12345f,100.56789f);
		System.out.printf("%.3f %.5f\n",100000.89399f,100000.9999999);
		// 앞의 실수는 엉뚱한 값이 출력되고, 뒤의 실수는 반올림 되어 출력된다. 뒤에 f가 붙고 안 붙고 차이

	}

}
