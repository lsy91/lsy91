package multiForEx;

public class MultiforEx9 {

	public static void main(String[] args) {
	
		for (int i = 0; i < 5; i++) { // 삼각형의 단수
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" "); // 해당 단수에서 공백의 개수
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*"); // 해당 단수에서 *의 개수
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 9 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//       *
//      ***
//     *****
//    *******
//   *********
//   *********
//    *******
//     *****
//      ***
//       *
