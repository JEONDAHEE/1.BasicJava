package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 << OOP(Object Oriented Programming) : ��ü���� ���α׷��� >>
		 - ���α׷����� �ܼ��� �ڵ��� �������� ���°��� �ƴ϶� ��ü���� ��ȣ�ۿ����� ���°�.
		 - �ڵ��� ���뼺�� ���� ���������� �����ϴ�.
		 
		 << ��ü����(�ν��Ͻ�ȭ) >>
		 - Ŭ������ ����ϱ� ���� �޸�(Heap����)�� �÷����� ��.
		 - new Ŭ������(); -> ��ü�� ����� �޸� �ּ� ��ȯ
		 - ��ü �ڿ� ����������(.)�� �ٿ� ��ü�� ������ �޼��忡  ������ �� �ִ�.
		 - ��ü�� ������ ������ ���ο� ��ü�� �����ǰ�, �������� ��ü�� ���ÿ� ������ �� �ִ�.
		 */

		SampleClass sc =  new SampleClass(); // sc������ ������ Ŭ������ ����� �� ���� 
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.flowTest1();
		
		//��ݸ��� Ŭ������ ��ü�� �����ϰ� ������ �������ּ���.
		//��ü�� ����� ������ ���� �޼������ ȣ�����ּ���.
		//�Ķ���Ͱ� �ִ� �޼���� Ÿ�Կ� �´� ���� �Ѱ��ְ�, ����Ÿ���� �ִ� �޼���� ���Ϲ��� ���� ������ּ���
		
		ClassMaker s = new ClassMaker();
		
		System.out.println(s.me1());
		
		s.me2(30);
		
		int returnI = s.me3(2,5);
		System.out.println(returnI);
		// =
		System.out.println(s.me3(5, 8));
		
		
		//����(calculator)
		
		Calculator c = new Calculator();
		//1.
		double hap = c.plus(123456, 654321);
		System.out.println(hap);
		//2. 1��*123456
		double gob = c.multi(hap, 123456);
		System.out.println(gob);
		//3. 2��/123456
		double na = c.division(gob, 123456);
		System.out.println(na);
		//4. 3��-654321
		double bba = c.minus(na, 654321);
		System.out.println(bba);
		//5.4�� % 123456
		double namu = c.reminder(bba, 123456);
		System.out.println(namu);
		
		/*
		�� ������ �����ϰ� �߸���
		double result = c.plus(123456, 654321);
		result = c.multi(result, 123456);
		result = c.division(result, 123456);
		result = c.minus(result, 654321);
		result = c.reminder(result, 123456);
		System.out.println(result);
		*/
		
		
		//�ɸ��׽�Ʈ
		
		SimliTest sim = new SimliTest();
		
		sim.q1();
		
		
		
		
		
		
		
		
		
		
		
	}		
}
