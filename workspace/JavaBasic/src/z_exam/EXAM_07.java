package z_exam;

public class EXAM_07 {

	public static void main(String[] args) {
		// 7-3~7-13, 7-15, 7-16, 7-17, 7-20, 7-24
		
		/*
		 [7-3] �������̵��� ���ǿ� �ʿ伺�� ���ؼ� �����Ͻÿ�.
		 
		 =>==============================================================
			 ��ӹ��� �޼����� ������ �������ϴ°�.
			 ��ӹ��� �޼����� �޼����, ��ȯŸ��, �Ķ���Ͱ� ���ƾ��Ѵ�.
			 ��ӹ��� �޼��庸�� ���� ������ ���������ڷ� ������ �� ����.
			 ��ӹ��� �޼��庸�� ���� ���ܸ� ������ �� ����.
			 static�� ���ų� ���� �� ����.
		 ----------------------------------------------------------------
		 [7-4] ���� �� �������̵��� �������� ���� ���� ����? (��� ���ÿ�)
				a. ������ �޼���� �̸��� ���ƾ� �Ѵ�.
				b. �Ű������� ���� Ÿ���� ��� ���ƾ� �Ѵ�.
				c. ���� �����ڴ� ������ �޼��庸�� ���� �����θ� ������ �� �ִ�.
				d. ������ �޼��庸�� �� ���� ���� ���ܸ� ������ �� �ִ�.
		  =>==============================================================
		  c,d
		  ----------------------------------------------------------------
		  [7-5] ������ �ڵ�� �������ϸ� ������ �߻��Ѵ�. �� ������ �����ϰ� ������ �����ϱ� ���ؼ��� �ڵ带 ��� �ٲپ�� �ϴ°�?
		 	class Product
			{
				int price; // ��ǰ�� ����
				int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
				Product(int price) {
					this.price = price;
					bonusPoint =(int)(price/10.0);
				}
			}
			class Tv extends Product {
				Tv() {}
				public String toString() {
					return "Tv";
				}
			}
			class Exercise7_5 {
				public static void main(String[] args) {
					Tv t = new Tv();
				}
			}
		  =>==============================================================
			  class Product
				{
					int price; // ��ǰ�� ����
					int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
					
					Product(){}
					
					Product(int price) {
						this.price = price;
						bonusPoint =(int)(price/10.0);
					}
				}
				class Tv extends Product {
					 Tv() { //�����Ϸ��� �ڵ����� ȣ���� �� �ִ°� �Ķ���Ͱ� ���� �������̴�.
					 } 
					
					public String toString() {
						return "Tv";
					}
				}
				class Exercise7_5 {
					public static void main(String[] args) {
						Tv t = new Tv();
					}
				}
		  ----------------------------------------------------------------
		  [7-6] �ڼ� Ŭ������ �����ڿ��� ���� Ŭ������ �����ڸ� ȣ���ؾ��ϴ� ������ �����ΰ�?
		  =>==============================================================
		  	�θ� ���ǵ� �����ڸ� �ʱ�ȭ �ϱ� ���ؼ� 
		  ----------------------------------------------------------------
		  [7-7] ���� �ڵ��� �������� �� ȣ��Ǵ� �������� ������ �������� �����ÿ�.
		  	class Parent {
				int x=100;
				Parent() {
					this(200);
				}
				Parent(int x) {
					this.x = x;
				}
				int getX() {
					return x;
				}
			}
			class Child extends Parent {
				int x = 3000;
				Child() {
					this(1000);
				}
				Child(int x) {
					this.x = x;
				}
			}
			class Exercise7_7 {
				public static void main(String[] args) {
					Child c = new Child();
					System.out.println("x="+c.getX());
				}
			}
		  =>==============================================================
		  class Parent {
		  
				int x=100;
				
				Parent() {													=> 3
					this(200);
				}
				Parent(int x) {												=> 4
					this.x = x;
				}
				int getX() {
					return x;
				}
			}
			class Child extends Parent {
			
				int x = 3000;
			
				Child() {													=> 1
					this(1000);
				}
				Child(int x) {												=> 2
					this.x = x;
				}
			}
			class Exercise7_7 {
				public static void main(String[] args) {
					Child c = new Child();
					System.out.println("x="+c.getX());
				}
			}
		  
		  ������ : x= 200
		  ----------------------------------------------------------------
		  [7-8] ���� �� ���������ڸ� ���ٹ����� ���� �Ϳ��� ���� ���� ������ �ٸ��� �����Ѱ���?
				a. public-protected-(default)-private
				b. public-(default)-protected-private
				c. (default)-public-protected-private
				d. private-protected-(default)-public
		  =>==============================================================
		  	a
		  ----------------------------------------------------------------
		  [7-9] ���� �� ������ final�� ���� �� �ִ� ���� �ٿ��� �� �� �ǹ̸� ���� ���̴�. ���� ���� ����? (��� ���ÿ�)
				a. �������� - ���� ������ �� ����.
				b. Ŭ���� - ����� ���� Ŭ������ ���ο� ����� �߰��� �� ����.
				c. �޼��� - �����ε��� �� �� ����.
				d. ������� - ���� ������ �� ����.
		  =>==============================================================
		  	c
		  ----------------------------------------------------------------
		  [7-10] MyTv2Ŭ������ ������� isPowerOn, channel, volume�� Ŭ���� �ܺο��� ������ �� ������ �����ڸ� ���̰� 
		  		��� �� ����������� ���� ��𼭳� �а� ������ �� �ֵ��� getter�� setter�޼��带 �߰��϶�.
		 	class MyTv2 {
				boolean isPowerOn;
				int channel;
				int volume;
			
				final int MAX_VOLUME = 100;
				final int MIN_VOLUME = 0;
				final int MAX_CHANNEL = 100;
				final int MIN_CHANNEL = 1;
				*
				(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				*
			}
			class Exercise7_10 {
				public static void main(String args[]) {
					MyTv2 t = new MyTv2();
					
					t.setChannel(10);
					System.out.println("CH:"+t.getChannel());
					t.setVolume(20);
					System.out.println("VOL:"+t.getVolume());
				}
			}
		 [������]
			CH:10
			VOL:20
		  =>==============================================================
			  	class MyTv2 {
				private boolean isPowerOn;
				private int channel;
				private int volume;
			
				final int MAX_VOLUME = 100;
				final int MIN_VOLUME = 0;
				final int MAX_CHANNEL = 100;
				final int MIN_CHANNEL = 1;
				
				public int getChannel(){
					return channel;
				}
				public void setChannel(int channel){
					if(channel <= MAX_CHANNEL && channel >= MIN_CHANNEL){
						this.channel = channel;
					}
					
					
				}
				public int getVolume(){
					return volume;
				}
				public void setVolume(int volume){
					if(volume <= MAX_VOLUME && volume >= MIN_VOLUME){
						this.volume = volume; 	
					}
				}
			
			}
		  ----------------------------------------------------------------
		  [7-11] ����7-10���� �ۼ��� MyTv2Ŭ������ ���� ä��(previous channel)�� �̵��ϴ� ����� �޼��带 �߰��ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
				[Hint] ���� ä���� ���� ������ ��������� �����϶�.
					�޼���� : gotoPrevChannel
					�� �� : ���� ä���� ���� ä�η� �����Ѵ�.
					��ȯŸ�� : ����
					�Ű����� : ����
					
			 class MyTv2 {
				*
				(1) ����7-10�� MyTv2Ŭ������ gotoPrevChannel�޼��带 �߰��Ͽ� �ϼ��Ͻÿ�.
				*
			}
			class Exercise7_11 {
				public static void main(String args[]) {
					MyTv2 t = new MyTv2();
					t.setChannel(10);
					System.out.println("CH:"+t.getChannel());
					t.setChannel(20);
					System.out.println("CH:"+t.getChannel());
					t.gotoPrevChannel();
					System.out.println("CH:"+t.getChannel());
					t.gotoPrevChannel();
					System.out.println("CH:"+t.getChannel());
				}
			}
			[������]
			CH:10
			CH:20
			CH:10
			CH:20
		  =>==============================================================
		  class MyTv2 {
			private boolean isPowerOn;
			private int channel;
			private int volume;
			int temp;
		
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1;
			
			public int getChannel(){
				return channel;
			}
			public void setChannel(int channel){
				if(channel <= MAX_CHANNEL && channel >= MIN_CHANNEL){
					temp = this.channel; 
					this.channel = channel;
				}
				
				
			}
			public int getVolume(){
				return volume;
			}
			public void setVolume(int volume){
				if(volume <= MAX_VOLUME && volume >= MIN_VOLUME){
					this.volume = volume; 	
				}
			}
			
			public void gotoPrevChannel(){
				setChannel(temp);
			}
		
		}
		  ----------------------------------------------------------------
		  [7-12] ���� �� ���� �����ڿ� ���� �������� ���� ���� ����? (��� ���ÿ�)
				a. public�� ���������� ���� ���� ���� �������̴�.
				b. (default)�� ������, ���� ��Ű�� �������� ������ �����ϴ�.
				c. ������������ ���� �����ڸ� ����� �� �ִ�.
				d. protected�� ������, ���� ��Ű�� �������� ������ �����ϴ�.
				e. protected�� ������, �ٸ� ��Ű���� �ڼ� Ŭ�������� ������ �����ϴ�.
		   =>==============================================================
		   	c
		   ----------------------------------------------------------------
		   [7-13] MathŬ������ �����ڴ� ���� �����ڰ� private�̴�. �� ������ �����ΰ�?
		   =>==============================================================
		   	������ ȣ���� ���ϰ� �ϱ� ���ؼ� -> ��ü������ ���ϰ� �ҷ���
		   ----------------------------------------------------------------
		   [7-15] Ŭ������ ������ ���� ���ǵǾ� ���� ��, ����ȯ�� �ùٸ��� ���� ���� ����? (��� ���ÿ�.)
		  		class Unit {}
				class AirUnit extends Unit {}
				class GroundUnit extends Unit {}
				class Tank extends GroundUnit {}
				class AirCraft extends AirUnit {}
				
				Unit u = new GroundUnit();
				Tank t = new Tank();
				AirCraft ac = new AirCraft();
		  		
			  		a. u = (Unit)ac;
					b. u = ac;
					c. GroundUnit gu = (GroundUnit)u;
					d. AirUnit au = ac;
					e. t = (Tank)u;
					f. GroundUnit gu = t;
		  
		   =>==============================================================
		   	e
		   ----------------------------------------------------------------
		   [7-16] ���� �� �������� true�� �ƴ� ����? (��� ���ÿ�)
		   		class Car{}
		   		class FireEngine extends Car implements Movable {}
				class Ambulance extends Car {}
				
				FireEngine fe = new FireEngine();
		  
		  			a. fe instanceof FireEngine
					b. fe instanceof Movable
					c. fe instanceof Object
					d. fe instanceof Car
					e. fe instanceof Ambulance
		   =>==============================================================
		   e-> ��ӹް� ���� �ʱ� ������
		   ----------------------------------------------------------------
		   [7-17] �Ʒ� �� ���� Ŭ�����κ��� ����κ��� �̾Ƽ� Unit�̶�� Ŭ������ �����, �� Ŭ������ ��ӹ޵��� �ڵ带 �����Ͻÿ�.
		  		class Marine { // ����
					int x, y; // ���� ��ġ
					void move(int x, int y) { * ������ ��ġ�� �̵� * }
					void stop() { * ���� ��ġ�� ���� * }
					void stimPack() { * �������� ����Ѵ�.*}
				}
				class Tank { // ��ũ
					int x, y; // ���� ��ġ
					void move(int x, int y) { * ������ ��ġ�� �̵� * }
					void stop() { * ���� ��ġ�� ���� * }
					void changeMode() { * ���ݸ�带 ��ȯ�Ѵ�. *}
				}
				class Dropship { // ���ۼ�
					int x, y; // ���� ��ġ
					void move(int x, int y) { * ������ ��ġ�� �̵� * }
					void stop() { * ���� ��ġ�� ���� * }
					void load() { * ���õ� ����� �¿��.* }
					void unload() { * ���õ� ����� ������.* }
				}
		   =>==============================================================
		   class Unit{
				int x, y;
				void move(int x, int y) {}
				void stop() {}
			}
			
			class Marine extends Unit{ // ����
				
				void stop() {}
				void stimPack() { }
			}
			class Tank extends Unit{ // ��ũ
			
				void changeMode() { }
			}
			class Dropship extends Unit{ // ���ۼ�
				
				void load() {}
				void unload() {}
			}
		   ----------------------------------------------------------------
		   [7-20] ������ �ڵ带 ������ ����� �����ÿ�.
		  		class Exercise7_20 {
					public static void main(String[] args) {
						Parent p = new Child();
						Child c = new Child();
						
						System.out.println("p.x = " + p.x);
						p.method();
						
						System.out.println("c.x = " + c.x);
						c.method();
					}
				}
				class Parent {
					int x = 100;
					void method() {
						System.out.println("Parent Method");
					}
				}
				class Child extends Parent {
					int x = 200;
					void method() {
						System.out.println("Child Method");
					}
				}
		   =>==============================================================
		    p.x = 100
			Child Method
			c.x = 200
			Child Method
		 */

		
	
	}

}
