package awtEx;

import java.awt.Frame;

//-Dfile.encoding=MS949
class HelloFrame extends Frame {
	
}

public class Ex12_01_Frame {

	public static void main(String[] args) {
		
		Frame f = new HelloFrame();
		
		f.setTitle("abc");
		
		f.setSize(400,300);
		f.setVisible(true);
		f.setLocation(100,300);
	}

}
