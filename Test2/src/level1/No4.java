package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No4 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int[] stages = {
				4,4,4,4,4	
		};
		
		int[] result = solution(n,stages);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] solution(int N, int[] stages) {
		
		//단계 별 클리어하지 못한 사람의 수를 저장.
		int[] noClear = new int[N+1];
		
		for( int stage : stages) {
			if( stage == N+1) continue;
			noClear[stage]++;
		}
		
		System.out.println("클리어하지 못한 사람들 : " + Arrays.toString(noClear));
		
		// 단계별 도전자의 수를 저장.
		int[] challenger = new int[N+1];
		
		// 1단계는 모든사람이 도전.
		challenger[1] = stages.length;
		
		for(int i=2; i<=N; i++) {
			challenger[i] = challenger[i-1] - noClear[i-1];
		}
		
		System.out.println("도전자 수 : " + Arrays.toString(challenger));
		
		// 단계별 실패율을 저장.
		double[] failRate = new double[N+1];
		
		// 실패율 key만 보관.
		Set<Double> fails = new HashSet<Double>();
		
		for(int i=1; i<=N; i++) { // 실패율을 구하는 과정에서 0으로 나누는 경우를 조건으로 처리
			if(challenger[i] == 0) {
				failRate[i] = 0;
			} 
			else {
				failRate[i] = (double)noClear[i]/challenger[i];
				fails.add(failRate[i]);
			}
		}
		
		// 실패율을 정렬함.(오름차순으로 하고, 뒤에서부터 조회할 예정)
		List<Double> failList = new ArrayList<Double>(fails);
		Collections.sort(failList);
		
		System.out.println(failList.toString());
		
		int[] answer = new int[N];
		
		int index = N-1;
		for(int i=0; i<failList.size(); i++) {
			double rate = failList.get(i);
			
			for(int j=failRate.length-1; j>0; j--) {
				if(rate == failRate[j]) {
					answer[index] = j;
					index--;
				}
			}
		}
		
		return answer;
	}
}
