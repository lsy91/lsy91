package constantEx;

public class Constant {
	
	static final double PI = 3.14159;
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	public static void main(String[] args) {
		
		System.out.println(PI);
		System.out.println(EARTH_RADIUS);
		System.out.println(EARTH_SURFACE_AREA);
		
	}

}
