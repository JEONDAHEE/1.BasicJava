package z_exam;

import java.util.Scanner;

public class EXAM_05 {

	public static void main(String[] args) {
		
		      /*
		       [5-1] ������ �迭�� �����ϰų� �ʱ�ȭ�� ���̴�. �߸��� ���� ���� �� ������ �����Ͻÿ�.
		       
		       a. int[] arr[];
		       b. int[] arr = {1,2,3,};
		       c. int[] arr = new int[5];
		       d. int[] arr = new int[5]{1,2,3,4,5};//�ʱ�ȭ�Ҷ� ũ���� �������ְų� ������ ���� �־��ְų� �Ѱ����� �ؾ� �Ѵ�. �Ѵ��ؼ� ����.
		       e. int arr[5];//�������� ũ�⸦ ���� �� �� ����
		       f. int[] arr[] = new int[3][];
		       
		       =>==========================================================================================
		       d,e
		       
		       -------------------------------------------------------------------------------------------
		       [5-2] ������ ���� �迭�� ���� ��, arr[3].length�� ���� ���ΰ�?
		       
		             int[][] arr = {
		               { 5, 5, 5, 5, 5},
		               { 10, 10, 10},
		               { 20, 20, 20, 20},
		               { 30, 30}
		            };
		            
		      =>===========================================================================================
		      2
		      ---------------------------------------------------------------------------------------------
		      [5-3] �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
		            
		               class Exercise5_3
		               {
		                  public static void main(String[] args)
		                  {
		                     int[] arr = {10, 20, 30, 40, 50};
		                     int sum = 0;

		                     (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.

		                     System.out.println("sum="+sum);
		                  }
		               }
		               
		               [������]  sum=150
		      =>===========================================================================================
		      for(int i = 0; i < arr.length; i++){
		         sum += arr[i];
		      }
		      ---------------------------------------------------------------------------------------------
		      [5-4] 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
		            
		            class Exercise5_4
		            {
		               public static void main(String[] args)
		               {
		                  int[][] arr = {
		                     { 5, 5, 5, 5, 5},
		                     {10,10,10,10,10},
		                     {20,20,20,20,20},
		                     {30,30,30,30,30}
		                  };
		                  int total = 0;
		                  float average = 0;

		                  (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                  
		                  System.out.println("total="+total);
		                  System.out.println("average="+average);
		               } // end of main
		            } // end of class
		            [������]
		               total=325
		               average=16.25
		      =>===========================================================================================
		      for(int i = 0; i < arr.length; i++){
		            for(int j = 0; j <arr[i].length; j++ ){
		               total += arr[i][j];
		            }
		            average = total / (float)(arr.length * arr[0].length);//��� ���� ���̸� ������� �ϱ� ������.
		         }
		      ---------------------------------------------------------------------------------------------
		      [5-5] ������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴�. 
		           (1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
		           [����] Math.random()�� ����߱� ������ �������� �ٸ� �� �ִ�.      
		           
		           class Exercise5_5 {
		               public static void main(String[] args) {
		                  int[] ballArr = {1,2,3,4,5,6,7,8,9};
		                  int[] ball3 = new int[3];
		                  // �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		                  for(int i=0; i< ballArr.length;i++) {
		                     int j = (int)(Math.random() * ballArr.length);
		                     int tmp = 0;

		                     (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                   }
		                  // �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		                  * (2) *
		                  for(int i=0;i<ball3.length;i++) {   
		                     System.out.print(ball3[i]);
		                  }
		               } // end of main
		            } // end of class
		         [������]  486
		      =>===========================================================================================
		      (1) -> tmp = ballArr[i];
		         ballArr[i] = ballArr[j];
		         ballArr[j] = tmp;
		      (2) ->  for(int i = 0; i < ball3.length; i++){
		      			ball3[i] = ballArr[i];
		      		}
		      ---------------------------------------------------------------------------------------------      
		      [5-6] ������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. 
		           ���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ����϶�. 
		           ��, ������ �� ���� ���� �������� �Ž��� �־���Ѵ�. (1)�� �˸��� �ڵ带 �־���α׷��� �ϼ��Ͻÿ�.
		           [Hint] ������ �����ڿ� ������ �����ڸ� ����ؾ� �Ѵ�.         
		           
		           class Exercise5_6 {
		               public static void main(String args[]) {
		                  // ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		                  int[] coinUnit = {500, 100, 50, 10};
		                  int money = 2680;
		                  System.out.println("money="+money);
		                  for(int i=0;i<coinUnit.length;i++) {
		                     *
		                     (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                      * 
		                   }
		               } // main
		            }
		            [������]
		            money=2680
		            500��: 5
		            100��: 1
		            50��: 1
		            10��: 3
		      =>===========================================================================================
		      
          		System.out.println(coinUnit[i] + "��" + money/coinUnit[i]);
          		money = money%coinUnit[i];
		      ---------------------------------------------------------------------------------------------      
		      [5-7] ���� 5-6�� ������ ������ �߰��� ���α׷��̴�. Ŀ�ǵ�������κ��� �Ž��� �� �ݾ��� �Է¹޾� ����Ѵ�. 
		           ������ ������ ������ �Ž������� ������ �� ������, ���Ž������� �����մϴ�.����� ����ϰ� �����Ѵ�. 
		           ������ ���� ����� ������, �Ž������� ������ ��ŭ ���� ������ ���� ���� ������ ������ ȭ�鿡 ����Ѵ�.
		           (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.   
		           
		           class Exercise5_7
		           {
		               public static void main(String args[])
		               {
		                  if(args.length!=1) {
		                     System.out.println("USAGE: java Exercise5_7 3120");
		                     System.exit(0);
		                  }
		                  // ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		                  int money = Integer.parseInt(args[0]);
		                  System.out.println("money="+money);
		                  int[] coinUnit = {500, 100, 50, 10 }; // ������ ����
		                  int[] coin = {5, 5, 5, 5}; // ������ ������ ����
		                  for(int i=0;i<coinUnit.length;i++) {
		                  int coinNum = 0;
		                   * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
		                  1. �ݾ�(��)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
		                  2. �迭 coin���� coinNum��ŭ�� ������ ����.
		                     (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
		                  3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
		                   *
		                  System.out.println(coinUnit[i]+"��: "+coinNum);
		                  }   
		                  if(money > 0) {
		                     System.out.println("�Ž������� �����մϴ�.");
		                     System.exit(0); // ���α׷��� �����Ѵ�.
		                  }
		                  System.out.println("=���� ������ ���� =");
		                  for(int i=0;i<coinUnit.length;i++) {
		                     System.out.println(coinUnit[i]+"��:"+coin[i]);
		                  }
		               } // main
		            }
		            [������]
		            C:\jdk1.8\work\ch5>java Exercise5_7
		            USAGE: java Exercise5_7 3120
		            C:\jdk1.8\work\ch5>java Exercise5_7 3170
		            money=3170
		            500��: 5
		            100��: 5
		            50��: 3
		            10��: 2
		            =���� ������ ���� =
		            500��:0
		            100��:0
		            50��:2
		            10��:3
		            C:\jdk1.8\work\ch5>java Exercise5_7 3510
		            money=3510
		            500��: 5
		            100��: 5
		            50��: 5
		            10��: 5
		            �Ž������� �����մϴ�.
		      
		      =>===========================================================================================
		      	coinNum = money/coinUnit[i];
          
          		if(coin[i] >= coinNum){
        	  		coin[i] = coin[i]-coinNum;
          		}
          		else{
        	  		coinNum = coin[i];
        	  		coin[i] = 0;
          		}
          		money = money - coinNum * coinUnit[i];
		      ---------------------------------------------------------------------------------------------      
		      [5-8] ������ �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ ��*���� �� �׷����� �׸��� ���α׷��̴�. 
		           (1)~(2)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.      
		           
		           class Exercise5_8 {
		            public static void main(String[] args) {
		               int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		               int[] counter = new int[4];
		               for(int i=0; i < answer.length;i++) {
		                   * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. *
		                }
		               for(int i=0; i < counter.length;i++) {
		                   *
		                  (2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                   *
		                  System.out.println();
		               }
		            } // end of main
		         } // end of class
		         [������]
		         3***
		         2**
		         2**
		         4****   
		      =>===========================================================================================
		         int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		      int[] counter = new int[4];
		      for(int i = 0; i < answer.length; i++){
		         counter[answer[i]-1]++;
		      }
		      for(int i = 0; i < counter.length; i++){
		         System.out.print(counter[i]);
		         
		         for(int j = 0; j <counter[i]; j++){
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		      ---------------------------------------------------------------------------------------------
		      [5-9] �־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		           class Exercise5_9 {
		            public static void main(String[] args) {
		               char[][] star = {
		                  {'*','*',' ',' ',' '},
		                  {'*','*',' ',' ',' '},
		                  {'*','*','*','*','*'},
		                  {'*','*','*','*','*'}
		               };
		               char[][] result = new char[star[0].length][star.length];
		               for(int i=0; i < star.length;i++) {
		                  for(int j=0; j < star[i].length;j++) {
		                     System.out.print(star[i][j]);
		                  }
		                  System.out.println();
		               }
		               System.out.println();
		               for(int i=0; i < star.length;i++) {
		                  for(int j=0; j < star[i].length;j++) {
		                      *
		                     (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                      * 
		                   }
		               for(int i=0; i < result.length;i++) {
		                  for(int j=0; j < result[i].length;j++) {
		                     System.out.print(result[i][j]);
		                  }
		                  System.out.println();
		               }
		            } // end of main
		         } // end of class
		         
		         [������]
		          **
		          **
		          *****
		          *****
		          ****
		          ****
		          **
		          **
		          **      
		      =>===========================================================================================
		      char[][] star = { //[4][5]
		            {'*','*',' ',' ',' '},
		            {'*','*',' ',' ',' '},
		            {'*','*','*','*','*'},
		            {'*','*','*','*','*'}
		         };
		      
		      //star = {
		      //   {'*','*','*','*'},
		      //   {'*','*','*','*'},
		      //   {'*','*'},
		      //   {'*','*'},
		      //   {'*','*'}
		      //}
		      //90���� �������� [5][4]�迭�� ����� ��� �Ѵ�.
		      
		      char[][] result = new char[star[0].length][star.length]; //new char[5][4]
		            
		      for(int i = 0; i < star.length; i++) {
		         for(int j = 0; j < star[i].length; j++) {
		            System.out.print(star[i][j]);
		         }
		         System.out.println();
		      }//star�� ���� ��ġ�� ��� [4][5]

		      System.out.println();
		      
		      for(int i = 0; i < star.length; i++) {
		         for(int j = 0; j < star[i].length; j++) {
		            System.out.println();
		              int a = j; // ������ġ : (i,j), �ű���ġ : (a, b) ��� �Ҷ�, �ű���ġ a�� ������ġ j�� �Ȱ���
		              int b = (star.length-1)-i; 
		              // i�� b�� ���� �׻� 3 �̱� ������ i + b = star.length(= 4) - 1
		              // ��, i = (star.length-1)-i �� �ȴ�.  
		              
		              result[a][b] = star[i][j]; // (i, j)�� (a, b)�� �ٲ��ش�.
		          }
		      }
		      for(int i = 0; i < result.length; i++) {
		         for(int j = 0; j < result[i].length; j++) {
		            System.out.print(result[i][j]);//[5][4]�� ������ش�.
		         }
		         System.out.println();
		      }
		      ---------------------------------------------------------------------------------------------
		      [5-10] ������ ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
		            (1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
		            class Exercise5_10 {
		               public static void main(String[] args) {
		                  char[] abcCode =
		                  { '`','~','!','@','#','$','%','^','&','*',
		                    '(',')','-','_','+','=','|','[',']','{',
		                    '}',';',':',',','.','/'
		                   };
		                              // 0   1   2   3   4   5   6   7   8   9
		                  char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		                  
		                  String src = "abc123";
		                  String result = "";
		                  
		                  // ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		                  for(int i=0; i < src.length();i++) {
		                     char ch = src.charAt(i);
		                      *
		                     (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                      * 
		                   }
		                  System.out.println("src:"+src);
		                  System.out.println("result:"+result);
		               } // end of main
		            } // end of class
		            [������]
		            src:abc123
		            result:`~!wer
		      =>===========================================================================================
		      		if('a' <= ch && ch<='z'){
                	  	result += abcCode[ch-'a'];
                  	}else if('0' <= ch && ch<='9'){
                	  	result += numCode[ch-'0'];
                  	}
		      ---------------------------------------------------------------------------------------------
		      [5-11] �־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ� �迭�� ��� ���� ������ ��ҿ� 
		            �� ���� ���� ������ �����ϰ� ����ϴ� ���α׷��̴�. (1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
		            
		               class Exercise5_11
		            {
		               public static void main(String[] args)
		               {
		                  int[][] score = {
		                           {100, 100, 100}
		                          , {20, 20, 20}
		                          , {30, 30, 30}
		                          , {40, 40, 40}
		                          , {50, 50, 50}
		                  };
		                  int[][] result = new int[score.length+1][score[0].length+1];
		                  for(int i=0; i < score.length;i++) {
		                     for(int j=0; j < score[i].length;j++) {
		                          *
		                        (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                         * 
		                      }
		                  }
		                  for(int i=0; i < result.length;i++) {
		                     for(int j=0; j < result[i].length;j++) {
		                        System.out.printf("%4d",result[i][j]);
		                     }
		                     System.out.println();
		                  }
		               } // main
		            }
		         [������]
		         100 100 100 300
		         20 20 20 60
		         30 30 30 90
		         40 40 40 120
		         50 50 50 150
		         240 240 240 720      
		      =>===========================================================================================
		        result[i][j] = score[i][j];
              	result[i][result[i].length - 1] += result[i][j];
              	result[result.length - 1][j] += result[i][j];
           		}
          		result[result.length - 1][result[i].length - 1] += result[i][result[i].length - 1];
		      ---------------------------------------------------------------------------------------------
		      [5-12] ����5-23�� �����Ͽ�, �Ʒ��� ���� ����� �������� �Ͻÿ�.
		            
		            [������]
		            Q1. chair�� ����? dmlwk
		            Ʋ�Ƚ��ϴ�. ������ �����Դϴ�
		            Q2. computer�� ����? ��ǻ��
		            �����Դϴ�.
		            Q3. integer�� ����? ����
		            �����Դϴ�.
		            ��ü 3���� �� 2���� ���߼̽��ϴ�.
		               
		      =>===========================================================================================
		      	String[][] words = {
					{"chair", "����"},
					{"computer", "��ǻ��"},
					{"integer", "����"},
			 	};
		
				Scanner s = new Scanner(System.in);
		
				int count = 0;
				for(int i = 0; i < words.length; i++){
					System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
					String tmp = s.nextLine();
			
					if(tmp.equals(words[i][1])){
					System.out.printf("�����Դϴ�. %n%n");
					count++;
				}else{
					System.out.printf("Ʋ�ǽ��ϴ�. ������ %s �Դϴ�. %n%n", words[i][1]);
				}
			}
			System.out.println("��ü " + words.length + "���� ��" + count +" ���� ���߼̽��ϴ�.");
		      ---------------------------------------------------------------------------------------------
		      [5-13] �ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴�. 
		            �������� ���� �����ϵ��� ������ �� ���� ä��ÿ�.         
		            
		           import java.util.Scanner;
		           class Exercise5_13 {
		            public static void main(String args[]) {
		               String[] words = { "television", "computer", "mouse", "phone" };
		               Scanner scanner = new Scanner(System.in);
		               for(int i=0;i<words.length;i++) {
		                  char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
		                   *
		                  (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		                  char�迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�.
		                   *
		                  System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));
		                  String answer = scanner.nextLine();
		                  // trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
		                  if(words[i].equals(answer.trim()))
		                     System.out.printf("�¾ҽ��ϴ�.%n%n");
		                  else
		                     System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		               }
		            } // main�� ��
		         }
		         [������]
		         Q1. lvtsieeoin�� ������ �Է��ϼ���.>television
		         �¾ҽ��ϴ�.
		         Q2. otepcumr�� ������ �Է��ϼ���.>computer
		         �¾ҽ��ϴ�.
		         Q3. usemo�� ������ �Է��ϼ���.>asdf
		         Ʋ�Ƚ��ϴ�.
		         Q4. ohpne�� ������ �Է��ϼ���.>phone
		         �¾ҽ��ϴ�.
		   =>============================================================================================
		        for(int j = 0; j < words.length; j++){
        	   int idx = (int)(Math.random()*question.length);
               char tmp;
           
               tmp = question[j];
               question[j] = question[idx];
               question[idx] = tmp;
           }        
		               
		       */

		String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
           char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
           for(int j = 0; j < words.length; j++){
        	   int idx = (int)(Math.random()*question.length);
               char tmp;
           
               tmp = question[j];
               question[j] = question[idx];
               question[idx] = tmp;
           }
           System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));
           String answer = scanner.nextLine();
           // trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
           if(words[i].equals(answer.trim()))
              System.out.printf("�¾ҽ��ϴ�.%n%n");
           else
              System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
        }
       
       
       
       
       
       
       
       
	}

}
