package methodEx3;

public class GeseEx1 {
	
	public String model;
	public String number;
	public String color;
	public int maxSpeed;
	public int cc;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
		System.out.println("모델: " + this.model);
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
		System.out.println("번호: " + this.number);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
		System.out.println("색상: " + this.color);
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("최고속도: " + this.maxSpeed);
	}
	
	public int getCc() {
		return cc;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
		System.out.println("배기량: " + this.cc);
	}
	
	public static void main(String[] args) {
		
		GeseEx1 gs = new GeseEx1();
		gs.setModel("페라리");
		gs.getModel();
		gs.setNumber("12가 1234");
		gs.getNumber();
		gs.setColor("빨간색");
		gs.getColor();
		gs.setMaxSpeed(200);
		gs.getMaxSpeed();
		gs.setCc(3000);
		gs.getCc(); // setter 메서드로 매개변수를 넘겨주어 getter 메서드로 값을 받아 출력하는 형식
		
	}

}
