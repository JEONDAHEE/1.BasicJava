package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 << ���� >>
		 - ������ ���� : ������ �ÿ� �߻��Ǵ� ����(������)
		 - ���� ���� : ������ ������, �ǵ��� �ٸ��� �����ϴ� ��(����)
		 - ��Ÿ�� ���� : ����ÿ� �߻��Ǵ� ����(�츮�� ó���� ����)
		 
		 <<��Ÿ�� ����>>
		 - ��Ÿ�� ���� �߻� �� �߻��� ��ġ���� ���α׷��� ������������ ����ȴ�.
		 - ���� : ���α׷� �ڵ忡 ���ؼ� ������ �� ���� �ɰ��� ����(ó���Ұ�)
		 - ���� : ���α׷� �ڵ忡 ���ؼ� ������ �� �ִ� �ټ� �̾��� ����(ó������)
		 
		 <<����>>
		 - ��� ���ܴ� Exception Ŭ������ �ڽ� Ŭ�����̴�.
		 - RuntimeException Ŭ������ �� �ڽĵ��� ����ó���� �������� �ʴ´�.(nuchecked����)
		 - [RntimeException Ŭ������ �� �ڽĵ��� ������] ExceptionŬ������ �ڽĵ��� ����ó���� �����ȴ�.(checked����)
		 
		 <<����ó��(try-catch)>>
		 - ����ó���� ���� ���α׷��� ������������ ����Ǵ°��� ���� �� �� �ִ�.
		 - try{} catch(Exception e){}
		 - try������ ������ ���� �� ���ܰ� �߻��ϸ� catch�� �Ѿ��.
		 - catch�� ()�ȿ��� ó���� ���ܸ� ������ �� �� �ִ�.
		 - ���������� ���ܸ� ó�� �� �� �ֵ��� catch�� �ϳ��̻� �� �� �ִ�.
		 - �߻��� ���ܿ� ��ġ�ϴ� catch ������ ������ ���� �� �� try-catch�� ����������.
		 - �߻��� ���ܿ� ��ġ�ϴ� catch�� ������� ���ܴ� ó������ �ʴ´�.
		 */
		
//		int result = 10 / 0; //������ 0���� ���� �� ��� ��Ÿ�� ���� 
//		//java.lang.ArithmeticException -> �߻��� ���� ��ü 
//		//: / by zero => ����  
//		//at g_exception.ExceptionHandling.main(ExceptionHandling.java:32)-> ��� �߻��ߴ��� ���� ��ġ
//		System.out.println(result);
		
		// =>
		try{ //Ʈ���� �ȿ��� ������ �߻�������
			int result1 = 10 / 0; 
			System.out.println(result1);
		}catch(ArithmeticException | IndexOutOfBoundsException e){//ĳġ �ȿ��� �߻��� ������ �Ķ���Ϳ� �־��� //ĳġ �ȿ��� �� ������ ������ ���� ó���� ���ش�.
			//���ܹ߻��� �߻��� ���ܿ� ��ġ�ϴ� catch���� ����ǰ�
			//��ġ�ϴ� catch������ ��� ���ܴ� ó������ �ʴ´�.
			e.printStackTrace(); //�����޼����� ����Ѵ�.
		}catch(NullPointerException e){//ĳġ�¿������� ���� �� �ִ�.
			
		}catch(Exception e){
			//�������� ���� ���ܸ� ó�� �� �� �ִ�.
			//��� ���ܸ� �ѹ��� ó���� �� �ִ�.
		}
		
		
		
		
		
		test1();
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10/0);
//		new FileInputStream(""); //catch�� ��������Ѵ�.
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}// ������ ��� ���� �߻��ƴ��� �˷��� �����޼����� ���������� �о�� �Ѵ�.


































