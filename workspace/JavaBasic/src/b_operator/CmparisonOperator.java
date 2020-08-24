package b_operator;

public class CmparisonOperator {

	public static void main(String[] args) {
		/*
		 <<비교 연산자>>
		 - < : 작다.
		 - > : 크다.
		 - <= : 작거나 같다.
		 - >= : 크거나 같다.
		 - == : 같다.
		 - != : 같지않다.
		 */
		
		//비교 연산자의 연산 결과는 bollean타입의 연산 결과를 얻는다.
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 < 20 - 15; // 산술연산이 우선순위가 더 높다.
		System.out.println(b);
		
		b = 10 <= 10.0;
		//이항연산자는 타입을 일치시킨 후 연산한다.
		System.out.println(b);
		
		b = 65>='B';
		System.out.println(b);
				
		b = 10.0f == 10.0;
		System.out.println(b);
		
		b= 10.1f == 10.1;
		System.out.println(b);
		System.out.printf("%22.20f%n", 10.1f); //printf-> f->포맷   %22.20f%n -> 소수점 22개중 20번째를 표현해줘
 		System.out.printf("%22.20f%n", 10.1);
 		//정확하게 표현하고싶으면 더블타입을 플롯타입으로 형변환한다.
 		b = 10.1f ==(float)10.1;
 		System.out.println(b);
 		
 		//대소 비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만 등가비교는 모든 타입을 비교할 수 있다.
 		b = 'A' == 65;
 		System.out.println(b);
 		b = true != false;
 		System.out.println(b);
 		
 		b = "abc" == "abc";
 		System.out.println(b);
 		b = "abc" == new String("abc"); //new는새로운 주소 생성 
 		System.out.println(b);
 		//참조형 타입은 저장된 메모리주소를 비교하기 때문에 String은 등가비교 연산자로 내용을 비교할 수 없다.
 		
 		
 		b = "abc".equals(new String("abc")); //equals를 사용하면 String의 내용을 비교할 수 있다.
 		System.out.println(b);
 		b = !"abc".equals("ABC");//같지않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여준다.
 		
 		//다음의 문장들을 코드로 작성 해 주세요.
 		
 		//1보다2가 큰가?
 		b = 1 < 2;
 		System.out.println("1보다 2가 큰가? " + b);
 		
 		//0은100보다 작거나 같은가?
 		b = 0 <= 100;
 		System.out.println("0은 100보다 작거나 같은가? " + b);
 		
 		//3.14f와 3.14는 다른가?
 		b = 3.14f != 3.14;
 		System.out.println("3.14f와 3.14는 다른가?  " + b);
 		
 		//남자와 여자는 다른가?
 		b = !"남자".equals("여자"); //문자열사용할때  equals 꼭 사용 중요해요 !!!!!!!!!!!!!!!
 		
 		System.out.println("남자와 여자는 다른가? " + b);
	}

}





































