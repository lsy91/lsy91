package forEx;

public class MultiForEx1 {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			for(int j=2; j<=9; j++) {
				if(i<1) {
					System.out.printf(j+"단\t"); // 0번째 시행일 때,횡단으로 단 뽑고
				} 
				else {
					System.out.printf(j+"*"+i+"="+i*j+"\t"); // 2*1=2, 3*1=3, 4*1=4... 순으로 횡단으로 한 줄씩 뽑는 로직 
				}
			} // for
			System.out.println();
		} // for

	}

}
