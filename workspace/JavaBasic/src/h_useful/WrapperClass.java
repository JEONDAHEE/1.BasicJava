package h_useful;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 WrapperŬ���� : �⺻�� Ÿ���� ��ü�� ����ؾ� �� �� ��� ����ϴ� Ŭ����
		 
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
		System.out.println(i + iw); //�⺻�� Ÿ�԰� ������ Ÿ���� ���� �Ұ��� ������ WrapperŬ������ ����
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20")); //�Ķ���ͷ� ���� ���ڿ��� ��ƮŸ������ �ٲ��ִ� �޼���
		
		System.out.println(i + String.valueOf(20));//�Ķ���ͷ� ���� ���ڸ� ��Ʈ������ �ٲ��ش�.
		
		System.out.println(i + Integer.valueOf("20"));//���ڿ��� ��ƮŸ������ �ٲ��ش� => parseInt = valueOf
		
		//�迭�� ���� ������� �� 
		ArrayList<Integer> list = new ArrayList<Integer>();
		//0���� �����ؼ� �迭�� ���̰� ���� �ְų� ���� �þ�� �پ���.
		//<>�ȿ� Ÿ������
		// �⺻�� Ÿ���� ������ ���� ��ü�� ���� �� �ִ�.
		// �⺻������ �ְ� ������ Wrapper Ŭ������ �־��ش�.
		list.add(new Integer(10));
		list.add(10); //����ڽ� : �⺻�� Ÿ���� wrapperŬ������ �ڵ� ��ȯ
		
		Integer integer = list.get(0);
		int i2 = list.get(0); // ��ڽ� : wrapperŬ������ �⺻�� Ÿ������ �ڵ� ��ȯ
		

		
	}

}
