package z_exam;

public class EXAM_06 {
	public static void main(String[] args) {
		/*
		 [6-1] ������ ���� ��� ������ ���� SutdaCard Ŭ������ �����Ͻÿ�.
		 
		 		Ÿ��		������		����
		 		int		num			ī���� ����.(1~10������ ����)
		 		boolean isKwang		���̸� true, �ƴϸ� false
		 
		=>==============================================================
		class SutdaCard{
			int num;
			boolean isKwang;
		}
		----------------------------------------------------------------

		   [6-2] ���� 6-1���� ������ Ŭ������ �� ���� �����ڿ� info()�� �߰��ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
		   		
		   		class Exercise6_2 { 
		   			public static void main(String args[]) { 
		   				SutdaCard card1 = new SutdaCard(3, false); 
		   				SutdaCard card2 = new SutdaCard(); 
		   				
		   				System.out.println(card1.info()); 
		   				System.out.println(card2.info()); 
		   			} 
		   		} 
		   		class SutdaCard {
		   		 * 
		   		 	�˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		   		 * 
		   		 
		   		 [������] 
		   		 3 
		   		 1K
		   		
		=>==============================================================
		class SutdaCard{
		int num;
		boolean isKwang;
	
		
		SutdaCard(int 
		num, boolean isKwang ){
			this.num = num;
			this.isKwang = isKwang;
		}
		
		SutdaCard(){
			this(1,true);
		}
		
		String info()+{
			return num + (isKwang ? "K" : "");
			
		}
	
	}
		----------------------------------------------------------------
			[6-3] ������ ���� ��������� ���� StudentŬ������ �����Ͻÿ�.
				Ÿ��		������		����
				String	name		�л��̸�
				int		ban			��
				int		no			��ȣ
				int		kor			��������
				int		eng			��������
				int		math		��������
		=>==============================================================
		class Student{
	
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
	}
		----------------------------------------------------------------
			[6-4] ���� 6-3���� ������ StudentŬ������ ������ ���� ���ǵ� �� ���� �޼��� getTotal()�� getAverage()�� �߰��Ͻÿ�.
				   
				 1.�޼����  : getTotal 
				      �� �� : ����(kor), ����(eng), ����(math)�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
				      ��ȯŸ�� : int 
				      �Ű����� : ����
				 2.�޼���� : getAverage 
				     �� �� :  ���� (�������� + �������� + ��������)�� ������� ���� ����� ���Ѵ�. �Ҽ��� ��°�ڸ����� �ݿø��� ��. 
				     ��ȯŸ�� : float 
				     �Ű����� : ���� 
				     
				 class Exercise6_4 { 
				 	public static void main(String args[]) { 
				 		Student s = new Student(); 
				 		s.name = " ȫ�浿 "; 
				 		s.ban = 1; 
				 		s.no = 1; 
				 		s.kor = 100; 
				 		s.eng = 60; 
				 		s.math = 76;
						
						System.out.println("�̸� :"+s.name);  
						System.out.println("���� :"+s.getTotal()); 
						System.out.println("��� :"+s.getAverage());
					}
				  }	 
				  class Student { 
				  * 
				   	�˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
				  * 
				  }
				
				[ ������ ] 
				�̸� : ȫ�浿
				���� : 236 
				��� : 78.7
		=>==============================================================
		class Student{
	
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			
			
			
			int getTotal(){
				return kor+eng+math; 
			}
			
			float getAverage(){
				return (float)(int)((getTotal() / 3.0) * 10 + 0.5) / 10;
				
			}
				
		}
		----------------------------------------------------------------
			[6-5] ������ ���� �������� �򵵷� StudentŬ������ �����ڿ� info()�� �߰��Ͻÿ�.
				class Exercise6_5 { 
					public static void main(String args[]) { 
						Student s = new Student("ȫ�浿",1,1,100,60,76); 
						
						System.out.println(s.info()); 
					} 
				} 
				class Student {
				 	* 
				 		�˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
				 	* 
				 }
				[ ������ ] 
				ȫ�浿,1,1,100,60,76,236,78.7
 		=>==============================================================
 		class Student{
	
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			
			
			
			int getTotal(){
				return kor+eng+math; 
			}
			
			float getAverage(){
				return (float)(int)((getTotal() / 3.0) * 10 + 0.5) / 10;
				
			}
			
			Student(String name, int ban, int no, int kor, int eng, int math){
				this.name = name;
				this.ban = ban;
				this.no = no;
				this.kor = kor;
				this.eng = eng;
				this.math = math;
			}
			String info(){
				return name+","+ban+","+no+","+kor+","+eng+","+math+getTotal()+","+getAverage(); 
				
			}
		}
		----------------------------------------------------------------
			[6-6] �� ���� �Ÿ��� ����ϴ�  getDistance()�� �ϼ��Ͻÿ�.
				  [Hint] ������ ����� Math.sqrt(double a)�� ����ϸ� �ȴ�.
				  
				 class Exercise6_6 {
				  	//�� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�. 
				  	static double getDistance(int x, int y, int x1, int y1) {
				  	 	* 
				  	 	�˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
				  	 	* 
				  	 } 
				  	 public static void main(String args[]) { 
				  	 	System.out.println(getDistance(1,1,2,2)); 
				  	 } 
				  }
				[������] 1.4142135623730951  
 		=>==============================================================
 			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		----------------------------------------------------------------
			[6-7] ���� 6-6���� �ۼ��� Ŭ�����޼��� getDistance()�� MyPointŬ������ �ν��Ͻ��޼���� �����Ͻÿ�.
				class MyPoint { 
					int x; 
					int y; 
					
					MyPoint(int x, int y) { 
						this.x = x; 
						this.y = y; 
					} 
					* 
					 �ν��Ͻ��޼��� getDistance�� �ۼ��Ͻÿ�. 
					* 
				} 
				class Exercise6_7 {
				 	public static void main(String args[]) { 
				 		MyPoint p = new MyPoint(1,1);
						//p�� (2,2)�� �Ÿ��� ���Ѵ�.
						System.out.println(p.getDistance(2,2));
					}
				}
				
				[������] 1.4142135623730951
		=>==============================================================
		class MyPoint { 
					int x; // �ν��Ͻ�����
					int y; // �ν��Ͻ� ����
					
					MyPoint(int x, int y) { 
						this.x = x; 
						this.y = y; 
					} 
					double getDistance(int x1, int y1){
					return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
				} 
				class Exercise6_7 {
				 	public static void main(String args[]) { 
				 		MyPoint p = new MyPoint(1,1);
						//p�� (2,2)�� �Ÿ��� ���Ѵ�.
						System.out.println(p.getDistance(2,2));
					}
				}
		----------------------------------------------------------------
			[6-8] ������ �ڵ忡 ���ǵ� �������� �������� �����ؼ� �����ÿ�. 
				class PlayingCard { 
					int kind; //�ν��Ͻ�����
					int num; //�ν��Ͻ�����
					
					static int width; //Ŭ��������
					static int height; //Ŭ��������
					
					PlayingCard(int k, int n) { 
						kind = k;//�ν��Ͻ����� 
						num = n; //�ν��Ͻ�����
					} 
					
					public static void main(String args[]//�������� ) {  
						PlayingCard card//�������� = new PlayingCard(1,1); 
					} 
				}
		=>==============================================================
				- Ŭ��������(static����) : 
				- �ν��Ͻ�����  : 
				- ��������  :args, card
		----------------------------------------------------------------
			[6-9] ������ ��ǻ�� ������ ���� �� (marine)Ŭ������ ������ ���̴�. �� Ŭ������ ����߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ�? 
				    (��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.) 
				class Marine { 
					int x=0, y=0; //Marine�� ��ġ��ǥ
					int hp = 60; //���� ü��
					int weapon = 6; // ���ݷ�
					int armor = 0; //���� 
					
					void weaponUp() { 
						weapon++; 
					} 
					
					void armorUp() { 
						armor++; 
					} 
					void move(int x, int y) { 
						this.x = x; 
						this.y = y; 
					} 
				}
		=>==============================================================
		class Marine { 
					int x=0, y=0; //Marine�� ��ġ��ǥ
					int hp = 60; //���� ü��
					Static int weapon = 6; // ���ݷ�
					Static int armor = 0; //���� 
					
					Static void weaponUp() { 
						weapon++; 
					} 
					
					Static void armorUp() { 
						armor++; 
					} 
					void move(int x, int y) { 
						this.x = x; 
						this.y = y; 
					} 
				}
		----------------------------------------------------------------
			[6-10] ���� �� �����ڿ� ���� �������� ���� ���� ����? (��� ���ÿ�)
				a. ��� �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�.
				b. �����ڴ� ��ü�� �����ϱ� ���� ���̴�.
				c. Ŭ�������� �����ڰ� �ݵ�� �ϳ� �̻� �־�� �Ѵ� . 
				d. �����ڰ� ���� Ŭ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ� . 
				e. �����ڴ� �����ε� �� �� ���� .
		=>==============================================================
			e
		----------------------------------------------------------------
			[6-11] ���� �� this�� ���� �������� ���� ���� ����? (��� ���ÿ�)
				a. ��ü �ڽ��� ����Ű�� ���������̴� .
				b. Ŭ���� ��������� ��𼭵� ����� �� �ִ� . 
				c. ���������� �ν��Ͻ������� ������ �� ����Ѵ�. 
				d. Ŭ���� �޼��� �������� ����� �� ���� .
		=>==============================================================
			b(�ν��Ͻ� �޼ҵ� ������ ���)
		----------------------------------------------------------------
			[6-12] ���� �� �����ε��� �����ϱ� ���� ������ �ƴ� ����? (��� ���ÿ�) 
				a. �޼����� �̸��� ���ƾ� �Ѵ�. 
				b. �Ű������� ������ Ÿ���� �޶�� �Ѵ� . 
				c. ����Ÿ���� �޶�� �Ѵ� . 
				d. �Ű������� �̸��� �޶�� �Ѵ�.
		=>==============================================================
			a
		----------------------------------------------------------------
			[6-13] ���� �� �Ʒ��� add�޼��带 �ùٸ��� �����ε� �� ����? (��� ���ÿ�) 
					long add(int a, int b) { return a+b;}
					
				a. long add(int x, int y) { return x+y;} 
				b. long add(long a, long b) { return a+b;} 
				c. int add(byte a, byte b) { return a+b;} 
				d. int add(long a, int b) { return (int)(a+b);}
				d. �Ű������� �̸��� �޶�� �Ѵ�.
		=>==============================================================
			
		----------------------------------------------------------------
			[6-14] ���� �� �ʱ�ȭ�� ���� �������� ���� ���� ����? (��� ���ÿ�) 
				a. ��������� �ڵ� �ʱ�ȭ�ǹǷ� �ʱ�ȭ���� �ʰ� ���� ������ �� �ִ�.
				b. ���������� ����ϱ� ���� �ݵ�� �ʱ�ȭ�ؾ� �Ѵ� .
				c. �ʱ�ȭ ������ �����ڰ� ���� ����ȴ� .
				d. ����� �ʱ�ȭ�� ���� �켱������ ����ؾ� �Ѵ�.
				e. Ŭ������������ �ν��Ͻ������� ���� �ʱ�ȭ�ȴ�.
		=>==============================================================
			b,c,d
		----------------------------------------------------------------
			[6-15] ������ �ν��Ͻ������� �ʱ�ȭ ������ �ùٸ� ����? 
				a. �⺻�� -������ʱ�ȭ- �ʱ�ȭ�� -������
				b. �⺻��- ������ʱ�ȭ -������- �ʱ�ȭ��
				c. �⺻��- �ʱ�ȭ�� -������ʱ�ȭ -������ 
				d. �⺻��- �ʱ�ȭ��- ������- ������ʱ�ȭ
		=>==============================================================
			a
		----------------------------------------------------------------
			[6-16] ���� �� ���������� ���� �������� ���� ���� ����? (��� ���ÿ�) 
				a. �ڵ� �ʱ�ȭ�ǹǷ� ������ �ʱ�ȭ�� �ʿ����.
				b. ���������� ����� �޼��尡 ����Ǹ� ���������� �Բ� �Ҹ�ȴ�.
				c. �ż����� �Ű������� ����� ������ ���������̴�.
				d. Ŭ���������� �ν��Ͻ��������� �޸� �δ��� ����.
				e. ��(heap) ������ �����Ǹ� ������ �÷��Ϳ� ���� �Ҹ�ȴ�.
		=>==============================================================
			a,e
		----------------------------------------------------------------
			[6-17] ȣ�⽺���� ������ ���� ��Ȳ�� �� ���� ���� ������? (��� ���ÿ�)
						println 
						method1 
						method2 
						main
				a. ���� ���� ȣ�⽺�ÿ� ����� ���� main�޼����̴�. 
				b. �޼��带 ������ ������ �޼������ ��� ����� �����̴�.
				c. methid2�޼��带 ȣ���� ���� �޼����̴�. 
				d. println�޼��尡 ����Ǹ� method1�޼��尡 ������ �簳�Ѵ�.
				e. main-method2-method1-println�� ������ ȣ��Ǿ���.
				f. ���� �������� �޼���� prinln���̴�.
		=>==============================================================
			b
		----------------------------------------------------------------
			[6-18] ������ �ڵ带 �������ϸ� ������ �߻��Ѵ�. ������ ������ �߻��ϴ� ���ΰ� �� ������ �����Ͻÿ�.
				class MemberCall {
					int iv = 10;
					static int cv = 20;
					
					int iv2 = cv;
					static int cv2 = iv; // ���� A
					
					static void staticMethod1() {
						System.out.println(cv);
						System.out.println(iv); // ���� B
					}
					void instanceMethod1() {
						System.out.println(cv);
						System.out.println(iv); // ���� C
					}
					
					static void staticMethod2() {
						staticMethod1();
						instanceMethod1(); // ���� D
					}
					void instanceMethod2() {
						staticMethod1(); // ���� E
						instanceMethod1();
					}
				}
		=>==============================================================
			a,b,d ���� 
			a : �ν��Ͻ� ���� ��� �Ұ�
			b : �ν��Ͻ� ��� �Ұ�
			c : �ν��Ͻ� �޼��� ��� �Ұ� 
		----------------------------------------------------------------
			[6-19] ���� �ڵ��� ���� ����� �����Ͽ� �����ÿ�.
				class Exercise6_19
				{
					public static void change(String str) {
						str += "456";
					}
					public static void main(String[] args)
					{
						String str = "ABC123";
						System.out.println(str);
						change(str);
						System.out.println("After change:"+str);
					}
				}
		=>==============================================================
			ABC123
			After change:ABC123
		----------------------------------------------------------------
			[6-20] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
				   [����] Math.random()�� ����ϴ� ��� �������� �ٸ� �� ����.
					�޼���� : shuffle
					�� �� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
						    ó���� �迭�� ��ȯ�Ѵ�.
					��ȯŸ�� : int[]
					�Ű����� : int[] arr - �������� ��� �迭
					class Exercise6_20
					{
						*
							(1) shuffle�޼��带 �ۼ��Ͻÿ�.
						*
						public static void main(String[] args)
						{
							int[] original = {1,2,3,4,5,6,7,8,9};
							System.out.println(java.util.Arrays.toString(original));
							int[] result = shuffle(original);
							System.out.println(java.util.Arrays.toString(result));
						}
					}
					[������]
					[1, 2, 3, 4, 5, 6, 7, 8, 9]
					[4, 6, 8, 3, 2, 9, 7, 1, 5]
		=>==============================================================
			{
				public static int[] shuffle(int[] arr) {
					if(arr==null || arr.length==0)
					return arr;
					for(int i=0; i< arr.length;i++) {
						int j = (int)(Math.random()*arr.length);
						 
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				return arr;
			}

		----------------------------------------------------------------
			[6-21] TvŬ������ �־��� ������� �ϼ��Ͻÿ�. �ϼ��� �Ŀ� �����ؼ� �־��� �������� ��ġ�ϴ��� Ȯ���϶�.
				   [����] �ڵ带 �ܼ��� �ϱ� ���ؼ� ��ȿ���˻�� �������� �����ߴ�.
				class MyTv {
					boolean isPowerOn;
					int channel;
					int volume;
					
					final int MAX_VOLUME = 100;
					final int MIN_VOLUME = 0;
					final int MAX_CHANNEL = 100;
					final int MIN_CHANNEL = 1;
					
					void turnOnOff() {
						// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
					}
					void volumeUp() {
						// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
					}
					void volumeDown() {
						// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
					}
					void channelUp() {
						// (4) channel�� ���� 1������Ų��.
						// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
					}
					void channelDown() {
						// (5) channel�� ���� 1���ҽ�Ų��.
						// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
					}
				} // class MyTv
					class Exercise6_21 {
						public static void main(String args[]) {
							MyTv t = new MyTv();
							t.channel = 100;
							t.volume = 0;
							System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
							
							t.channelDown();
							t.volumeDown();
							System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
							
							t.volume = 100;
							t.channelUp();
							t.volumeUp();
							System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
						}
					}
					[������]
					CH:100, VOL:0
					CH:99, VOL:0
					CH:100, VOL:100
		=>==============================================================
			
		----------------------------------------------------------------
			[6-22] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
					�޼���� : isNumber
					�� �� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
						   ��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ�Ѵ�.
						   ���� �־��� ���ڿ��� null�̰ų� ���ڿ������̶�� false�� ��ȯ�Ѵ�.
					��ȯŸ�� : boolean
					�Ű����� : String str - �˻��� ���ڿ�
					[Hint] StringŬ������ charAt(int i)�޼��带 ����ϸ� ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�.
				class Exercise6_22 {
					*
						(1) isNumber�޼��带 �ۼ��Ͻÿ�.
					*
					public static void main(String[] args) {
						String str = "123";
						System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
						str = "1234o";
						System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
					}
				}
				[������]
				123�� �����Դϱ�? true
				1234o�� �����Դϱ�? false
		=>==============================================================
			public static boolean isNumber(String str) {
				if(str==null || str.equals(""))
				return false;
				for(int i=0; i< str.length();i++) {
					char ch = str.charAt(i);
					if(ch < '0' || ch > '9') {
						return false;
					}
				} 
				return true;
			}

		----------------------------------------------------------------
			[6-23] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
					�޼���� : max
					�� �� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ�.
						   ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ�Ѵ�.
					��ȯŸ�� : int
					�Ű����� : int[] arr - �ִ밪�� ���� �迭
				class Exercise6_23{
					*
						(1) max�޼��带 �ۼ��Ͻÿ�.
					*
					public static void main(String[] args)
					{
						int[] data = {3,2,9,4,7};
						System.out.println(java.util.Arrays.toString(data));
						System.out.println("�ִ밪:"+max(data));
						System.out.println("�ִ밪:"+max(null));
						System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭
					}
				}
				[������]
				[3, 2, 9, 4, 7]
				�ִ밪:9
				�ִ밪:-999999
				�ִ밪:-999999
		=>==============================================================
			public static int max(int[] arr) {
				if(arr==null || arr.length==0)
				return -999999;
				int max = arr[0];
				for(int i=1; i< arr.length;i++) { 
					if(arr[i] > max)
					max = arr[i];
				}
				return max;
			}

		----------------------------------------------------------------
			[6-24] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
					�޼���� : abs
					�� �� : �־��� ���� ���밪�� ��ȯ�Ѵ�.
					��ȯŸ�� : int
					�Ű����� : int value
				class Exercise6_24
				{
					*
					(1) abs�޼��带 �ۼ��Ͻÿ�.
					*
					public static void main(String[] args)
					{
						int value = 5;
						System.out.println(value+"�� ���밪:"+abs(value));
						value = -10;
						System.out.println(value+"�� ���밪:"+abs(value));
					}
				}
				
				[������]
				5�� ���밪:5
				-10�� ���밪:10
		
		=>==============================================================
			public static int abs(int value) {
				return value >=0 ? value : -value;
			}
		----------------------------------------------------------------
					
					
				
		 */
	
		
		
		
	
		
		
	}
}
