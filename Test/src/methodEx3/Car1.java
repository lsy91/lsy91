package methodEx3;

public class Car1 {
	
	private int speed;
	private boolean stop;
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
