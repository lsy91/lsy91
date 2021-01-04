package interfaceEx;

public class ZooKeeper1 {
	
	public void feed(Predator1 predator) { // 메소드 오버로딩
		System.out.println(predator.getFood());
	}
	public static void main(String[] args) {
		
		ZooKeeper1 zooKeeper = new ZooKeeper1();
		Tiger1 tiger = new Tiger1();
		Lion1 lion = new Lion1();
		Leopard1 leopard = new Leopard1();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(leopard);
	}

	
}
