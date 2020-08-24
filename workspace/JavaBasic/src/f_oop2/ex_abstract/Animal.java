package f_oop2.ex_abstract;

public abstract class Animal {//추상클래스
	
	void run(){
		System.out.println("달려갑니다 !");
	}
	
	abstract void bark();
}

class Dog extends Animal{ // 추상메서드 상속

	@Override
	void bark() {
		System.out.println("멈무멈무 !");
		
	}
	
}

class Cat extends Animal{ // 추상메서드 상속

	@Override
	void bark() {
		System.out.println("춘길춘길 !");
		
	}
	
}

class Bird extends Animal{ // 추상메서드 상속

	@Override
	void bark() {
		System.out.println("앵무앵무 !");
		
	}
	
}











