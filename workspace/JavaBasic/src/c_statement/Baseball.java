package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// ���ھ߱� ������ ����� �ּ���.

		// 3�ڸ��� �ߺ����� �ʴ� ���ڸ� �߻���Ų��.(1~9)
		int su1, su2, su3;
		
		su1 = (int)(Math.random() * 9 + 1);
		
		do{
			su2 = (int)(Math.random() * 9 + 1);
			
		}while(su1 == su2);
		
		do{
			su3 = (int)(Math.random() * 9 + 1);
		}while(su2 == su3 || su3 == su1);
		

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		

		int count = 0;

		Scanner s = new Scanner(System.in);

		do {  
	 		// ����ڿ��� 3���� ���ڸ� �Է� �޴´�.
	 		System.out.println("ù��° ���� �Է��� �ּ���.");
			num1 = s.nextInt();
			System.out.println("�ι�° ���� �Է��� �ּ���.");
			num2 = s.nextInt();
			System.out.println("����° ���� �Է��� �ּ���.");
			num3 = s.nextInt();
			
			int S = 0;
			int B = 0;
			int O = 0;
			
			// �ÿ��ڰ� �Է��� ���� ������ ���� SBO�� ī���� �Ѵ�.
			if(su1 == num1){
					S++;
			}else if(su1 == num2 || su1 == num3){
				B++;				
			}else{
				O++;
			}
			
			if(su2 == num2){
				S++;
			}else if(su2 == num1 || su2 == num3){
				B++;
			}else{
				O++;
			}
			
			if(su3 == num3){
				S++;
			}else if(su3 == su1 || su3 == su2){
				B++;
			}else{
				O++;
			}
			
			System.out.println(++count + "�� �õ�  : " + num1 + num2 + num3 + "��  " + S + "S " + B + "B " + O + "O" );
			System.out.println("------------------------------");
			if(S == 3){
				System.out.println("3S! �����Դϴ�!");
			}

		}while (true);
		
		
	}

}










/*
		//���ھ߱� ������ ����� �ּ���.
		// 3�ڸ��� �ߺ����� �ʴ� ���ڸ� �߻���Ų��.(1~9)
		// ����ڿ��� 3���� ���ڸ� �Է� �޴´�.
		// �ÿ��ڰ� �Է��� ���� ������ ���� SBO�� ī���� �Ѵ�.

		int r1, r2, r3;

		r1 = (int) (Math.random() * 9 + 1);

		do {
			r2 = (int) (Math.random() * 9 + 1);
		} while (r1 == r2);

		do {
			r3 = (int) (Math.random() * 9 + 1);
		} while (r2 == r3 || r1 == r3);

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("���ڸ����� �Է� �� �ּ���  > ");
			int input = Integer.parseInt(s.nextLine());
			int num3 = input % 10;
			input /= 10;
			int num2 = input % 10;
			input /= 10;
			int num1 = input % 10;
			input /= 10;

			int S = 0;
			int B = 0;
			int O = 0;

			int count = 0;

			if (r1 == num1)
				S++;
			if (r2 == num2)
				S++;
			if (r3 == num3)
				S++;

			if (r1 == num2 || r2 == num3)
				B++;
			if (r2 == num1 || r2 == num3)
				B++;
			if (r3 == num1 || r3 == num2)
				B++;

			O = 3 - S - B;

			System.out.println(++count + "�� �õ� " + num1 + num2 + num3 + " : "
					+ S + "S " + B + "B " + O + "O");
			System.out.println("-------------------------------");
			if (S == 3) {
				System.out.println("3S ! �����Դϴ� !");
				break;
			}
		}

*/



