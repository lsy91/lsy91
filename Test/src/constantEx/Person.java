package constantEx;

public class Person {
	
	final String nation = "Korea"; // final 붙으면 수정 못함
	final String ssn;
	final String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
