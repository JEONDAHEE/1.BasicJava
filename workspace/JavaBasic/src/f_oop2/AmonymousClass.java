package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmonymousClass {

	public static void main(String[] args) {
		// �͸�Ŭ���� : �ϳ��� �θ� Ŭ������ �������̽��� ��ӹ޾� Ŭ������ �����԰� ���ÿ� ��ü�� �����ϴ� Ŭ����
		// ��ü ������ �� ��ġ������ ����� �� �ִ�. �׷��� �̸��� ���⶧���� �͸� Ŭ������� �Ѵ�.
		// GUI�����鶧 ����Ѵ�.
		
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {
			//ActionListener�� ��ӹ��� �ڽ� Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ������ ����");
				
			}
		});//��ư�� �߰��Ҷ� �ַ� ����ϰ� �մϴ� ~
		//�ٸ������� �ҷ��ٰ� ����� ���� ���� ������ �͸� Ŭ������ ����Ѵ�.

	}

}



































