package inheritanceEx2;

public class Dog extends Animal{
	
	public void sleep() {
		System.out.println(this.name + " zzz");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
	}
}
