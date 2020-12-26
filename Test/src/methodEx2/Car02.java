package methodEx2;

public class Car02 {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	 boolean isLeftGas() {
		 if(gas == 0) {
			 System.out.println("gas가 없습니다.");
			 return false;
		 }
		 return true;
	 }
	 
	 void run() {
		 
		 while(true) {
			 if(gas > 0) {
				 System.out.println("달립니다. (gas잔량:"+gas+")");
				 
				 gas -= 1;
			 }
			 else {
				 System.out.println("멈춥니다. (gas잔량:"+gas+")");
				 return;
			 }
		 }
	 }
}
