package inheritanceEx2;

public class IronMan extends Avengers{

	public IronMan(String name, String gender) {
		super(name, gender);
	}

	public static void main(String[] args) {
		
		Avengers aven = new Avengers("아이언맨", "남자");
		
		System.out.println("이름: " + aven.name);
		System.out.println("성별: " + aven.gender);
		
		aven.goToWork();
		aven.fight();
		aven.beaten();
		aven.awaken();
		aven.victory();
		aven.saveEarth();
		aven.goHome();
	}

}
