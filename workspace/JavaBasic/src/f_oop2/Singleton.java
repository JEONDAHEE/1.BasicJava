package f_oop2;

//�̱��� ���� : ��ü�� ������ �����Ͽ� �ϳ��� ��ü�� ����ϰ� �ϴ� ������ ����
//��ü�鰣�� ��ü�� �����ϱ� ���� ����Ѵ�.
//�޸𸮸� �������� �ʱ� ���ؼ� ���. => why? ��ü�� �ѹ��� ��������ϱ�Ѥ�

//Singleton�� �̸��ϻ� Ű���尡 �ƴϾ�

public final class Singleton { // ��ӹ��� ���ϰ� �Ҷ�� final�� �ٿ��ش�.
	
	private static Singleton instance;//����
	
	private Singleton(){//������
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();//��ü ����
		}
		return instance;
	}
}
