package e_oop;

import java.util.Scanner;

public class TV {
	/*
	 기능에 해당하는 번호를 입력해주세요 > 
	 1. 전원
	 2. 채널 + 
	 3. 채널 -
	 4. 음량 + 
	 5. 음량 -
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
			
			System.out.println("기능에 해당하는 번호를 입력해주세요 : ");
			System.out.println( " 1. 전원" );
			System.out.println( " 2. 채널+");
			System.out.println( " 3. 채널-");
			System.out.println( " 4. 음량+"); 
			System.out.println( " 5. 음량 -"); 
			System.out.println( " 0. 종료" );
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
		
		
		
		// 발표 : 프로그램 주제 , 기능 , 메서드 구성, 시연

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
