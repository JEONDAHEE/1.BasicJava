package z_exam;

public class EXAM_04 {

	public static void main(String[] args) {
		/*
		 [4-1] ������ ������� ���ǽ����� ǥ���϶�. 
		 1. int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		 	10 < x && x < 20
		 2. char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
		 	ch != "" && ch != " "
		 3. char�� ���� ch�� 'x'�Ǵ� 'X'�� �� true�� ���ǽ�
		 	ch =='x'||ch == 'X' 	 
		 4. char�� ���� ch�� ���� (��0��~��9��)�� �� true�� ���ǽ�
		 	'0' <= ch && ch <= '9'
		 5. char�� ���� ch�� ������ (�빮�� �Ǵ� �ҹ���) �� �� true�� ���ǽ� 
		 	'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'
		 6. int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100���� ������������ ���� �� true�� ���ǽ� 
		 	year % 400 == 0 || year % 4 == 0 || year % 100 != 0
		 7. boolean�� ���� powerOn�� false�� �� true�� ���ǽ� 
		 	if(powerOn == false)
		 8. ���ڿ� �������� str�� "yes"�� �� true�� ���ǽ�
		 	if(str == "yes")
		 
		 ------------------------------------------------------------------------------------
		 
		 [4-2] 1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		 
		 =>==================================================================================
				int hap = 0;
		
				for(int i = 1; i <= 20; i++ ){
					if(i % 2 != 0 && i % 3 != 0){
			  		hap += i;
					}			
				}
				System.out.println(hap);
		 -------------------------------------------------------------------------------------
		 [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
		
		 	=>===============================================================================
		 		int a = 0;
				int hap = 0;
		
				for(int i = 1; i <= 10; i++){
					a += i;
					hap += a;
					System.out.println(hap);
				}
		------------------------------------------------------------------------------------------
		 [4-4]  1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
		 
		 		=>================================================================================
		 		int a = 0;
		int sum = 0;
		
		while(sum < 100){
			++a;
			
			if(a % 2 == 0){
				sum -= a;		
			}else{
				sum += a;
			}
		}
		System.out.println(a);
		---------------------------------------------------------------------------------------------- 		
		 [4-5] ������ for���� while������ �����Ͻÿ�.
		 
		 [�������� ]/ch4/Exercise4_5.java 
		 public class Exercise4_5 { 
		 	public static void main(String[] args) {
		 	 for(int i=0; i<=10; i++) { 
		 	 	for(int j=0; j<=i; j++) 
		 	 		System.out.print("*"); 
		 	 	System.out.println(); 
		 	 } 
		 	} // end of main 
		 } // end of class
		 
		 =>===============================================================
		 	int i = 0;
			while(i <= 10){
				int j = 0;
				while(j <= i){
					System.out.print("*");
					j++;	
				}
				System.out.println();
				i++;
			}	
		------------------------------------------------------------------------------------------- 
		 [4-6] �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 	 =>=================================================================================
		 	for(int i = 1; i <= 6; i++){
				for(int j = 1; j <= 6; j++){
					if(i + j == 6){
						System.out.println("���� 6�� �Ǵ� ���� => "+"(" + i + ") + " + "(" + j + ") = " + (i+j));
					}
				}
			}
		
		--------------------------------------------------------------------------------------------------- 
		 [4-7]  Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ ���� value�� �����ϴ� �ڵ带 �ϼ��϶� (1)�� �˸��� �ڵ带 �����ÿ�.
		 		[��������]/ch4/Exercise4_7.java 
		 			class Exercise4_7 { 
		 				public static void main(String[] args) { 
		 					int value = (  (1)  ); 
		 		
		 					System.out.println("value:"+value); 
		 				} 
		 			}
		 
		 =>================================================================================================ 	
		 		int value = (int)(Math.random()*6)+1; 
				System.out.println("value:"+value);
		
		 ---------------------------------------------------------------------------------------------------
		 [4-8] ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. �� x�� y�� �����̰� ������ ������  0<=x<=10, 0<=y<=10 �̴�.
		 		[������] x=1, y=2 
		 		   		 x=3, y=1 
		 		   		 x=5, y=0
		 		   
	 =>=====================================================================================
		 		   
	 				int x = 0;
					int y = 0;
		
					for(x = 0; x <= 10; x++){
						for(y = 0; y <= 10; y++){
							if((2*x) + (4*y) == 10){
								System.out.println("x = " + x + ", " + "y = " + y);
							}
						}
					}
	 	----------------------------------------------------------------------------------------------------------------	
		 [4-10] intŸ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶� ���� ���� num�� ���� 12345��� ��1+2+3+4+5���� ����� �� ����϶�. 
		 		(1)�� �˸��� �ڵ带 �����ÿ�.
				[����] ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
				[��������]/ch4/Exercise4_10.java 
				class Exercise4_10 { 
					public static void main(String[] args) { 
						int num = 12345; 
						int sum = 0; 
						
						*
						* �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
						* 
						System.out.println("sum="+sum); 
					}
				}
				
				[������] 15
				
			=> ==========================================================================================
				int num = 12345;
				int sum = 0;
		
				while (num != 0) {
					sum += num % 10;
					num /= 10;
				}
				System.out.println("sum = " + sum);
			------------------------------------------------------------------------------------------------------	
			[4-11] �Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�. 
				     ���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ���� 1�� �� 2���ؼ� 3�� �Ǿ 1,1,2,3,5,8,13,21,...�� ���� ������ ����ȴ�.
				   1 �� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
				   [��������]/ch4/Exercise4_11.java 
				   public class Exercise4_11 { 
				   		public static void main(String[] args) { 
				   			// Fibonnaci ������ ������ ù �� ���ڸ� �� �Ѵ� 
				   			 int num1 = 1; 
				   			 int num2 = 1; 
				   			 int num3 = 0; // ����° ��
				   			 System.out.print(num1+","+num2); 
				   			 
				   			 for (int i = 0 ; i < 8 ; i++ ) {
				   			 * 
				   			 * �˸��� �ڵ带 �־� �ϼ��Ͻÿ� 
				   			 * 
				   			} 
				   		} // end of main 
				   	} // end of class
				   	
				[������] 1,1,2,3,5,8,13,21,34,55
		=>=============================================================================================
				 int num1 = 1; 
				 int num2 = 1; 
				 int num3 = 0; // ����° ��
				 System.out.print(num1+","+num2); 
				 
				 for (int i = 0 ; i < 8 ; i++ ) {
					 num3 = num1 + num2;
					 System.out.print( "," + num3);
					 
					 num1 = num2;
					 num2 = num3;
				} 
	-----------------------------------------------------------------------------------------------------
			[4-14] ������ ���ڸ��߱� ������ �ۼ��� ���̴�. 1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������.
			 	      ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�. ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� �� ���� ���ڸ� ������� �˷��ش�.
			 	   (1)~(2)�� �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
			 	   
			 	   [��������]/ch4/Exercise4_14.java 
			 	   class Exercise4_14 { 
			 	   		public static void main(String[] args) { 
			 	   		// 1~100������ ������ ���� �� answer�� �����Ѵ�
			 	   		 int answer = (1); 
			 	   		 int input = 0; // ������Է��� ������ ����
			 	   		 int count = 0; // �õ�Ƚ���� �������� ����
			 	   		  
						//ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ��� 
						 java.util.Scanner s = new java.util.Scanner(System.in); 
						 
						 do { 
						 		count++;  
						 		System.out.print("1 100 ������ ���� �Է��ϼ��� :"); 
						 		input = s.nextInt(); //  �Է¹��� ���� ���� input�� �����Ѵ�.
						 		*
						 		*�˸��� �ڵ带 �־� �ϼ��Ͻÿ� 
						 		*
						 	} while(true); //���� �ݺ��� 
						 } // end of main 
					} // end of class HighLow
					
					[������] 1�� 100������ ���� �Է��ϼ��� :50 
							�� ū ���� �Է��ϼ���. 
							1�� 100������ ���� �Է��ϼ��� :75
							 �� ū ���� �Է��ϼ���. 
							 1�� 100������ ���� �Է��ϼ��� :87 
							 �� ���� ���� �Է��ϼ���. 
							 1�� 100������ ���� �Է��ϼ��� :80 
							 �� ���� ���� �Է��ϼ���. 
							 1�� 100������ ���� �Է��ϼ��� :77 
							 �� ���� ���� �Է��ϼ���. 
							 1�� 100������ ���� �Է��ϼ��� :76 
							 ������ϴ�. 
							 �õ�Ƚ���� 6���Դϴ�.
							 
		=>=========================================================================================================
			 int answer = (int)(Math.random() * 100) + 1;; 
	   		 int input = 0; 
	   		 int count = 0; 
			
			 java.util.Scanner s = new java.util.Scanner(System.in); 
			 
			
			 		do{
			 			count++;
			 			
						System.out.println("1~100������ ���� �Է� �� �ּ���. > ");
						input = Integer.parseInt(s.nextLine());
						
						if(answer < input){
							System.out.println(input + "���� �۽��ϴ�.");
							
						}else if(input < answer){
							System.out.println(input + "���� Ů�ϴ�");
							
						}else{
							System.out.println(input + "�����Դϴ� !");
							System.out.println("�õ�Ƚ���� " + count);
							break;
						}
			 		
			 		
			 }while(true); 
			------------------------------------------------------------------------------------------------------------------------------				 
				[4-15] ������ ȸ������ ���ϴ� ���α׷��̴�. ȸ����(palindrome)�� ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ���� ���Ѵ�.
				 		���� ��� '12321'�̳� '13531'���� ���� ���Ѵ�. (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
						[Hint] ������ �����ڸ� �̿��Ͻÿ�.
						[��������]/ch4/Exercise4_15.java 
						class Exercise4_15 { 
							public static void main(String[] args) { 
								int number = 12321; 
								int tmp = number; 
								
								int result =0; // ����number�� �Ųٷ� ��ȯ�ؼ� ���� ����
								number while(tmp !=0) { 
								* 
								* �˸��� �ڵ带 �־� �ϼ��Ͻÿ� 
								* 
								} 
								if(number == result)
									System.out.println( number + "�� ȸ���� �Դϴ�."); 
								else 
									System.out.println( number + "�� ȸ������ �ƴմϴ�."); 
								} // main 
							}
						[������] 12321�� ȸ���� �Դϴ�.	
						
	=>===============================================================================================================
				int number = 12321; 
				int tmp = number; 
				
				int result =0; // ����number�� �Ųٷ� ��ȯ�ؼ� ���� ����
				
				while(tmp !=0) { 
					result = result * 10 +tmp % 10;
					tmp /= 10;
				} 
				if(number == result)
					System.out.println( number + "�� ȸ���� �Դϴ�."); 
				else 
					System.out.println( number + "�� ȸ������ �ƴմϴ�."); 
		

		 */

	}

}