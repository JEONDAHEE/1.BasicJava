package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
		//protected를 메인 메소드 안에서 사용하는 방법----------------------
		// protected를 쓰는 방법은 상속을 받았으니까 현재 클래스에서 객체를 생성해서 사용한다.
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();

	}
	
	//protected를 메소드를 만들어서 사용하는 방법----------------------
	//상속이 받아졌는지 안받아졌는지 확인하는 메소드
	void protectedTest(){
		System.out.println(protectedVar);
		protectedMethod();
	}

}
