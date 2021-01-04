package interfaceEx;

public class ZooKeeper {

	public void feed(Tiger tiger) {
		System.out.println("호랑이가 오면 사과를 던져준다.");
	}
	
	public void feed(Lion lion) {
		System.out.println("사자가 오면 바나나를 던져준다.");
	}
	
	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
	
	}
}
