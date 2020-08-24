package f_oop2.ex_abstract.ex_interface;

public interface Sampleinterface {
	//인터페이스  : 상수와 추상 메서드만 가지고 있는것.
	
	//인터페이스의 모든 멤버 변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	//모든 멤버변수가 제어자가 같기 때문에 생략이 가능하다. ..보통은 생략한다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract제어자를 사용해야 한다.
	 public abstract void method1(); 
	 //모든 메서드의 제어자가 같기때문에 생략이 가능하다.
	 void method2();
	
	
}


class SampleImplement implements Sampleinterface, Sampleinterface2{//인터페이스를 상속받기 위해서는 implements를 사용한다.

	@Override
	public void method1() { //이름이 중복되면 한번만 오버라이딩 된다.(어짜피 내용이 없기때문에) //이름이 같으면 리턴타입까지 다 같아야한다.
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





































