package polymorphismEx;

public class Cat extends Animal{

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Animal animal = cat; // 자동타입변환
		
		if(animal == cat) {
			System.out.println("자동타입변환");
		}
		else {
			System.out.println(" ");
		}
	}

}
