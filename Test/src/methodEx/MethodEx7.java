package methodEx;

public class MethodEx7 {
	
	public void disp(char a, int b) {
		System.out.print(b + "\t");
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	public void disp(int a, int b, char c) {
		System.out.print((a-b) + "\t");
		for(int i=0; i<a-b; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	public void disp(char a, char b, int c) {
		System.out.print(c + "\t");
		for(int i=1; i<c+1; i++) {
			if(i%2 == 0) {
				System.out.print(a);
			} else {
				System.out.print(b);
			}
		}
	}
	public static void main(String[] args) {
		
		MethodEx7 ms = new MethodEx7();
		ms.disp('@', 3);
		ms.disp('#', 5);
		ms.disp('%', 7);
		ms.disp(9, 5, '%');
		ms.disp('@', '#', 7);
		
	}

}
