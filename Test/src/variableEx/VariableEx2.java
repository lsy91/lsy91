package variableEx;

public class VariableEx2 {

	public static void main(String[] args) {
		
		int v1 = 15;
		int v2 = 0;
		
		if(v1>10) {
			v2 = v1 - 10; // v2 == 5
		}
		
		int v3 = v1 + v2 + 5; // v3 == 15 + 5 + 5
		System.out.println(v3);
		
//		if(v1 > 10) {
//			v2 = v1 - 10;
//			System.out.println(v2);
//			
//			v3 = v1 + v2 + 5;
//			System.out.println(v3);
//		}

	}

}
