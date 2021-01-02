package abstractEx;

public class AnimalEx {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println(dog.name);
		dog.sound();
		dog.sleep();
		
		System.out.println("----------");
		
		Cat cat = new Cat();
		System.out.println(cat.name);
		cat.sound();
		cat.sleep();
	}

}
