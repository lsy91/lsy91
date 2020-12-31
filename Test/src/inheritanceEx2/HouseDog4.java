package inheritanceEx2;

public class HouseDog4 extends Dog{
	
	public HouseDog4 (String name) {
		this.setName(name);
	}
	
	public HouseDog4 (int type) {
		if(type == 1) {
			this.setName("yorkshire");
		}
		else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	public void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
	public static void main(String[] args) {
		
		HouseDog4 happy = new HouseDog4("happy");
		HouseDog4 yorkshire = new HouseDog4(1);
		HouseDog4 bulldog = new HouseDog4(2);
		
		System.out.println(happy.name); // happy
		System.out.println(yorkshire.name); // yorkshire
		System.out.println(bulldog.name); // bulldog
		
		happy.sleep(); // happy zzz in house
		happy.sleep(2); // happy zzz in house for 2 hours
		yorkshire.sleep(); // yorkshire zzz in house
		bulldog.sleep(2); // bulldog zzz in house for 2 hours
	}

}
