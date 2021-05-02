package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No28 {
	
	public static void main(String[] args) {
		
		int bridge_length = 2;
		
		int weight = 10;
		
		int[] truck_weights = {7,4,5,6};
		
		int answer = solution(bridge_length, weight, truck_weights);
		
		System.out.println(answer);
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		
		// 기다리고 있는 트럭
		Queue<Integer> waitTruck = new LinkedList<Integer>();
		
		// 이동중인 트럭
		List<Truck> workingTruck = new ArrayList<Truck>();
		
		// 트럭의 무게를 모두 넣어줌.
		for( int truck : truck_weights) {
			waitTruck.add(truck);
		}
		
		// 이동한 시간.
		int time = 0;
		
		// 다리 위에 있는 총 무게
		int totalWeight = waitTruck.peek();
		
		// 첫번째 트럭은 working에 넣어주기
		workingTruck.add(new Truck(waitTruck.poll(),0));
		
		// 운행중 트럭이 모두 없어질 때까지
		while ( !workingTruck.isEmpty() ) {
			
			time++;
			
			// 이동중인 버스가 있으면 모두 한칸 씩 이동시켜준다.
			for(int i=0; i<workingTruck.size(); i++) {
				workingTruck.get(i).index++;
			}
			
			// 도착한 트럭이 있으면 빼준다.
			// 끝까지 갔으면 working에서 제외시켜준다.
			if( workingTruck.get(0).index > bridge_length ) {
				totalWeight -= workingTruck.get(0).weight;
				workingTruck.remove(0);
			}
			
			// 더 올릴 수 있는 경우에는 대기에서 빼주고 working에 넣어준다.
			if( !waitTruck.isEmpty() && totalWeight + waitTruck.peek() <= weight ) {
				int nextTruck = waitTruck.poll();
				totalWeight += nextTruck;
				workingTruck.add(new Truck(nextTruck,1));
			}
		}
		
		answer = time;
		
		return answer;
	}
	
	static class Truck {
		int weight = 0;
		int index = 0;
		
		public Truck(int weight, int index) {
			this.weight = weight;
			this.index = index;
		}
	}
}
