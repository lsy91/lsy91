package forEx;

public class MathRandomEx1 {

	public static void main(String[] args) {
		
		int a = 0;
		
		for(int i=0; i<6; i++) {
			a = (int)(Math.random()*100); // 0~100
			System.out.print(a + " ");
		}

	}

}
