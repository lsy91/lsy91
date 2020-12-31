package inheritanceEx2;

public class MyCellPhoneExample {

	public static void main(String[] args) {
		
		MyCellPhone mcp = new MyCellPhone("갤럭시","골드","영화");
		System.out.println("모델: " + mcp.model);
		System.out.println("색상: " + mcp.color);
		System.out.println("채널: " + mcp.channel);
		
		mcp.setOn();
		mcp.setKatalk();
		mcp.sendMsg("왓츠업");
		mcp.receiveMsg("하이! 뭐하니!");
		mcp.sendMsg("코딩하지!!!");
		mcp.endKatalk();
		
		mcp.turnOnYt();
		mcp.changeChannelYt("음악");
		mcp.turnOffYt();
	}

}
