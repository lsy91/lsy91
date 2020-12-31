package inheritanceEx2;

public class HouseDog1 extends Dog{
	
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	public void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
	public static void main(String[] args) {
		
		HouseDog1 houseDog = new HouseDog1();
		houseDog.setName("happy");
		houseDog.sleep(); // sleep 메서드 호출
		houseDog.sleep(3); // sleep(int hour) 메서드 호출
	}

}
