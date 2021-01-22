package awtEx;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Sub03 extends Frame implements ActionListener {
	
	Button b1,b2,b3; // 전역변수
	
	Sub03() {
		setSize(400,300);
		setVisible(true);
		
		// Button 컴포넌트는 ActionEvent를 발생시킨다
		b1 = new Button("노란색");
		b2 = new Button("빨간색");
		b3 = new Button("파란색");
		
		// Button : ActionEvent를 발생시키기 위해 ActionListener 인터페이스의 상속이 필요하다 // 버튼이 눌렸다는걸 아아차릴 수 있게
		b1.addActionListener(this); // this = 현재 클래스 (Sub03)
		b2.addActionListener(this); // 버튼이 활성화되면 new ActionEvent() 객체가 자동으로 만들어진다. (예외처리때 catch 블럭 안에 객체가 자동으로 만들어지는 원리)
		b3.addActionListener(this);
		// this: actionPerformed 가 현재 클래스 안에 있다는걸 알려준다.
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
	}
	// ActionEvent e = new ActionEvent();
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed"); // 버튼이 눌리면 콘솔창에 출력
		
		Object obj = e.getSource();
		
		if(obj == b1) {
			setBackground(Color.yellow);
		}
		else if(obj == b2) {
			setBackground(Color.RED); // 대소문자 중 하나로 통일
		}
		else if(obj == b3) {
			setBackground(Color.blue); // 대소문자 중 하나로 통일
		}
	}
	
} // Sub03

public class Ex12_03_ActionEvent {

	public static void main(String[] args) {
		
		new Sub03(); // 이것만 써도 프레임이 만들어진다.
		
	}

}

// 1. frame을 만든다
// 2. 버튼 3개 생성 (전역변수로)
// 3. 배치관리자 설정
// 4. 버튼 이벤트 => ActionEvent
// 5. ActionEvent를 발생시키기 위해 ActionListener 인터페이스 상속, 버튼에 액션리스너 부착, 부착하면 ActionPerformed 메서드가 자동 호출
// 6. ActionListener 인터페이스가 미완성이기 때문에 ActionPerformed 메서드 안에서 기능을 구현해 완성시킨다.
