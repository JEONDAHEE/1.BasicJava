package a_variable;

import java.util.Scanner; //ctrl + shift + o



public class Variable {
	int a;//전역변수
	
	public static void main(String[] args) {
		
		/* <<변수>>
		 * -하나의 데이터를 저장 할 수 있는 메모리 상의 공간
		 * 
		 * 
		 * << 사용 가능한 데이터의 종류>>
		 * - 정수 : byte(1), short(2), int(4), long(8)
		 * - 실수 : float(4), double(8)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 * byte  : -2^7 ~ 2^7-1
		 * short : -2^15 ~ 2^15-1
		 * int   : -2^31 ~ 2^31-1
		 * long  : -2^63 ~ 2^63-1
		 * char  : 0 ~ 2^16
		 * 
		 * 
		 *  - 타입의 크기와 표현 범위는 자바의정석 29쪽 참조
		 *  - 데이터룰 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지, 그것의 이름이 무엇인지 알려줘야한다.
		 *  - 명명규칙은 자바의정석 25~26쪽 참조
		 * 
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		
		byte _byte;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		char _char;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 떄에는 변수의 이름으로 사용한다.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
//		System.out.println(_int); //컴파일 에러 발생 (문법이 틀렸다.)
		
		//=(대입연산자) : 대입연산자로 오른쪽의 값을 왼쪽(변수)에 저장한다.
		_byte = 127;//타입에 맞는 값을 저장해야 한다.
		_short = 30000;
		_int = 20;
		_long = 900L; //long 접미사 : L
		_float = 3.14f;//float의 접미사 : f
		_double = 3.14;//double의 접미사 : d(생략가능)
		_char = '가';
		_boolean = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것 
		
		System.out.println(_int);
		//ctrl + F11 : 프로그램 실행
		//F11 : 디버그 실행
		
		_int = 30;
		System.out.println(_int);
		_int = 30 + 40;
		System.out.println(_int);
		_int = _short;
		System.out.println(_int);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		_byte = 5;
		_short = 33;
		_int = 55;
		_long = 35L;
		_float = 2.5f;
		_double = 2.5;
		_char = '히';
		_boolean = true;
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : " "(큰따옴표)로 감싸진 글자
		
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * <<리터럴의 종류>>
		 * - 숫자 : 0, 10, -5, 3.14
		 * - 문자 : '가', 'a', '0', ''
		 * - 문자열 : "가나다", "abc", "123", " ", ""
		 * - 그 외 : true, false, null
		 * 
		 * <<참조형 타입>>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0;
		_char = '\u0000'; // ' '
		_boolean = false;
		_String = null;
		
		//경우에 따라 변수 타입이 다른 값을 저장하기도 한다.
		
		_byte = 127;
		_int = 128;
		_byte = (byte)_int; //형변환 : 데이터 타입을 변환하는것
		System.out.println(_byte); //128 -> -128 (오버플로우)
		
		_byte = -128;
		_int = -129;
		_byte = (byte) _int;
		System.out.println(_byte); //-129 -> -127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실 될 염려가 없다.
		//그러므로 형변환을 생략 할 수 있다.
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요.
		_byte = (byte)_int;
		_int = (int)_long;
		_float = (float)_double;
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해 주세요.
		_int = _byte;
		_long = _short;
		_double = _float;
		
		/*
		 * <<상수>>
		 * - 값을 한번 저장하면 변경 할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10; //초기화
//		MAX_NUMBER = 100; //컴파일 에러
		
		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in);

//		System.out. println("문자열을 입력해 주세요 > ");
//		String input1 = s.nextLine();
//		System.out. println("입력받은 문자열  : " + input1);
/*
		System.out.println("숫자를 입력해주세요 > ");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자  : " + input2);
*/
		//문자열을 입력받고 입력받은 문자열을 출력해 주세요.
		
		System.out.println("하고싶으신 말씀 있으신가요?  > ");
		String a = s.nextLine();
		System.out.println("다희  : "+ a);
		
		System.out.println("저기요 핸드폰번호 좀 알려주세요 > ");
		int b = Integer.parseInt(s.nextLine());
		System.out.println("부끄러워하며  " + b);
	
	}

}



























