package classEx2;

public class Animal02 {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		Animal02 cat = new Animal02();
		cat.setName("야옹이");
		System.out.println(cat.getName());
		
		Animal02 dog = new Animal02();
		dog.setName("멍멍이");
		System.out.println(dog.getName());

	}

}
