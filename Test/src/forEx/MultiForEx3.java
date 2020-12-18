package forEx;

public class MultiForEx3 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { // 5번 시행
			for(int j=0; j<4-i; j++) {
				System.out.print(" "); // 4개 3개 2개 1개 0개
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*"); // 1개 2개 3개 4개 5개
			}
			System.out.println(); // 삼각형 모양을 만들기 위한 개행
		}

	}

}
