package inheritanceEx2;

public class HouseDog extends Dog{
	
	public void sleep() {
		System.out.println(this.name + " zzz in house"); // 메서드 오버라이딩
	}
	
	public static void main(String[] args) {
		
		HouseDog houseDog = new HouseDog();
		
		houseDog.setName("happy");
		houseDog.sleep();
	}

}
