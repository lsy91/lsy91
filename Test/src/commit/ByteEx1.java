package commit;

public class ByteEx1 {

	public static void main(String[] args) {
		
		byte bData = -128;
		System.out.println(bData);
		
//		byte bData2 = 128; // byte 범위 벗어남
		byte bData2 = 127;
		System.out.println(bData2);
		
		int iData = -2147483648;
		int iData2 = 2147473647;
		System.out.println(iData);
		System.out.println(iData2);
		
		char c = 'A';
		int uniCode = c;
		System.out.println(uniCode); // 65
		System.out.println(c); // A

	}

}
