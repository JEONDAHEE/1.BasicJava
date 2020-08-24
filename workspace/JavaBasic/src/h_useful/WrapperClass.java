package h_useful;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 Wrapper클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 
		 boolean	: Boolean
		 char		: Character
		 byte 		: Byte
		 short 		: Short
		 int 		: Intrger
		 long 		: Long
		 float 		: Float
		 double 	: Double
		 */
		
		int i = 10;
		Integer iw = new Integer(20);
		System.out.println(i + iw); //기본형 타입과 참조형 타입은 원래 불가능 하지만 Wrapper클래스는 가능
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20")); //파라미터로 받은 문자열을 인트타입으로 바꿔주는 메서드
		
		System.out.println(i + String.valueOf(20));//파라미터로 받은 숫자를 스트링으로 바꿔준다.
		
		System.out.println(i + Integer.valueOf("20"));//문자열을 인트타입으로 바꿔준다 => parseInt = valueOf
		
		//배열을 쉽게 만들어준 거 
		ArrayList<Integer> list = new ArrayList<Integer>();
		//0부터 시작해서 배열의 길이가 값을 넣거나 빼면 늘어나고 줄어든다.
		//<>안에 타입지정
		// 기본형 타입은 넣을수 없고 객체만 넣을 수 있다.
		// 기본형으로 넣고 싶으면 Wrapper 클래스를 넣어준다.
		list.add(new Integer(10));
		list.add(10); //오토박싱 : 기본형 타입이 wrapper클래스로 자동 변환
		
		Integer integer = list.get(0);
		int i2 = list.get(0); // 언박싱 : wrapper클래스가 기본형 타입으로 자동 변환
		

		
	}

}
