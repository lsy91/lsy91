package classEx2;

public class ClassEx21 {

	private String color;
	private int speed;   // private 필드지만
	
	public String getColor() { // public getter 메소드
		return color;
	}
	public void setColor(String color) { // public setter 생성자
		this.color = color;
	}
	public int getSpeed( ) { // public getter 메소드
		return speed;
	}
	public void setSpeed(int speed) { // public setter 생성자
		this.speed = speed;
	}
	
	public static void main(String[] args) { // 로 바꿔줬기 때문에 출력 가능
		
		ClassEx21 car = new ClassEx21();
		car.setColor("빨간색");
		car.setSpeed(100);
		System.out.println("색상: " +car.getColor());
		System.out.println("속도: " +car.getSpeed());

	}

}
