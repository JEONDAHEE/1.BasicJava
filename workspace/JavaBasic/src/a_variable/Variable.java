package a_variable;

import java.util.Scanner; //ctrl + shift + o



public class Variable {
	int a;//��������
	
	public static void main(String[] args) {
		
		/* <<����>>
		 * -�ϳ��� �����͸� ���� �� �� �ִ� �޸� ���� ����
		 * 
		 * 
		 * << ��� ������ �������� ����>>
		 * - ���� : byte(1), short(2), int(4), long(8)
		 * - �Ǽ� : float(4), double(8)
		 * - ���� : char(2)
		 * - �� : boolean(1)
		 * 
		 * byte  : -2^7 ~ 2^7-1
		 * short : -2^15 ~ 2^15-1
		 * int   : -2^31 ~ 2^31-1
		 * long  : -2^63 ~ 2^63-1
		 * char  : 0 ~ 2^16
		 * 
		 * 
		 *  - Ÿ���� ũ��� ǥ�� ������ �ڹ������� 29�� ����
		 *  - �����ͷ� ����ϱ� ���ؼ��� � ������ �����͸� ����� ������, �װ��� �̸��� �������� �˷�����Ѵ�.
		 *  - ����Ģ�� �ڹ������� 25~26�� ����
		 * 
		 */
		
		//���� ���� ��� : ������ Ÿ�� + �����̸�
		byte abc;
		char moonja;
		
		//��� �⺻�� Ÿ���� ����ؼ� 8���� ������ �������ּ���.
		
		byte _byte;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		char _char;
		boolean _boolean;
		
		//������ ���� ������ ����� ������ ������ �̸����� ����Ѵ�.
		//������ ���� �������� ������ ������ ���� ������ �� ����.
		
//		System.out.println(_int); //������ ���� �߻� (������ Ʋ�ȴ�.)
		
		//=(���Կ�����) : ���Կ����ڷ� �������� ���� ����(����)�� �����Ѵ�.
		_byte = 127;//Ÿ�Կ� �´� ���� �����ؾ� �Ѵ�.
		_short = 30000;
		_int = 20;
		_long = 900L; //long ���̻� : L
		_float = 3.14f;//float�� ���̻� : f
		_double = 3.14;//double�� ���̻� : d(��������)
		_char = '��';
		_boolean = true;
		//�ʱ�ȭ : ������ ó������ ���� �����ϴ� �� 
		
		System.out.println(_int);
		//ctrl + F11 : ���α׷� ����
		//F11 : ����� ����
		
		_int = 30;
		System.out.println(_int);
		_int = 30 + 40;
		System.out.println(_int);
		_int = _short;
		System.out.println(_int);
		
		//������ �ʱ�ȭ�� ������ ���ο� ���� �����ϰ� ������ּ���.
		
		_byte = 5;
		_short = 33;
		_int = 55;
		_long = 35L;
		_float = 2.5f;
		_double = 2.5;
		_char = '��';
		_boolean = true;
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String : �������� ���ڸ� ���ϰ� ����ϱ� ���� Ŭ����
		//���ڿ� : " "(ū����ǥ)�� ������ ����
		
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * <<���ͷ��� ����>>
		 * - ���� : 0, 10, -5, 3.14
		 * - ���� : '��', 'a', '0', ''
		 * - ���ڿ� : "������", "abc", "123", " ", ""
		 * - �� �� : true, false, null
		 * 
		 * <<������ Ÿ��>>
		 * - �⺻�� Ÿ���� ������ ��� ������ Ÿ��(�迭, Ŭ����)
		 * - ex) String, ABC, Variable
		 * - ���� ������ ������� �ʰ� ���� ����Ǹ�, �� �ּҰ� ������ ����ȴ�.
		 * - ������ ũ��� 4byte�̴�.
		 */
		
		//�⺻�� : ���������� �ƹ��͵� �������� �ʾ����� ����Ǿ� �ִ� ��
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0;
		_char = '\u0000'; // ' '
		_boolean = false;
		_String = null;
		
		//��쿡 ���� ���� Ÿ���� �ٸ� ���� �����ϱ⵵ �Ѵ�.
		
		_byte = 127;
		_int = 128;
		_byte = (byte)_int; //����ȯ : ������ Ÿ���� ��ȯ�ϴ°�
		System.out.println(_byte); //128 -> -128 (�����÷ο�)
		
		_byte = -128;
		_int = -129;
		_byte = (byte) _int;
		System.out.println(_byte); //-129 -> -127 (����÷ο�)
		//ǥ�������� ū Ÿ�Կ��� ���� Ÿ������ ����ȯ �� ��� �����Ͱ� �սǵ� �� �ִ�.
		
		
		//ǥ�������� ���� Ÿ�Կ��� ū Ÿ������ ����ȯ �� ��� �����Ͱ� �ս� �� ������ ����.
		//�׷��Ƿ� ����ȯ�� ���� �� �� �ִ�.
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//������ ���� �������� ǥ�������� ���� Ÿ������ ����ȯ ���ּ���.
		_byte = (byte)_int;
		_int = (int)_long;
		_float = (float)_double;
		
		//������ ���� �������� ǥ�������� ū Ÿ������ ����ȯ �� �ּ���.
		_int = _byte;
		_long = _short;
		_double = _float;
		
		/*
		 * <<���>>
		 * - ���� �ѹ� �����ϸ� ���� �� �� ���� �������
		 * - final int MAX_NUMBER;
		 * - ���ͷ��� �ǹ̸� �ο��ϱ� ���� ����Ѵ�.
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10; //�ʱ�ȭ
//		MAX_NUMBER = 100; //������ ����
		
		//�ܼ�â���� �Է¹޴� ���
		Scanner s = new Scanner(System.in);

//		System.out. println("���ڿ��� �Է��� �ּ��� > ");
//		String input1 = s.nextLine();
//		System.out. println("�Է¹��� ���ڿ�  : " + input1);
/*
		System.out.println("���ڸ� �Է����ּ��� > ");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("�Է¹��� ����  : " + input2);
*/
		//���ڿ��� �Է¹ް� �Է¹��� ���ڿ��� ����� �ּ���.
		
		System.out.println("�ϰ������ ���� �����Ű���?  > ");
		String a = s.nextLine();
		System.out.println("����  : "+ a);
		
		System.out.println("����� �ڵ�����ȣ �� �˷��ּ��� > ");
		int b = Integer.parseInt(s.nextLine());
		System.out.println("�β������ϸ�  " + b);
	
	}

}



























