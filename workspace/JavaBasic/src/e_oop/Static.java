package e_oop;

public class Static {
	
	static int classVar;
	int instanceVar;
	
	static void classMethod(){ 
		
	}
	
	void instanceMethod(){
		
	}

	public static void main(String[] args) {
		/*
		 <<static ��� ����>>
		 - ��ü ���� ���� ������ �޼��带 ����ϱ� ���� ���δ�.
		 - ��ü�鰣�� ������ ���� �����ϱ� ���� ���δ�.
		 - static�� ���� �� : Ŭ���� ���(Ŭ���� ����, Ŭ���� �޼���)
		 - Ŭ������� : �޸𸮿� Ŭ������ ����� �� ���� ���� �ȴ�.
		 - static�� ���� ���� �� : �ν��Ͻ� ���(�ν��Ͻ� ����, �ν��Ͻ��޼���)
		 - �ν��Ͻ���� : �޸𸮿� �ν��Ͻ��� ����� �� ���� ����ȴ�.
		 */
		
		//static�� ���� �޼���
		Math.random();
		System.out.println();
		
		System.out.println(ClassMember.classVar);
		Static.classMethod();
		
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();
		
		System.out.println(cm1.classVar);
		cm1.classMethod();
		//��ü�� ���ؼ��� Ŭ���� ����� ���� �� �� ������ ���� ����� �ƴϴ�.
		
		ClassMember cm2 = new ClassMember();
		cm2 = null;
		
		//�ν��Ͻ� ���� ���� (static �Ⱥ��ΰ�)
		System.out.println("���� ��");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);

		cm2.instanceVar = "�ν��Ͻ� ���� ����";
		
		System.out.println("���� ��");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		
		//Ŭ���� ���� ����(static ���ΰ�)
		System.out.println("���� ��");
		System.out.println("ClassMember : " + ClassMember.classVar);
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		
		ClassMember.classVar = "Ŭ���� ���� ����";

		System.out.println("���� ��");
		System.out.println("ClassMember : " + ClassMember.classVar);
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		

		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
