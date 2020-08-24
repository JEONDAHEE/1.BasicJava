package f_oop2.ex_abstract;

	//추상 클래스  추상메서드를 포함하고 있다는 점만 제외하면 일반 클래스와 모든점이 같습니다.
public abstract class SampleAbstractParent { //추상메서드를 가지고 있는 클래스는 추상클래스라는 것을 알려주기 위해 abstract를 붙여준다.
	//구현부가 없어서 사용할 수 없다. 객체생성 불가.
	//부모클래스로의 역할만 한다.
		
	void method(){
		
	}
	
	//추상메서드 : 선언부만있고, 구현부는 없는메서드
	abstract void abstractMethod();//추상메서드는 추상메서드라는것을 알려주기위해 앞에 abstract를 붙여준다.
}

class SampleAbstractChild extends SampleAbstractParent{
	
	// 1. 추상메서드를 상속받으면 반드시 구현해야 한다.(오버라이딩해서)
	// 2. 상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야한다.
	@Override
	void abstractMethod(){
		
	}
	
	//추상메서드는 왜 만드니?
	//
}