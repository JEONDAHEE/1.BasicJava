package e_oop;

import java.util.Scanner;

public class SimliTest {

	//���� 9���� �޼���
	Scanner s = new Scanner(System.in);
	
	void q1(){
		System.out.println("���� �ݻ����.(�ݹ� ����� ������.) Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q2();
		}else if(answer.equals("N")){
			q4();
		}
	}
	void q2(){
		System.out.println("������ �� �����ٴϴ� Ÿ���̴�. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q5();
		}else if(answer.equals("N")){
			q3();
		}
	}
	void q3(){
		System.out.println("����Ʈ �ڽ��� �̸� ¥�°� ���ϴ�. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q6();
		}else if(answer.equals("N")){
			q5();
		}
	}
	void q4(){
		System.out.println("�����⺹�� ũ�� �ʴ�. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q7();
		}else if(answer.equals("N")){
			q5();
		}
	}
	void q5(){
		System.out.println("����ǥ���� ������ ���̴�. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q8();
		}else if(answer.equals("N")){
			q6();
		}
	}
	void q6(){
		System.out.println("Ȱ������ ����Ʈ�� ����. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q8();
		}else if(answer.equals("N")){
			q9();
		}
	}
	void q7(){
		System.out.println("������ ��� �ϰ� ��ٸ��� ���̴�. Y/N");
		String answer = s.nextLine();if(answer.equals("Y")){
			System.out.println("AŸ�� ! ���ο� ���� �ŷڰ��� ���, �������ִ� ������� ���ָ� �ϴ� Ÿ�� !");
		}else if(answer.equals("N")){
			q8();
		}
	}void q8(){
		System.out.println("�̼�ģ���� ������ �� ����. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			q9();
		}else if(answer.equals("N")){
			System.out.println("BŸ�� ! ������ �ϴ°͵�, �޴°͵� ���� �����ο� ���ָ� �ϴ� Ÿ�� !");
		}
	}
	void q9(){
		System.out.println("�ƹ��͵� �ƴ��Ͽ� ���� �������� ���δ�. Y/N");
		String answer = s.nextLine();
		if(answer.equals("Y")){
			System.out.println("CŸ�� ! �̰��� �Ǹ��ΰ� ����ΰ�.. ģ������ ����� ���ָ� �ϴ� Ÿ�� !");
		}else if(answer.equals("N")){
			System.out.println("DŸ�� ! ������ �����ְ� ������ �����ִ� �� ���ִ� ���ָ� �ϴ� Ÿ�� !");
		}
	}
	
}
