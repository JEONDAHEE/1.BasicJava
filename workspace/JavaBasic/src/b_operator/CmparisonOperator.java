package b_operator;

public class CmparisonOperator {

	public static void main(String[] args) {
		/*
		 <<�� ������>>
		 - < : �۴�.
		 - > : ũ��.
		 - <= : �۰ų� ����.
		 - >= : ũ�ų� ����.
		 - == : ����.
		 - != : �����ʴ�.
		 */
		
		//�� �������� ���� ����� bolleanŸ���� ���� ����� ��´�.
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 < 20 - 15; // ��������� �켱������ �� ����.
		System.out.println(b);
		
		b = 10 <= 10.0;
		//���׿����ڴ� Ÿ���� ��ġ��Ų �� �����Ѵ�.
		System.out.println(b);
		
		b = 65>='B';
		System.out.println(b);
				
		b = 10.0f == 10.0;
		System.out.println(b);
		
		b= 10.1f == 10.1;
		System.out.println(b);
		System.out.printf("%22.20f%n", 10.1f); //printf-> f->����   %22.20f%n -> �Ҽ��� 22���� 20��°�� ǥ������
 		System.out.printf("%22.20f%n", 10.1);
 		//��Ȯ�ϰ� ǥ���ϰ������ ����Ÿ���� �÷�Ÿ������ ����ȯ�Ѵ�.
 		b = 10.1f ==(float)10.1;
 		System.out.println(b);
 		
 		//��� �񱳴� boolean�� ������ �⺻�� Ÿ�Ը� ���� �� ������ ��񱳴� ��� Ÿ���� ���� �� �ִ�.
 		b = 'A' == 65;
 		System.out.println(b);
 		b = true != false;
 		System.out.println(b);
 		
 		b = "abc" == "abc";
 		System.out.println(b);
 		b = "abc" == new String("abc"); //new�»��ο� �ּ� ���� 
 		System.out.println(b);
 		//������ Ÿ���� ����� �޸��ּҸ� ���ϱ� ������ String�� ��� �����ڷ� ������ ���� �� ����.
 		
 		
 		b = "abc".equals(new String("abc")); //equals�� ����ϸ� String�� ������ ���� �� �ִ�.
 		System.out.println(b);
 		b = !"abc".equals("ABC");//�����ʴ��� ����� ��� ���ؼ��� !(NOT)�� �տ� �ٿ��ش�.
 		
 		//������ ������� �ڵ�� �ۼ� �� �ּ���.
 		
 		//1����2�� ū��?
 		b = 1 < 2;
 		System.out.println("1���� 2�� ū��? " + b);
 		
 		//0��100���� �۰ų� ������?
 		b = 0 <= 100;
 		System.out.println("0�� 100���� �۰ų� ������? " + b);
 		
 		//3.14f�� 3.14�� �ٸ���?
 		b = 3.14f != 3.14;
 		System.out.println("3.14f�� 3.14�� �ٸ���?  " + b);
 		
 		//���ڿ� ���ڴ� �ٸ���?
 		b = !"����".equals("����"); //���ڿ�����Ҷ�  equals �� ��� �߿��ؿ� !!!!!!!!!!!!!!!
 		
 		System.out.println("���ڿ� ���ڴ� �ٸ���? " + b);
	}

}





































