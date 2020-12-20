package arrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int total = 0;
		
//		int list[] = {2000,3000,5000,7000,2500,8000,9000,1000,3500,8300};
		
		int list[] = new int[10];
		list[0] = 2000;
		list[1] = 3000;
		list[2] = 5000;
		list[3] = 7000;
		list[4] = 2500;
		list[5] = 8000;
		list[6] = 9000;
		list[7] = 1000;
		list[8] = 3500;
		list[9] = 8300;
		
		System.out.print("상품가격 Lists\n-----------------------\n");
		
		for(int i=0; i<list.length; i++) {
			System.out.printf("\t상품"+(i+1)+" : "+list[i]);
			if(i==9) {
				for(int j=0; j<list.length; j++) {
					total += list[j];
				}
				System.out.printf("\n\t총합계 : "+total);
				System.out.printf("\n\t평 균 : %.2f",total/10.0);
				System.out.print("\n-----------------------------");
			}
			else {
				System.out.println();
			}
		}

	}

}
