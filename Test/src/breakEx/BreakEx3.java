package breakEx;

public class BreakEx3 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==4) {
					break;
				}
				System.out.println(j+","+i+"\t");
			}
			
			if(i>2) { // i가 2일때 이 if문에서 break 되지 않으므로 i=3까지 반복
				break;
			}
			System.out.println();
		} // for
	}

}
