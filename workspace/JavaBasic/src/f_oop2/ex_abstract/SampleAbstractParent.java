package f_oop2.ex_abstract;

	//�߻� Ŭ����  �߻�޼��带 �����ϰ� �ִٴ� ���� �����ϸ� �Ϲ� Ŭ������ ������� �����ϴ�.
public abstract class SampleAbstractParent { //�߻�޼��带 ������ �ִ� Ŭ������ �߻�Ŭ������� ���� �˷��ֱ� ���� abstract�� �ٿ��ش�.
	//�����ΰ� ��� ����� �� ����. ��ü���� �Ұ�.
	//�θ�Ŭ�������� ���Ҹ� �Ѵ�.
		
	void method(){
		
	}
	
	//�߻�޼��� : ����θ��ְ�, �����δ� ���¸޼���
	abstract void abstractMethod();//�߻�޼���� �߻�޼����°��� �˷��ֱ����� �տ� abstract�� �ٿ��ش�.
}

class SampleAbstractChild extends SampleAbstractParent{
	
	// 1. �߻�޼��带 ��ӹ����� �ݵ�� �����ؾ� �Ѵ�.(�������̵��ؼ�)
	// 2. ��ӹ��� �߻�޼��带 �߻�޼���� ���ܵη��� Ŭ������ �߻�Ŭ������ �����ؾ��Ѵ�.
	@Override
	void abstractMethod(){
		
	}
	
	//�߻�޼���� �� �����?
	//
}