package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<���������>>
		 - + : ���ϱ�
		 - - : ����
		 - * : ���ϱ�
		 - / : ������ 
		 - % : ������
		 - ���� �����ڴ� ������ �ǿ������� Ÿ���� ��ġ�ؾ� ������ �����ϴ�.
		 
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		// ���а� ���� *, /, % �����ڰ� +, - ���� ������ �켱������ ����.
		// �켱������ ������ ��� ���ʺ��� ������ ����ȴ�.
		System.out.println(a);
		
		a = (int)(10 + 20.3);
		//�ǿ������� Ÿ���� ���� �ٸ� ��� ǥ�������� ū ������ ����ȯ �� ������ ����ȴ�.
		//���� ������ ����� ǥ�������� ū���� Ÿ���� �ȴ�.
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);
		//int���� ���� ���� Ÿ���� int�� ����ȯ �� ������ ����ȴ�.
		
		long e1 = 100000 * 100000;
		System.out.println(e1);
		long e2 = 100000L * 100000;
		System.out.println(e2);
		
		
		float f1 = 10 / 4;
		System.out.println(f1);
		float f2 = 10/4f;
		System.out.println(f2);
		int f3 = 10 % 4;//10�� 4�γ��� ������
		System.out.println(f3);
		
		//������ 0���� ���� �� ����.
		//int g1 = 10 / 0; // ��Ÿ�� ���� �߻�
		float g2 = 10.0f / 0;
		System.out.println(g2); //infinity : ���Ѵ�
		float g3 = 0/0f;
		System.out.println(g3); //NaN : Not a Number
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		
		int h3 = 'D' - 'A';
		System.out.println(h3);
		
		int h4 = '5' - '0';
		System.out.println(h4);

		//��������ڿ� ���Կ����ڸ� ���� ������� �ٿ��� ǥ���� �� �ִ�.
		
		int i =0;
		i = i + 1;
		i += 1;// ���տ�����
		//���ϴ� ���� 1�ΰ�쿡�� �� ���� �� �ִ�.
		++i; // ������ : ������ �����Ǳ� �� ����
		i++; // ������ : ������ ������ �� ����
		
		i=0;
		System.out.println("++i = " + ++i);
		i=0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		i = i - 1;
		i -= 1;
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i= i % 4;
		i %= 4;
		//////////////////////////////////////////////////////////////////////////
		double round = 50.65;
		System.out.println((int)(round + 0.5)); 
		//�ݿø��� �ϱ����� 0.5�� ���ϰ� �Ҽ����� ���ֱ� ���� int�� ����ȯ �Ѵ�.
		System.out.println((int)(round * 10 + 0.5) / 10.0 );
		
		//������ ���پ�����ؼ� ���� ������� ������ּ���.
		//1. 123456 +654321
		//2. 1���� ����� * 123456
		//3. 2���� ����� / 123456
		//4. 3���� ����� - 654321
		//5. 4���� ����� % 123456
		
		
		/*double num = 123456 + 654321;
		num *= 123456;
		num /= 123456;
		num -= 654321;
		num %= 123456;
		System.out.println(num);
		*/
		
		//3���� int�� ������ ���� �� �ʱ�ȭ �� �հ�� ����� �����ּ���.(����� �Ҽ��� ��°�ڸ����� �ݿø�)
		
		int num1 = 10;
		int num2 = 5;
		int num3  = 8;
		
		int hap = num1+num2+num3;
		double av = hap/3.0;
		
		System.out.println("��  : " + hap );
		System.out.println("��� : " + (int)(av * 10 + 0.5) / 10.0);
		
		
		
	}

}





































