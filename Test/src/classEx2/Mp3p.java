package classEx2;

public class Mp3p {
	
	String color;
	int memory;
	
	public void setColor(String c) {
		if(c.equals("빨간색") || c.equals("파란색") || c.equals("노란색")) {
		color = c;
		} else {
			System.out.println("지원하지 않는 색상입니다.");
		}
	}
	public void setMemory(int m) {
		if(m==64 || m==128 || m==256) {
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
		
		Mp3p m3 = new Mp3p();
		m3.setColor("빨간색");
		m3.setMemory(64);
		System.out.println("색상:" + m3.getColor());
		System.out.println("용량:" + m3.getMemory());
		
		Mp3p m4 = new Mp3p();
		m4.setColor("보라색");
		m4.setMemory(512);
		System.out.println("색상:" + m4.getColor());
		System.out.println("용량:" + m4.getMemory());
		
	}

}
