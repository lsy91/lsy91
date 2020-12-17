package breakEx;

public class BreakEx1 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(true) {
			i++;
			if(i<6) {
				System.out.println(i); // 1 2 3 4 5
			} else {
				break;
			}
		} // while
		
		i = 0;
		
		while(true) {
			i++;
			if(i>5) break;
			
			System.out.println(i); // 1 2 3 4 5
		}
	}
}

