package f_oop2.ex_abstract.ex_interface;

public interface Sampleinterface {
	//�������̽�  : ����� �߻� �޼��常 ������ �ִ°�.
	
	//�������̽��� ��� ��� ������ public static final �����ڸ� ����ؾ��Ѵ�.
	public static final int NUM1 = 1;
	//��� ��������� �����ڰ� ���� ������ ������ �����ϴ�. ..������ �����Ѵ�.
	int NUM2 = 2;
	
	//�������̽��� ��� �޼���� public abstract�����ڸ� ����ؾ� �Ѵ�.
	 public abstract void method1(); 
	 //��� �޼����� �����ڰ� ���⶧���� ������ �����ϴ�.
	 void method2();
	
	
}


class SampleImplement implements Sampleinterface, Sampleinterface2{//�������̽��� ��ӹޱ� ���ؼ��� implements�� ����Ѵ�.

	@Override
	public void method1() { //�̸��� �ߺ��Ǹ� �ѹ��� �������̵� �ȴ�.(��¥�� ������ ���⶧����) //�̸��� ������ ����Ÿ�Ա��� �� ���ƾ��Ѵ�.
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		System.out.println(Sampleinterface.NUM2);
		
	}

	@Override
	public void method3() {
		
		
	} 
	
}

interface Sampleinterface2{
	void method1();
	void method3();
}





































