package numEx;

public class FloatEx1 {

	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14f;
		float sum = (float)dNum + fNum;
		float sum2 = (float)(dNum + fNum);
		
		System.out.println(dNum); // 3.14
		System.out.println(fNum); // 3.14
		System.out.println(sum); // 6.28
		System.out.println(sum2); // 6.28
		System.out.println((int)(dNum+fNum)); // 6

	}

}
