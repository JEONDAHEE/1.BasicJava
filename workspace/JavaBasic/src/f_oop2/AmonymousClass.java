package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmonymousClass {

	public static void main(String[] args) {
		// 익명클래스 : 하나의 부모 클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 객체를 생성하는 클래스
		// 객체 생성한 그 위치에서만 사용할 수 있다. 그래서 이름이 없기때문에 익명 클래스라고 한다.
		// GUI를만들때 사용한다.
		
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {
			//ActionListener를 상속받은 자식 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");
				
			}
		});//버튼을 추가할때 주로 사용하곤 합니다 ~
		//다른곳에서 불러다가 사용할 일이 없기 때문에 익명 클래스를 사용한다.

	}

}



































