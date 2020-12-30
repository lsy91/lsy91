package classEx2;

public class Mp {
	
	String color;
	int memory;
	
	public void setColor(String c) {
		if(c.equals("skyblue") || c.equals("red") || c.equals("silver")) {
			color = c;
		} else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	
	public void setMemory(int m) {
		if(m == 64 || m == 128 || m == 256) {
			memory = m;
		} else {
			System.out.println("지원하지 않는 용량입니다.");
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public static void main(String[] args) {
		
		Mp mp1 = new Mp();
		mp1.setColor("skyblue");
		mp1.setMemory(64);
		System.out.println("색상: " + mp1.getColor());
		System.out.println("용량: " + mp1.getMemory());
		
		Mp mp2 = new Mp();
		mp2.setColor("gold");
		mp2.setMemory(1024);
		System.out.println("색상: " + mp2.getColor());
		System.out.println("용량: " + mp2.getMemory());
		
	}

}
