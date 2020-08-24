package f_oop2;

public class SampleChild extends SampleParent{
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);//상속받은 변수
		int result = method(7,13);//상속받은 메서드
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		sc.childMethod();
		
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		
		sc.test(5);
		
		SampleParent sp = new SampleChild();//자식의 객체를 부모타입의 변수에 저장
		//부모타입이 가지고 있는 멤버만 사용할 수 있다.
		//자식의 객체를 부모껄로 형변환
		System.out.println("sp.var : " + sp.var);
		System.out.println("sc.var : " + sc.var);
		System.out.println("sp.method() : " + sp.method(5, 10));
		System.out.println("sc.method() : " + sc.method(5, 10));
		//오버라이딩 하게되면 부모 클래스의 메서드는 무시된다.
	}
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	//접근제어자는 변경가능(상속받은 메서드보다 좁은 범위로는 변경불가), static이나 반환타입은 변경 불가
	@Override //어노테이션 -> 골뱅이로 시작하는 것(오바라이딩 한것이라는것을 알려주기 위해 쓴다.)
	int method(int a, int b){ //리턴타입 메서드명 파리미터 모두 같아야한다.
		
		return a * b;
	
	}
	
	int var;
	
	void test(double var){
		System.out.println(var);//지역변수(파라미터)
		System.out.println(this.var);//인스턴스 변수
		System.out.println(super.var);//부모클래스의 인스턴스변수
		//super : 부모클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기위해 사용한다.
		
		System.out.println(method(10, 20));//자식 클래스의 메서드
		System.out.println(super.method(10, 20));//부모 클래스의 메서드
	}
	
	
	//없어도 됨(컴파일러가 자동 생성)
	SampleChild(){//생성자 생성
		super();
		//super()를 사용해 부모클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
