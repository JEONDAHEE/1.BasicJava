package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 << 에러 >>
		 - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 - 런타임 에러 : 실행시에 발생되는 에러(우리가 처리할 에러)
		 
		 <<런타임 에러>>
		 - 런타임 에러 발생 시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(처리불가)
		 - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리가능)
		 
		 <<예외>>
		 - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.(nuchecked예외)
		 - [RntimeException 클래스와 그 자식들을 제외한] Exception클래스의 자식들은 예외처리가 강제된다.(checked예외)
		 
		 <<예외처리(try-catch)>>
		 - 예외처리를 통해 프로그램리 비정상적으로 종료되는것을 방지 할 수 있다.
		 - try{} catch(Exception e){}
		 - try블럭안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 - catch의 ()안에는 처리할 예외를 지정해 줄 수 있다.
		 - 여러종류의 예외를 처리 할 수 있도록 catch는 하나이상 올 수 있다.
		 - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행 된 후 try-catch를 빠져나간다.
		 - 발생한 예외와 일치하는 catch가 없을경우 예외는 처리되지 않는다.
		 */
		
//		int result = 10 / 0; //정수는 0으로 나눌 수 없어서 런타임 에러 
//		//java.lang.ArithmeticException -> 발생한 에러 객체 
//		//: / by zero => 원인  
//		//at g_exception.ExceptionHandling.main(ExceptionHandling.java:32)-> 어디서 발생했는지 에러 위치
//		System.out.println(result);
		
		// =>
		try{ //트라이 안에서 에러가 발생했을때
			int result1 = 10 / 0; 
			System.out.println(result1);
		}catch(ArithmeticException | IndexOutOfBoundsException e){//캐치 안에는 발생된 오류를 파라미터에 넣어줌 //캐치 안에서 그 에러를 가지고 뭔가 처리를 해준다.
			//예외발생시 발생한 예외와 일치하는 catch블럭이 수행되고
			//일치하는 catch가없는 경우 예외는 처리되지 않는다.
			e.printStackTrace(); //에러메세지를 출력한다.
		}catch(NullPointerException e){//캐치는여러개를 붙일 수 있다.
			
		}catch(Exception e){
			//예상하지 못한 예외를 처리 할 수 있다.
			//모든 예외를 한번에 처리할 수 있다.
		}
		
		
		
		
		
		test1();
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10/0);
//		new FileInputStream(""); //catch로 감싸줘야한다.
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}// 에러가 어디서 부터 발생됐는지 알려면 에러메세지를 위에서부터 읽어야 한다.


































