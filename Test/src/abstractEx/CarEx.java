package abstractEx;

public class CarEx {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(300, "페라리", "빨간색");
		
		System.out.printf("%s %s %s",ferrari.color,ferrari.model,"입니다.\n");
		
		ferrari.turnOn();
		ferrari.seatBelt();
		ferrari.run(300);
		ferrari.stop();
		ferrari.turnOff();
		
		System.out.println();
		
		Sonata sonata = new Sonata(200, "소나타", "흰색");
		System.out.printf("%s %s %s",sonata.color, sonata.model, "입니다.\n");
		sonata.turnOn();
		sonata.seatBelt();
		sonata.run(200);
		sonata.stop();
		sonata.turnOff();
		
		System.out.println();
		
		Carnival carnival = new Carnival(180, "카니발", "검정색");
		System.out.printf("%s %s %s",carnival.color, carnival.model, "입니다.\n");
		carnival.turnOn();
		carnival.seatBelt();
		carnival.run(180);
		carnival.stop();
		carnival.turnOff();
	}

}
