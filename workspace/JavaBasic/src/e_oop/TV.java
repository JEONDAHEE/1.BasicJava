package e_oop;

import java.util.Scanner;

public class TV {
	/*
	 ��ɿ� �ش��ϴ� ��ȣ�� �Է����ּ��� > 
	 1. ����
	 2. ä�� + 
	 3. ä�� -
	 4. ���� + 
	 5. ���� -
	 */
	
	boolean power;
	int channel;
	int volume;
	
	
	
	TV(){
		power = false;
		channel = 1;
		volume = 1;
	}
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		if(power){
			channel++;
		}
	}
	
	void channelDown(){
		if(power){
			channel--;
		}
	}
	
	void volumeUp(){
		if(power){
			volume++;
		}
	}
	
	void volumeDown(){
		if(power){
			volume--;
		}
	}
	
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		
		Scanner sc = new Scanner(System.in);
	
				
		while(true){
			
			System.out.println("��ɿ� �ش��ϴ� ��ȣ�� �Է����ּ��� : ");
			System.out.println( " 1. ����" );
			System.out.println( " 2. ä��+");
			System.out.println( " 3. ä��-");
			System.out.println( " 4. ����+"); 
			System.out.println( " 5. ���� -"); 
			System.out.println( " 0. ����" );
			int input = Integer.parseInt(sc.nextLine());
			
			if(input == 1){
				tv.power();
				System.out.println("power : " + tv.power);
			}else if(input == 2){
				tv.channelUp();
				System.out.println("channel : " + tv.channel );
			}else if(input == 3){
				tv.channelDown();
				System.out.println("channel : " + tv.channel );
			}else if(input == 4){
				tv.volumeUp();
				System.out.println("Volume : " + tv.volume );
			}else if(input == 5){
				tv.volumeDown();
				System.out.println("Volume : " + tv.volume );
			}else if(input == 0){
				break;
			}
			
		}
		
		
		
		// ��ǥ : ���α׷� ���� , ��� , �޼��� ����, �ÿ�

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
