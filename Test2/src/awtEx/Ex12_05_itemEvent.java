package awtEx;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Sub05 extends Frame implements ItemListener {
	
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {
						{"한국","일본","중국"},
						{"영국","스위스","프랑스"},
						{"이집트","콩고","우간다"}
					};
	
	Choice c1, c2;
	
	Sub05() {
		Label lb1 = new Label("대륙과 나라를 선택하세요");
		lb1.setBackground(Color.cyan);
		
		Panel p = new Panel();
		p.setBackground(Color.pink);
		p.setLayout(new FlowLayout()); // 패널의 기본 배치관리자는 flowLayout 이라서 굳이 코딩 안해도 된다
		
		c1 = new Choice();
		c2 = new Choice();
		p.add(c1);
		p.add(c2);
		
		c1.add("아시아");
		c1.add("유럽");
		c1.add("아프리카");
		
		for(int i=0; i<대륙.length; i++) {
			c1.add(대륙[i]);
		}
		
		for(int i=0; i<나라.length; i++) {
			for(int j=0; j<3; j++) {
				c2.add(나라[i][j]);
			}
		}
		
		c1.addItemListener(this);
		
		Label lb2 = new Label(); // 결과
		lb2.setBackground(Color.yellow);
		
		add("North",lb1);
		add("Center",p);
		add("South",lb2);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		
		if(obj == 대륙[0]) {
			
		}
	}
}

public class Ex12_05_itemEvent {

	public static void main(String[] args) {
		
		new Sub05();
		
	}

}
