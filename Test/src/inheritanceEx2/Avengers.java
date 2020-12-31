package inheritanceEx2;

public class Avengers {
	
	String name;
	String gender;
	
	public Avengers(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void setName() {
		System.out.println("이름은 " + this.name + "입니다.");
	}
	
	public void setGender() {
		System.out.println("성별은 " + this.gender + "입니다.");
	}
	
	void goToWork() { System.out.println("출근합니다.");}
	void fight() { System.out.println("빌런과 싸웁니다.");}
	void beaten() { System.out.println("빌런한테 얻어 터집니다.");}
	void awaken() { System.out.println("각성합니다.");}
	void victory() { System.out.println("싸움에서 승리합니다.");}
	void saveEarth() { System.out.println("지구를 지킵니다.");}
	void goHome() { System.out.println("퇴근합니다.");}
}
