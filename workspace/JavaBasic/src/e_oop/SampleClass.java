package e_oop; // ���� Ŭ������ ��ġ�� �˷��ش�.

import java.util.Scanner; // �ٸ� ��Ű���� �ִ� Ŭ������ ��ġ�� �˷��ش�. // import�� ��Ű���� Ŭ���� ���̿� ��ġ�ؾ� �Ѵ�.

public class SampleClass {
	
	int field = 10; // �������� : Ŭ���� ��ü �������� ����ϴ� ����. //�����ʱ�ȭ ���� �ʾƵ� �⺻������ �ʱ�ȭ �ȴ�.
	
	/*
	 - �޼��� : �ڵ带 �и��ؼ� �� ȿ������ ���α׷��� ����� ���� ����
	 - ����Ÿ�� �޼����(�Ķ����){}
	 - ����Ÿ��(��ȯŸ��) : ���� �� ��������ϴ� �����
	 - �Ķ����(�Ű�����) : �ʿ��� ����
	 */
	
	void method1(){ //void�� �����ٰ� ���� ��� �ǹ�.. // �޼��� �̸��� �ҹ��ڷ� ����
		System.out.println("�Ķ���͵� ����Ÿ�Ե� ���� �޼���");
	}
	
	void method2(int parameter){ // ���� �޼��带 ȣ���ҷ��� ��Ʈ Ÿ���� ���� �ϳ� �Ѱ���� �Ѵ�.
//		return; //���� ��ġ���� �޼��带 �����Ų��. ���� �� ������ ������� ����
		System.out.println(parameter + "�� ����� ����� �����ϴ� �޼���");
	}
	
	String method3(){// ��Ʈ�� Ÿ���� � ���� ��Եȴ�.
		return "��� ���� �� ������� �����ִ� �޼���";
		// return : �޼��带 �����Ű�� ������� �����ش�.
		// ����Ÿ���� ���� �޼��忡���� �޼��带 �����Ų��.
	}
	
	int method4(int a, int b){// intŸ���� �Ķ���� �ΰ�
		System.out.println(a + "," + b + "�� ����� ����� �����ϰ� ������� �����ִ� �޼���");
		return a + b;
	}
	
	
	// ����Ǵ� ����
	void flowTest1(){
		System.out.println("flowTest1 ���� : 1");
		flowTest3();
		System.out.println("flowTest1 ���� : 6");
	}
	
	void flowTest2(){
		System.out.println("flowTest2 ���� : 3");
		System.out.println("flowTest2 ���� : 4");
	}
	
	void flowTest3(){
		System.out.println("flowTest3 ���� : 2");
		flowTest2();
		System.out.println("flowTest3 ���� : 5");
	}
	


}
