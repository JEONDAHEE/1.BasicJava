package z_popo;

import java.util.Scanner;

public class NewSystem {
	
	
	


	public static void main(String[] args) throws InterruptedException {
		
	NewSystem sys = new NewSystem();
	
	sys.name();

	sys.name2();
	
	sys.start();
	
    
	System.out.println();
	System.out.println("������ �ϼ��Ǿ����ϴ�. ����� �ɷ�ġ�� �Ʒ��� �����ϴ�.");
	
	sys.stats1();
	
	int i=0;
	while(true){
		
		i++;
		System.out.println(i+"��° ���� �������ϴ�. "+sys.name+ "�� �Ϸ簡 ���ۉ���ϴ�.");
		
		sys.loading();
		
		
		sys.choice();
		sys.loading2();
		sys.loading();
		
		sys.eat();
		sys.loading2();
		System.out.println("����� ���¸� Ȯ���Ϸ��� ���͸� ��������.");	
		sys.loading2();
		
        if(i%2 == 0 ){
        	sys.event();
        }
        sys.loading2();
        
		
		sys.stats1();
		sys.loading();
		
		sys.loading2();
		sys.finger();
		sys.loading2();
		
		
		
		
		
		
		
		if(sys.money > 50000){
            System.out.println("�����մϴ�. "+ sys.name+"���� �������� ������ ������ϴ�. ������ �λ��� ���� �����Դϴ�. ");
}
		
		if(sys.fatigue > 10){
			System.out.println("����� ����߽��ϴ�. �ﰡ ������ ���� ���ϴ�.");
			break;
		}
		if(sys.money < 0){
			System.out.println("���� �����ϴ�. ����� ���� ���￪���� �ٲ�� �ε����ϰ� ������ ����˴ϴ�.");
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Scanner s = new Scanner(System.in);
	String name;
	String loading;
	String name2;
	int fatigue;
	int stats;
	int money;
		NewSystem(){
			fatigue = 1;
			stats = 1;
			money = ((int)(Math.random()*10)+1) * 1000;
		}
	
	void name2(){
		System.out.println("����� �������� �̸��� �����ּ���.");
		name2 = s.nextLine();
	}
	
	void name(){
		System.out.println("�̸��� �Է��ϼ���.");
		name = s.nextLine();
		
	}
	void loading(){
		
		System.out.println("�����Ϸ��� ����Ű�� ��������.");
		loading = s.nextLine();
	}
void loading2(){
		
		
		loading = s.nextLine();
	}
	
	void start() throws InterruptedException{
		System.out.println("����� ���̹��� �̸��� "+ name2 + "�Դϴ�. �Ƹ��� ����� �ձ��� ������ �ΰ��Դϴ�.");
		Thread.sleep(1000);
		System.out.println("ȯ���մϴ�." + name + "��. ����� ���ú��� ����η°��߿� �л��Դϴ�." );
		Thread.sleep(1000);
		System.out.println("������ ���ؼ� ��Ƴ��� ���� 5���� ���弼��. ");
		Thread.sleep(1000);
		System.out.println("�Ƿε��� ���� ������ �ϸ� ���� ���� Ȯ���� �������ϴ�. ");
		Thread.sleep(1000);
		System.out.println("������ �Ƿε��� 10�̻� �Ǹ� ����� ���λ�� ����մϴ�");
		Thread.sleep(1000);
		System.out.println("�·�  ����");
		
		loading();
		System.out.println("Loading ���Դϴ�.");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("Loading ���Դϴ�..");
		System.out.println("���� ��: ������ ���ÿ� �ּ��� ���Ѵ�.");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("Loading ���Դϴ�...");
		System.out.println("���� ���� ��, �ڵ����� ���� �������� �����˴ϴ�. ��. �λ��� ��Դϴ�.");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("Loading ���Դϴ�....");
		System.out.println("��� �ε��� ��׷ο���. ���� �ؾ���");
		
		
	}
	void start1(){
		
	}
	
	
	void changemoney(int money){
		this.money = money;
	}
		
	void changestats(int stats){
			this.stats = stats;
		}
		
	void changefatigue(int fatigue){
		this.fatigue = fatigue;
	}
		
		
	void moneydown(){
		changemoney(money - 1000);
	}
    void stats1(){
    	
    	System.out.println("����� ���߷�: "+ stats + " �Դϴ�." );
    	System.out.println("����� �Ƿΰ�: "+ fatigue +" �Դϴ�.");
    	System.out.println("����� ��: "+ money +" �Դϴ�.");
    	
    }
    
    void java(){
    	changefatigue(fatigue + 2);
    	changemoney(money + 1000 * stats);
    	
    }
    void oracle(){
    	changefatigue(fatigue + 2);
    	changemoney(money + 1000);
    }
    void study(){
    	changefatigue(fatigue + 2);
    	changemoney(money + 1000 * stats);
    	
    }
    void gohome(){
    	changefatigue(fatigue -1);
    	changestats(stats-1);
    }
    void taja(){
    	changestats(stats - (int)(Math.random()*2));
    	changemoney(money + 1000);
    }
    
    void choice(){
    	    
    	    System.out.println("���� ������ �Ͻðڽ��ϱ�?");
    	    System.out.println("1�� �ڹٸ� ������ �Ѵ�.(�Ƿΰ�+1)(��� ���� �޽��ϴ�)");
    	    System.out.println("2�� ����Ŭ�� ������ �Ѵ�.(�Ƿΰ�+1)(�� + 1000)");
    	    System.out.println("3�� ���Ƽ� ���θ� �Ѵ�.(�Ƿΰ�+3)(�� 1000 * ���߷� )");
    	    System.out.println("4�� ������ ���ָ� �Ѵ�.(�Ƿΰ�-2)(���߷� -1)");
    	    System.out.println("5�� Ÿ�ڿ����� �����Ѵ�.(�Ƿΰ� 0 or 1)(�� 500)");
    	    
    		int cho = s.nextInt();
    		switch(cho){
    		case 1 : java(); break;
    		case 2 : oracle(); break;
    		case 3 : study(); break;
    		case 4 : gohome(); break;
    		case 5 : taja(); break;
    		
    		
    	}
    }
    
    
    
 void dosirak(){
	 changemoney(money - 3500);
	 System.out.println("��. ���� ���ö��� ��������.");
        
    }

    void Starve(){
    	System.out.println("��... �������..");
    }

    void myeongnyun(){
    	changemoney(money - 10000);
    	changefatigue(fatigue - 1);
    	changestats(stats+3);
    	System.out.println("�������� ��ܿ�~ ������簥��");
    }
    
    void eat(){
        System.out.println("������ �Ļ�ð� �Դϴ�. ������ ��ðڽ��ϱ�");
        System.out.println("1. ���ö� : 3500�� ");
        System.out.println("2. ����   : 0��(�Ƿΰ� +5) (���߷�-1) " );
        System.out.println("3. ������簥�� : 10000��(���߷� +3)(�Ƿΰ� -1)");

                       int cho1 = s.nextInt();
        		switch(cho1){
        		case 1 : if(money < 3500){
        			System.out.println("�ٽ� �����ϼ���^^ ����� ���� �����ϴ�.");
        			eat();
        		}else{
        				dosirak();
        			}break;
        		case 2 : Starve(); break;
        		case 3 : if(money < 10000){
        			System.out.println("�ٽ� �����ϼ���^^ ����� ���� �����ϴ�.");
        			eat();
        		}else{
        				myeongnyun();
        			}break;
        		
        }
}
    
    
    
    void game() throws InterruptedException{
    	String a;
    	System.out.println("����!!!!!!");
		
		System.out.println("����!!!!!!");
		Thread.sleep(1000);
		System.out.println("��!!!!!!");
		Thread.sleep(1000);
		System.out.println("����/����/�� �� �ϳ��� �����ϼ���!!");
		a = s.nextLine();
		int you = (int)(Math.random()*3)+1; // ���� 1 ���� 2 �� 3
		if(you == 1 && a.equals("����")){
			System.out.println("���� : ���� || �����ϴ�!!");
			game();
			}
		else if(you == 1 && a.equals("����")){
			System.out.println("���� : ���� || �̰���ϴ�!! ���!!!!");
			changemoney(money + 2000);
		}
		else if(you == 1 && a.equals("��")){
			System.out.println("���� : ��  || ����� �����ϴ� �̤�.. ū�ϳ���!");
			changemoney(money - 2000);
		}
		
		
		
		else if(you == 2 && a.equals("����")){
			System.out.println("����  : ���� || ����� �����ϴ� �̤�.. ū�ϳ���!");
			changemoney(money - 2000);
		}
		else if(you == 2 && a.equals("����")){
			System.out.println("����  : ���� || �����ϴ�!!");
			game();
		}		else if(you == 1 && a.equals("��")){
			System.out.println("���� : ��  || �̰���ϴ�!! ���!!!!");
			changemoney(money + 2000);
		}
		
		
		else if(you == 3 && a.equals("����")){
			System.out.println("��  : ���� || �̰���ϴ�!! ���!!!!");
			changemoney(money + 2000);
		}
		else if(you == 3 && a.equals("����")){
			System.out.println("��  : ���� || ����� �����ϴ� �̤�.. ū�ϳ���! ");
			changemoney(money - 2000);
		}		else if(you == 3 && a.equals("��")){
			System.out.println("��  : ��  ||�����ϴ�!! �ٽ� !!!");
			game();
		}
		
		
    }
    void event() throws InterruptedException{
    	String a;
    	
    	
    	
    	System.out.println(name2 + "���� 2000�� �� ���⸦ ��û�ϼ̽��ϴ�. �����Ͻðڽ��ϱ�? ��/�ƴϿ�");
    	a = s.nextLine();
    	if(a.equals("��")){
    		System.out.println(name2 + "�� �λ��� ���� ������������ �Ͻðڽ��ϴ�. �����ϰ� �����ϼ���. �Ѽ����� ������ ����� �λ��� �����մϴ�. ");
    		Thread.sleep(1000);
    	    game();
    	
    			
    		}else{
    			System.out.println("��.. ���̺�..");
    		}
    		
    		
    		
    		
    	}
    
    void finger() throws InterruptedException{
    	System.out.print("���� �Է���");
    	Thread.sleep(1000);
    	System.out.print(".");
    	Thread.sleep(1000);
    	System.out.print(".");
    	Thread.sleep(1000);
    	System.out.print(".");
    	Thread.sleep(1000);
    	
    	System.out.println();
    	System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�!! ���� �Ϸ絵 �����ϼ̽��ϴ�. ��Ż�� �������Ͻð�, ���� ���� �����ϼ���!!");
    	
    }
    	
    	
    }
