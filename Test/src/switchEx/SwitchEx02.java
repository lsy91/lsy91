package switchEx;

public class SwitchEx02 {

	public static void main(String[] args) {

		int a = 100;

		switch (a / 10) {
		case 10:
			System.out.println("a");
			break;
		case 9:
			System.out.println("b");
			break;
		case 8:
			System.out.println("c");
			break;
		case 7:
			System.out.println("d");
			break;
		case 6:
			System.out.println("e");
			break;
		default:
			System.out.println("f");
			break;
		}

		String medal = "Gold";

		switch (medal) {

		case "Gold":
			System.out.println("금메달");
			break;

		case "Silver":
			System.out.println("은메달");
			break;

		case "Bronze":
			System.out.println("동메달");
			break;

		default:
			System.out.println("메달권이 아닙니다.");
		}
	}
}
