package e_oop;

public class ClassMaker2 {
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int a = 10;
	static int b = 0; //static이 붙은 명시적 초기화
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해 주세요.
	
	{
		a  = a + 10;
	}	
	
	static void b(){ //static이 붙은 블럭을 사용한 초기화
		
	}
	
	//위에서 선언한 전역 변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int a){
		this.a = a;
		b();
		
	}
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this(15);
	}
	
	//생성자를 사용하는 이유: 객체를 생성하면서 뭔가를 하고싶을때.
	public static void main(String[] args){
		ClassMaker2 cm2 = new ClassMaker2();
		System.out.println(cm2.a);
		
		cm2 = new ClassMaker2(50);
		System.out.println(cm2.a);
	}
	
	
}
