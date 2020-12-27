package constantEx;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println();
		
//		p1.ssn = "123456-1234567"; // The final field Person.ssn cannot be assigned
//		p1.nation = "USA"; // The final field Person.nation cannot be assigned
//		p1.name = "을지문덕"; // The final field Person.name cannot be assigned
		
	}

}
