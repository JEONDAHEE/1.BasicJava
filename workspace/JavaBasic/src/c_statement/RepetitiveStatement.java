package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 <<for��>>
		 - for ( int i = 1; i<=10; i++ ){ }
		 - for( 1���� 10���� 1�� �����ϸ鼭 �ݺ� ){ }
		*/
		
		for ( int i = 1; i<= 10; i++ ){
			//for(�ʱ�ȭ; ���ǽ�; ������){ }
			//�ʱ�ȭ : ���ǽİ� �����Ŀ� ����� ���� �ʱ�ȭ
			//���ǽ� : �������� true�̸� ������ ������ �����Ѵ�.
			//������ : ������ ����/���� ���� �ݺ����� �����Ѵ�.
			System.out.println( i + "��° �ݺ� ");
		}
		
		int sum = 0; //1���� 10������ �հ踦 ����
		for( int i  = 1; i <= 10; i++ ){
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for(int i = 100; i >= 1; i--){//100���� 1���� 1�� �����ϸ鼭 �ݺ��ϸ� ���Ѵ�.
			sum +=i;
		}
		System.out.println(sum);
		
		//1���� 100���� ¦���� ���� ���غ���
		//1.
		sum = 0;
		for(int i = 0; i <= 100; i +=2){
			sum += i;
		}
		System.out.println(sum);
		//2.
		sum = 0;
		for(int i = 1; i <=100; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1���� 100���� Ȧ���� ���� �����ּ���.
		//1.
		sum = 0;
		for(int i = 1; i <=100; i += 2){
			sum += i;
		}
		System.out.println(sum);
		//2.
		sum = 0;
		for(int i = 1; i <=100; i++){
			if( i % 2 == 1 ){
				sum += i;
			}
		}
		System.out.println(sum);
		
		//�������� ����� ���ô�.
		/*
		 2 * 1 = 2
		 2 * 2 = 4
		 2 * 3 = 6
		 2 * 4 = 8
		 . . .
		 */
		//2�� ���
		for( int i = 1; i <= 9; i++){
			System.out.println( " 2 * " + i + " = " + i * 2 );
		}
		
		//7�� ���
		for( int i = 1; i <= 9; i++){
			System.out.println( " 7 * " + i + " = " + i * 7 );
		}
		
		/*//�ܼ��� �Է¹޾� �������� �ش��ϴ� ���� ����� �ּ���.
		Scanner s = new Scanner(System.in);
		System.out. println("���ϴ� �������� �Է� �� �ּ��� > ");
		int a = Integer.parseInt(s.nextLine());
		
		for ( int i = 1; i <= 9; i++){
			System.out.println( a + " * " + i + " = " + i * a);
		}*/
		
		//������ ��ü�� �ѹ��� ���
		for(int i  = 2; i <= 9; i++){
			for(int a = 1; a <= 9; a++){
				System.out.println(i + "*" + a + "=" + i * a);
			}
		}
		
		//������ ��ü�� ¦����, Ȧ�� �ٸ� ���
		//1.
		for(int i  = 0; i <= 9; i += 2){
			for(int a = 1; a <= 9; a += 2){
				System.out.println(i + "*" + a + "=" + i * a);
			}
		}
		//2.
		for(int i  = 0; i <= 9; i++){
			if(i % 2 ==0){
			for(int a = 1; a <= 9; a++){
				if(i % 2 ==1){
				System.out.println(i + "*" + a + "=" + i * a);
				}
			}
		}
	}
	
		//������ ��ü�� ���η� ����� �ּ���.
		for(int i  = 1; i <= 9; i++){
			for(int a = 2; a <= 9; a++){
				System.out.print(a + " * " + i + " = " + a * i + "\t");
			}
			System.out.println();//sysout -> ��Ʈ�� + �����̽���
		}
		
		
		for(int i = 1; i <= 5; i++){
			for(int a = 1; a <= 10; a++){
				System.out.print("��");
			}
			System.out.println();
		}
		
		//�ﰢ�� ������� ���� ����� ����.
		for(int i = 1; i <= 10; i++){
			for(int a = 1; a <= i; a++){
				System.out.print("��");
			}
			System.out.println();
		}
		
		//���ﰢ�� ������� ���� ��� �� �ּ���
		for(int i = 10; i >= 1; i--){
			for(int a = 1; a <= i; a++){
				System.out.print("��");
			}
			System.out.println();
		}
		
		
		/*<<while ��>>
		 - while(���ǽ�){}
		 - ���ǽ��� ����� true�� ���� ����ؼ� �ݺ�
		 - �ݺ�Ƚ���� �� �� ���� �� ����Ѵ�.
		 
		 */
		
		/*Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("����� ��� �ұ�� ? (���� : 0)");
			int dan = Integer.parseInt(s.nextLine());
			
			if(dan == 0){
				System.out.println("����Ǿ����ϴ�.");
				break; //����� �ݺ��� �ϳ��� Ż���Ѵ�.
			}
			for(int i = 1; i <= 9; i++){
				System.out.println(dan + " * " + i + " = " + i * dan);
			}
		}*/

		/*
		 <<do-while��>>
		 - do{ }while(���ǽ�);
		 - �ּ��� �ѹ��� ������ �����Ѵ�.
		 */
		
	/*	//���� ���߱� ����
		int answer = (int)(Math.random() * 100) + 1; //1~100������ ���� ���� �߻�
		int input = 0;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("1~100������ ���� �Է� �� �ּ���. > ");
			input = Integer.parseInt(s.nextLine());
			
			if(answer < input){
				System.out.println(input + "���� �۽��ϴ�.");
				
			}else if(input < answer){
				System.out.println(input + "���� Ů�ϴ�");
				
			}else{
				System.out.println(input + "�����Դϴ� !");
				
			}
		}while (input != answer);//�����ݷ��� �ٿ��� �Ѵ�.
*/		
		//�̸� ���� �ݺ���
		outer : for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				if(j == 5){
					break;//���� ����� �ݺ��� �ϳ��� ���� ������.
//					break outer; //outer��� �̸��� �ݺ����� ����������.
//					continue; //���� ����� �ݺ����� ���� ���� ȸ���� ����������.
//					continue outer; //outer��� �̸��� ���� �ݺ� ȸ���� ����������.
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
			
	}

}


































