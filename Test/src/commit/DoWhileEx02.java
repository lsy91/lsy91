package commit;

public class DoWhileEx02 {

	public static void main(String[] args) {
		
		int i = 0;
		int x = 0;
		
		do {
			x += i;
			i++;
			
			if(i==10) {
				System.out.print(i+"=");
			} else if (i==11) {
				System.out.println(x);
			} else {
				System.out.print(i+"+");
			}
		} while(i<=10);
		
		int a = 11;
		int b = 0;
		
		do {
			a--;
			b = a+b;
			
			if(a > 1) {
				System.out.print(a + "+");
			} else {
				System.out.print(a + "=");
			}
		} while (a>1);
		
		System.out.println(b);
		
		int i1 = 10;
		int x1 = 0;
		
		do {
			x1 += i1;
			
			if(i1 == 1) {
				System.out.print(i1+"=");
			} else if (i1 == 0) {
				System.out.print(x1);
			} else {
				System.out.print(i1+"+");
			}
			i1--;
		}while(i1>=0);

	}

}
