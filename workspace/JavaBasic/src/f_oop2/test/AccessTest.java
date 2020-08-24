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
		
		//protected�� ���� �޼ҵ� �ȿ��� ����ϴ� ���----------------------
		// protected�� ���� ����� ����� �޾����ϱ� ���� Ŭ�������� ��ü�� �����ؼ� ����Ѵ�.
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();

	}
	
	//protected�� �޼ҵ带 ���� ����ϴ� ���----------------------
	//����� �޾������� �ȹ޾������� Ȯ���ϴ� �޼ҵ�
	void protectedTest(){
		System.out.println(protectedVar);
		protectedMethod();
	}

}