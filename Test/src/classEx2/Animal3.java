package classEx2;

public class Animal3 {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		Animal3 lion = new Animal3();
		lion.setName("사자");
		System.out.println(lion.name);
		
		Animal3 tiger = new Animal3();
		tiger.setName("호랑이");
		System.out.println(tiger.name);
		
		Animal3 leopard = new Animal3();
		leopard.setName("표범");
		System.out.println(leopard.name);

	}

}
