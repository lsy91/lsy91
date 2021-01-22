package awtEx;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Sub04 extends Frame implements ItemListener,ActionListener {
	
	List list; // 전역변수
	Choice ch;
	Button btn;
	
	Sub04() {
		setTitle("ItemEvent"); // 실행창 제목설정
		setSize(300,200); // 실행창 사이즈 설정
		setVisible(true); // 실행창 노출여부
		
		setLayout(new FlowLayout()); // 배치 관리자 설정
		
		list = new List(3,true); // 유틸의 list가 아니라 AWT의 list import // 3은 실행창에 보여지는 요소의 개수, true는 다중선택이 가능하다
		ch = new Choice();
		btn = new Button();
		
		list.add("지리산");
		list.add("한라산");
		list.add("금강산");
		list.add("덕유산");
		list.add("속리산");
		
		ch.add("진달래");
		ch.add("벚꽃");
		ch.add("장미");
		ch.add("국화");
		ch.add("개나리");
		
		// List, Choice : ItemEvent 발생
		super.add(list); // super 생략가능
		this.add(ch); // this 생략가능
		add(btn);
		
		list.addItemListener(this); // new ItemEvent() 객체가 자동생성
		ch.addItemListener(this);
		btn.addActionListener(this);
		
	} // 생성자
	
	public void itemStateChanged(ItemEvent e) {
		// System.out.println("itemStateChanged");
		
		Object obj = e.getSource();
		
		if(obj == list) {
			// System.out.println("list 이벤트 발생");
			int indexs[] = list.getSelectedIndexes(); // 선택한 항목의 번호를 가져올때 indexs 배열로
			
			// 위에 list = new List(3,true);의 true 때문에 다중선택이 가능하니까
			// getSelectedIndexes 메서드로 받는게 맞고
			// true가 아니면 1개씩밖에 선택이 안되니까 굳이 배열로 받을 필요 없어서 getSelectedIndex 메서드를 쓰고
			// int로 받는 것이 좋다. int[] 배열로 받아도 상관없지만 굳이?
			
			String items[] = list.getSelectedItems();
			
			for(int i=0; i<indexs.length; i++) {
				System.out.print(indexs[i] + "/" + items[i] + ",");
			}
			System.out.println();
		} // if
		else if(obj == ch) {
			System.out.println("choice 이벤트 발생");
			
			int index = ch.getSelectedIndex();
			String item = ch.getSelectedItem();
			
			System.out.println(index+":"+item);
		}
		System.out.println();
	}
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.RED);
	}
} // Sub04

public class Ex12_04_itemEvent {

	public static void main(String[] args) {

		new Sub04();
		
	}

}
