package f_oop2.ex_abstract;

public abstract class Animal {//�߻�Ŭ����
	
	void run(){
		System.out.println("�޷����ϴ� !");
	}
	
	abstract void bark();
}

class Dog extends Animal{ // �߻�޼��� ���

	@Override
	void bark() {
		System.out.println("�ع��ع� !");
		
	}
	
}

class Cat extends Animal{ // �߻�޼��� ���

	@Override
	void bark() {
		System.out.println("������ !");
		
	}
	
}

class Bird extends Animal{ // �߻�޼��� ���

	@Override
	void bark() {
		System.out.println("�޹��޹� !");
		
	}
	
}











