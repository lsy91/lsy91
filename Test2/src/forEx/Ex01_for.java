package forEx;

public class Ex01_for {

	public static void main(String[] args) {
		
		// 1~10출력 합계 구하기
		int sum = 0;
		
		for(int i=1; i<11; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("sum:" + sum);
		
		// 1~100까지의 수 중에서 5의 배수이면서 7의 배수인 수 출력
		
		for(int i=1; i<=100; i++) {
			if(i%5 == 0 && i%7 == 0) {
				System.out.println(i);
			}
		}
//		1 1
//		1 2
//		1 3
//		2 1
//		2 2
//		2 3
		
		for(int i=1; i<3; i++) {
			for(int j=1; j<4; j++) { // for문 블럭을 빠져나가면 증감식으로 이동한 다음 조건식을 확인한다.
				System.out.printf("%d %d\n", i, j);
			}
		}
		
		//1~10까지 출력
		for(int i=1; i<11; i++) {
			if(i==5) {
				break; // break하면 내부블럭이 아니라 for문 바깥으로 아예 빠져나간다.
			}
			System.out.println(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<11; i++) {
			if(i==5) {
				continue; // continue는 아래쪽으로 실행을 무시하고 증감식으로 이동한다.
			}
			System.out.println(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
//		***2단***
//		2*1 = 2
//		2*2 = 4
//		2*9 = 18
//		-----------
//		***3단***
//		3*1 = 3
//		3*2 = 6
//		3*9 = 27
//		-----------
//		***9단***
//		9*1 = 9
//		9*9 = 81
//		-----------
		
		for(int i=2; i<10; i++) {
			System.out.println("***"+i+"단***");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("-------------");
		}
		System.out.println();
		
		
		//짝수단만 나오게
		for(int i=2; i<10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println("***"+i+"단***");
			for(int j=1; j<10; j++) {
				if(i<j) {
					break;
				}
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("-----------");
		}
		
//		***2단***
//		2*1=2
//		2*2=4
//		-----------
//		***4단***
//		4*1=4
//		4*2=8
//		4*3=12
//		4*4=16
//		-----------
//		***6단***
//		6*1=6
//		6*2=12
//		6*3=18
//		6*4=24
//		6*5=30
//		6*6=36
//		-----------
//		***8단***
//		8*1=8
//		8*2=16
//		8*3=24
//		8*4=32
//		8*5=40
//		8*6=48
//		8*7=56
//		8*8=64
//		-----------
	}

}
