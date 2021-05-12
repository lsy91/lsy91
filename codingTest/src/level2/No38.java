package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No38 {
	
	List<String> candidateKey = new ArrayList<String>();
	
	public int solution(String[][] relation) {
		
		// 컬럼으로 가능한 모든 조합을 구한다. 이미 나온 후보키가 포함되는 경우는 버린다.
		int[] flag = new int[relation[0].length];
		powerSet(relation,flag,0);
		
		return candidateKey.size();
	}
	
	private void powerSet(String[][] relation, int[] flag, int index) {
		
		if( index == flag.length ) {
			
			String s = "";
			
			for( int i=0; i<flag.length; i++) {
				if(flag[i] == 1) {
					s += String.valueOf(i);
				}
			}
			
			if(s.equals("") || s.equals(null)) return;
			// 후보키가 될 수 없는 경우.
			
			if( !candidateKey.isEmpty() ) {
				for(int i=0; i<candidateKey.size(); i++) {
					// 후보키 꺼내서 비교
					String candiKey = candidateKey.get(i);
					
					boolean possible = false;
					
					for( char c : candiKey.toCharArray() ) {
						if(!s.contains(String.valueOf(c))) {
							possible = true;
							break;
						}
					}
					if(!possible) return;
				}
			}
			
			// 후보키가 되는지 확인한다.
			Map<String,Integer> duplicateCheck = new HashMap<String,Integer>();
			
			String[] arrS = s.split("");
			
			for(int j=0; j<relation.length; j++) {
				
				String s2 = "";
				
				for( int i=0; i<arrS.length; i++) {
					s2 += relation[j][Integer.valueOf(arrS[i])];
				}
				
				if(duplicateCheck.get(s2) == null) duplicateCheck.put(s2, 1);
				else return;
			}
			
			// 위에서 return 되지 않았다면 후보키를 추가해준다.
			candidateKey.add(s);
			
			return;
		}
		
		flag[index] = 0;
		powerSet(relation, flag, index+1);
		
		flag[index] = 1;
		powerSet(relation, flag, index+1);
	}
}
