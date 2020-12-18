package forEx;

public class ForEx2 {

	public static void main(String[] args) {
		
		int odds[] = {1,3,5,7,9};
		System.out.println("# for 반복문 사용");
		
		for(int i=0; i<odds.length; i++) {
			System.out.println("odds["+i+"] : "+odds[i]);
		}
		
		for(int d:odds) {
			System.out.print(d);
		}
		
		System.out.println();
		String day[] = {"월","화","수","목","금","토","일"};
		System.out.println();
		System.out.println("#인덱스 사용");
		System.out.println(day[3]);
		
		System.out.println("#for 반복문 사용");
		for(int i=0; i<day.length; i++) {
			System.out.print(day[i]+" ");
		}
		
		System.out.println();
		for(int i=0; i<day.length; i++) {
			System.out.print(day[i]+",");
		}
		
		System.out.println();
		for(int i=0; i<day.length; i++) {
			System.out.print(day[i]+"\t");
		}
		
		System.out.println();
		System.out.println("#개선된 for문 사용");
		for(String a:day) {
			System.out.print(a);
		}
	}

}
