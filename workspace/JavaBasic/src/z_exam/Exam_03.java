package z_exam;

public class Exam_03 {

	public static void main(String[] args) {
/*		
 
 		  		int x = 2;
 		  		int y = 5;  
               char c = 'A'; // 'A'�� �����ڵ�� 65 
              
              System.out.println(1 + x << 33);                      //6
              System.out.println(y >= 5 || x < 0 && x > 2);             //true
              System.out.println(y += 10 - x++);                      //13
              System.out.println(x+=2);                            //5
              System.out.println( !('A' <= c && c <='Z') );             //false
              System.out.println('C'-c);                            //2
              System.out.println('5'-'0');                         //5
              System.out.println(c+1);                            //66
              System.out.println(++c);                            //B
              System.out.println(c++);                            //B
              System.out.println(c);                            //C
		
		
		[3-2] �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ��� (����) �� ���� ���ϴ� �ڵ��̴�. 
			   ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ� �ʿ��� ���̴�.
			   (1)�� �˸��� �ڵ带 �����ÿ� . 
			   
			   int numOfApples = 123; //����� ����
			   int sizeOfBucket = 10;//�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
			   int numOfBucket =( (1) ) ;//��� ����� ��µ� �ʿ��� �ٱ��� ��	
			   
			   System.out.println("�ʿ��� �ٱ����� �� : " +numOfBucket);
			 
			   ->  int numOfApples = 123; //����� ����
		   		    int sizeOfBucket = 10;//�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		   			int numOfBucket =( (numOfApples % sizeOfBucket) == 0 ? numOfApples/sizeOfBucket  : numOfApples/sizeOfBucket +1   ) ;//��� ����� ��µ� �ʿ��� �ٱ��� ��	
		   
		  			System.out.println("�ʿ��� �ٱ����� �� : " +numOfBucket);
			   
		[3-3] �Ʒ��� ���� �� ���� ���� num '���', '����', '0' �� ����ϴ� �ڵ��̴�.
		 	  ���� �����ڸ� �̿��ؼ� (1)�� �˸��� �ڵ带 �����ÿ�.
		 	  	   **���׿����ڸ� �ι� ����ض�.
		 	 	   **������ :  ���
		 	 	   
		 	 	   
		 	 	   class Exercise3_3 { 
		 	 	   public static void main(String[] args) {
		 	 	    int num = 10; 
		 	 	    System.out.println(  (1)  );
		 	 	    }
	}

		 	 	 ->   int num = 10;
					   System.out.println( (num > 0) ? "���" : (num <0) ? "����" : "0" );
					   
					   
		[3-4] �Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�. ���� ���� num�� ���� '456'�̶�� '400'�� �ǰ�
		 	   '111'�̶�� ��100���� �ȴ�. (1)�� �˸��� �ڵ带 �����ÿ�. 
		 	   *** ������ 400
		 	   
		 	  class Exercise3_4 { 
		 	  public static void main(String[] args) { 
		 	  int num = 456; 
		 	  System.out.println(  (1)  ); 
		 	  } 
	}
			
				->  int num = 456; 
					System.out.println( (num/100) * 100  );
		
		
		[3-5] �Ʒ��� ���� num�� �� �߿��� ���� �ڸ��� 1�� �ٲٴ� �ڵ��̴�. ���� ���� num�� ���� 333�̶�� 331�� �ǰ�, 
		 	  777�̶�� 771�� �ȴ�. (1)�� �˸��� �ڵ带 �����ÿ�.
		 	  ***������ 331
		 	  
		 	  public class Exam_03 {
			  public static void main(String[] args) {
			  			int num = 333;
			  			System.out.println( (1) );
			  	}
			  }
		 	
		  		-> int num = 555;
					System.out.println( (num/10)*10 +1 );
				
		
		[3-6] �Ʒ��� ���� num�� ������ ũ�鼭�� ���� ����� 10�ǹ������ num�� ���� �� �������� ���ϴ� �ڵ��̴�.
			  ���� ���, 24�� ũ�鼭�� ���� ����� ����� 30�̴�. 19�� ��� 20�̰�, 81�� ��� 90�� �ȴ�. 
			  30���� 24�� �� �������� 6�̱� ������ ���� num�� ���� 24��� 6�� ����� ���� �Ѵ�. (1)�� �˸��� �ڵ带 ��������.
			  *** ������ �����ڸ� ����϶�
			  *** ������ 6
			   
			  public class Exam_03 {
			  	public static void main(String[] args) {
			  			int num = 24;
			  			System.out.println( (1) );
			  	}
			  }
			  	
			  
			  	-> int num = 24;
		  			System.out.println( num - (num%10) + 10  - num );
			  
			  
		[3-7] �Ʒ��� ȭ�� (Fahrenheit) �� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�. ��ȯ ������ 'C = 5/9 X (F - 32)'��� �� ��,
			  (1)�� �˸��� �ڵ带 �����ÿ�. ��, ��ȯ ��� ���� �Ҽ��� ��° �ڸ����� �ݿø��ؾ��Ѵ�.(Math.round()�� ��������ʰ� ó���� ��)
			  ***������
			   				Fahrenheit:100 
			   				Celcius:37.78
			   				
			   				
			   public class Exam_03 {
			  	public static void main(String[] args) {
			  			int fahrenheit = 100; 
			  			float celcius = ( (1) );
			  			
			  			System.out.println("Fahrenheit:"+fahrenheit); 
			  			System.out.println("Celcius:"+celcius);
			  	}
			  }
			  
			  
			  ->  int fahrenheit = 100; 
  		float celcius = (int)(((5 / 9f) * (fahrenheit-32) * 100) + 0.5) / 100.0f;
  		
  		
  		
  			System.out.println("Fahrenheit:"+fahrenheit); 
  			System.out.println("Celcius:"+celcius);
			  
		
		  [3-8] �Ʒ� �ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
		  		***������
		  						c=30 
		  						ch=C 
		  						f=1.5 
		  						l=27000000000 
		  						result=true
		  						
		  			class Exercise3_8 { 
		  				public static void main(String[] args) { 
		  					byte a = 10; 
		  					byte b = 20;
		  					byte c = a + b; 
		  					
		  					char ch = 'A';
		  					ch = ch + 2; 
		  					
		  					float f = 3 / 2; 
		  					long l = 3000 * 3000 * 3000; 
		  					
		  					float f2 = 0.1f; 
		  					double d = 0.1; 
		  					
		  					boolean result = d==f2; 
		  					
		  					System.out.println("c="+c); 
		  					System.out.println("ch="+ch); 
		  					System.out.println("f="+f); 
		  					System.out.println("l="+l); 
		  					System.out.println("result="+result); 
		  				} 
		  			}
		  			
		  			
		  			->  byte a = 10; 
						byte b = 20;
						int c = a + b; 
			
						char ch = 'A';
						ch = (char)(ch + 2); 
			
						float f = 3f / 2; 
			
						long l = 3000L * 3000 * 3000; 
			
						float f2 = 0.1f; 
						double d = (float)0.1; 
			
						boolean result = d==f2; 
			
						System.out.println("c="+c); 
						System.out.println("ch="+ch); 
			System.out.println("f="+f); 
			System.out.println("l="+l); 
			System.out.println("result="+result); 
			

		   	[3-9] ������ ������ ���� ch�� ������ (�빮�� �Ǵ� �ҹ���) �̰ų� ������ ���� ����  b �� ���� true�� �ǵ��� �ϴ� �ڵ��̴�.
		   	 	(1)�� �˸��� �ڵ带 �����ÿ�.
		   	 	***���� ��� true
		   	 	
		   	 	class Exercise3_9 { 
		   	 		public static void main(String[] args) { 
		   	 			char ch = 'z'; 
		   	 			boolean b = (  (1)  ); 
		   	 			
		   	 			System.out.println(b); 
		   	 			} 
		   	 		}
			
			
					->  char ch = 'z'; 
   	 			boolean b = ('a' <= ch && ch<='z') || ('A' < ch && ch <= 'Z') || '0' <= ch && ch <= '9'; 
   	 			
   	 			System.out.println(b); 
					
			[3-10] ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�, ���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�.
			 		�����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��. ������� 'A'�� �ڵ�� 65�̰� 'a'�� �ڵ�� 97�̴�. (1)~(2)�˸��� �ڵ带 �����ÿ�.
			 		***������  ch:A 
			 						ch to lowerCase:a
			 						
			 		class Exercise3_10 { 
			 				public static void main(String[] args) { 
			 					char ch = 'A';
			 					
			 					char lowerCase = (  (1)  ) ? (  (2) ) : ch; 
			 					
			 					System.out.println("ch:"+ch); 
			 					System.out.println("ch to lowerCase:"+lowerCase); 
			 				} 
			 			}


			  			-> char ch = 'A';
 					
 					char lowerCase = 'A' <= ch || ch <= 'Z'  ? (char)(ch+32) : ch; 
 					
 					System.out.println("ch : "+ch); 
 					System.out.println("ch to lowerCase : "+lowerCase); 

*/
		
		   
	}

}





















