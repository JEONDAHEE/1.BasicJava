package g_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 << 메서드에 예외 선언하기 >>
		 - 메서드 호출시 발생할 수 있는 예외를 선언 해 줄 수 있다.
		 - void method() throws IOException{}
		 - 메서드의 구현부 끝에 throws 키워드와 예외 클래스명으로 예외를 선언 할 수 있다.
		 - 예외를 선언하면 예외처리를 하지않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
	
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void method() throws IOException { // 예외를 선언해준다. //예외를 처리하지 않고 넘겨준다.
//		throw new IOException();
//		new FileInputStream("");
//		throw new NullPointerException(); //자주 보일것 //에러가 발생한 위치에 있는 객체가 null이다.
		throw new IndexOutOfBoundsException();
		
	}

}
