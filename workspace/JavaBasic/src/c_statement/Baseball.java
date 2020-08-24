package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구 게임을 만들어 주세요.

		// 3자리의 중복되지 않는 숫자를 발생시킨다.(1~9)
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
	 		// 사용자에게 3개의 숫자를 입력 받는다.
	 		System.out.println("첫번째 수를 입력해 주세요.");
			num1 = s.nextInt();
			System.out.println("두번째 수를 입력해 주세요.");
			num2 = s.nextInt();
			System.out.println("세번째 수를 입력해 주세요.");
			num3 = s.nextInt();
			
			int S = 0;
			int B = 0;
			int O = 0;
			
			// 시용자가 입력한 값과 정답을 비교해 SBO를 카운팅 한다.
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
			
			System.out.println(++count + "차 시도  : " + num1 + num2 + num3 + "은  " + S + "S " + B + "B " + O + "O" );
			System.out.println("------------------------------");
			if(S == 3){
				System.out.println("3S! 정답입니다!");
			}

		}while (true);
		
		
	}

}










/*
		//숫자야구 게임을 만들어 주세요.
		// 3자리의 중복되지 않는 숫자를 발생시킨다.(1~9)
		// 사용자에게 3개의 숫자를 입력 받는다.
		// 시용자가 입력한 값과 정답을 비교해 SBO를 카운팅 한다.

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
			System.out.println("세자리수를 입력 해 주세요  > ");
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

			System.out.println(++count + "차 시도 " + num1 + num2 + num3 + " : "
					+ S + "S " + B + "B " + O + "O");
			System.out.println("-------------------------------");
			if (S == 3) {
				System.out.println("3S ! 정답입니다 !");
				break;
			}
		}

*/



