package abstractEx;

public class SmtPhone extends Phone{
	
	public SmtPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
