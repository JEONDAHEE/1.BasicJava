package e_oop;

public class ClassMaker2 {
	//�������� �ϳ��� �����ϰ� ��������� �ʱ�ȭ ���ּ���.
	int a = 10;
	static int b = 0; //static�� ���� ����� �ʱ�ȭ
	
	//������ ������ ���������� �ʱ�ȭ ���� ����� �ʱ�ȭ �� �ּ���.
	
	{
		a  = a + 10;
	}	
	
	static void b(){ //static�� ���� ���� ����� �ʱ�ȭ
		
	}
	
	//������ ������ ���� ������ �������� �Ķ���͸� ����� �ʱ�ȭ ���ּ���.
	ClassMaker2(int a){
		this.a = a;
		b();
		
	}
	//������ ������ ���������� �����ڸ� �ϳ� �� ���� �ʱ�ȭ ���ּ���.
	ClassMaker2(){
		this(15);
	}
	
	//�����ڸ� ����ϴ� ����: ��ü�� �����ϸ鼭 ������ �ϰ������.
	public static void main(String[] args){
		ClassMaker2 cm2 = new ClassMaker2();
		System.out.println(cm2.a);
		
		cm2 = new ClassMaker2(50);
		System.out.println(cm2.a);
	}
	
	
}
