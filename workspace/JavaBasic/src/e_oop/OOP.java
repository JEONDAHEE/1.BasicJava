package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 - 코드의 재사용성이 높고 유지보수가 용이하다.
		 
		 << 객체생성(인스턴스화) >>
		 - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에  접근할 수 있다.
		 - 객체는 생성될 때마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */

		SampleClass sc =  new SampleClass(); // sc변수를 가지고 클래스를 사용할 수 있음 
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.flowTest1();
		
		//방금만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주고, 리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요
		
		ClassMaker s = new ClassMaker();
		
		System.out.println(s.me1());
		
		s.me2(30);
		
		int returnI = s.me3(2,5);
		System.out.println(returnI);
		// =
		System.out.println(s.me3(5, 8));
		
		
		//계산기(calculator)
		
		Calculator c = new Calculator();
		//1.
		double hap = c.plus(123456, 654321);
		System.out.println(hap);
		//2. 1번*123456
		double gob = c.multi(hap, 123456);
		System.out.println(gob);
		//3. 2번/123456
		double na = c.division(gob, 123456);
		System.out.println(na);
		//4. 3번-654321
		double bba = c.minus(na, 654321);
		System.out.println(bba);
		//5.4번 % 123456
		double namu = c.reminder(bba, 123456);
		System.out.println(namu);
		
		/*
		위 내용을 간단하게 추린거
		double result = c.plus(123456, 654321);
		result = c.multi(result, 123456);
		result = c.division(result, 123456);
		result = c.minus(result, 654321);
		result = c.reminder(result, 123456);
		System.out.println(result);
		*/
		
		
		//심리테스트
		
		SimliTest sim = new SimliTest();
		
		sim.q1();
		
		
		
		
		
		
		
		
		
		
		
	}		
}
