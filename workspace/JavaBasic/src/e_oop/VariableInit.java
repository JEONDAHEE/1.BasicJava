package e_oop;

public class VariableInit {
	// 초기화 하는 방법
	
	//실행 순서 : 명시적 초기화 -> 초기화블럭 -> 생성자
	// 명시적 초기화가 초기화 블럭 밑에 있으면 초기화 블럭이 먼저 실행 된다. 이렇게 사용하는 경우는 거의 없다.
	
	// 명시적 초기화
	int var = 10; //static 안 붙은 명시적 초기화
	
	static int classVar = 20;// static붙은 명시적 초기화
	
	//초기화 블럭 : 여러 문장이 필요한 초기화를 해야할 때 사용한다.
	static {//static 붙은 초기화 블럭
		classVar = 30;
	}
	
	{// static 안 붙은 초기화 블럭
		for(int i = 1; i <= 10; i++){
			var += i;
		}
	}
	
	/*
	  << 생성자 >>
	  - 클래스와 같은 이름의 메서드
	  - 객체를 생성하면서 필요한 작업이 있을때 사용한다.(인스턴스 변수 초기화)
	  - 파라미터를 받아서 초기화 하고싶을 때 사용한다.
	  - 클래스에 생성자는 반드시 하나 이상 존재해야 한다.
	  - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	  - 생성자는 리턴타입이 없다.
	 */
	
	VariableInit(int var){
		this.var = var; // 똑같은 변수를 가지고 있을 때 this를 붙인다  this붙은건 전역변수 안붙은건 지역변수 
		for(int i = 1; i <= var; i++){
			this.var += i;
		}
		//this : 클래스의 인스턴스 주소가 저장된 변수(객체를 가르키는 변수)
		//인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 인스턴스 변수 앞에 붙여서 사용한다.
	}
	
	//오버로딩 : 같은 이름의 메서드를 정의하는 것
	//파라미터의 갯수나 타입이 달라야 한다.
	VariableInit(){
//		for(int i = 1; i <= 100; i++){
//			this.var += i;
//		}
		
		this(100); // VariableInit(int var) 
		//this() : 생성자에서 다른 생성자를 호출할때 사용한다.
		//this() 이전의 코드가 의미 없는 코드가 될 수 있기 때문에 this()는 생성자의 첫줄에서만 사용할 수 있다. //this위에는 코드가 있으면 안된다구
		
		System.out.println();
		
		//객체생성을 할 때 생성자를 호출한다.
		VariableInit variableInit = new VariableInit();
		VariableInit variableInit2 = new VariableInit(100);
	}
	
}












