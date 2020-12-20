package arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
		char b[] = new char[5];
		for(int i=0; i<b.length; i++) {
			int e = 65;
			b[i] = (char)(e+i);
			System.out.print(b[i]);
		}

	}

}
