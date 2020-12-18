package forEx;

public class MultiForEx5 {

	public static void main(String[] args) {
		
		// 1000원,5000원,10000원을 조합하여 3만원을 만드는 경우의 수
		
		int x = 1, y = 5, z = 10;
		int b = 0;
		
		for(int i=0; i<=30/z; i++) {
			for(int j=0; j<=30/y; j++) {
				for(int k=0; k<=30/x; k++) {
					if(30-(z*i+y*j+x*k)==0) {
						System.out.println(k+" "+j+" "+i);
						b++;
					}
				} // for 3
			} // for 2
		} // for 1
		System.out.println();
		System.out.println(b); // 총 경우의 수
	}

}
