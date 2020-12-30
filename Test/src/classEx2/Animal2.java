package classEx2;

public class Animal2 {

	String name;
	
	Animal2(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Animal2 lion = new Animal2("사자");
		System.out.println(lion.name);
		
		Animal2 tiger = new Animal2("호랑이");
		System.out.println(tiger.name);
		
		Animal2 leopard = new Animal2("표범");
		System.out.println(leopard.name);

	}

}
