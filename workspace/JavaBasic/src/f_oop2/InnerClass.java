package f_oop2;

public class InnerClass {
	
	// 내부 클래스 : 클래스내부에 클래스를 또 만드는것
	// 지역 클래스 : 메서드안에있는 클래스
	// 익명클래스 : 이름이없는 클래스 
	
	//인스턴스 변수
	int instanceVar = 1;
	int var = 10;
	
	//클래스변수
	static int classVar = 2;
	
	//인스턴스클래스 
	class InstanceInner{
		//인스턴스 클래스에서는 인스턴스 멤버와 클래스멤버 모두 사용가능
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var = 20;
		
		void method(){
			int var = 30; //지역변수
			
			System.out.println(var); //지역변수
			System.out.println(this.var);//전역변수(인스턴스변수)
			System.out.println(InnerClass.this.var);//밖에있는 클래스 변수에 접근
		}
	}
	
	//스태틱 클래스
	static class StaticInner{
		//스태틱 클래스 에서는 클래스 멤버만 사용가능
//		int inner1 = instanceVar; 
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	

	void method(){
		int localVar1 = 3;
		final int localVar2 = 4;
		
		//지역클래스 :
		//메서드 안에 만드는것
		class LocalInner{
			//지역클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용가능하고 
			//final이 붙은 지역변수도 사용가능.
			
			int inner1 = instanceVar;
			int inner2 = classVar;
//			int inner3 = localVar1; // final이 붙지 않은 지역 변수는사용 불가.
			int inner4 = localVar2;
		}
		
		//지역클래스는 메서드 내부에서 인스턴스화를 통해 사용가능
		//만들어진 메서드 내부에서만 사용가능
		LocalInner li = new LocalInner();
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
		
		//인스턴스 클래스의 인스턴스 멤버에접근하기 위해서는 인스턴스화를 해야한다.
		InstanceInner ii = new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		//클래스멤버는 클래스를 통해서 바로 접근할수 있는것과 같이
		// 스태틱 클래스는 클래스를 통해서 바로 접근할 수 있다.
		System.out.println(StaticInner.inner3);
		//스태틱 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		StaticInner si = new StaticInner();
		System.out.println(si.inner2);
	}
	
	
}


//잘 쓰진 않아요

























