package e_oop;

public class AirConditioner {

	boolean power; // 전원
	int temperature; // 온도
	int airVolume; // 풍량
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	void power(){
		
		power = !power;//power가 true인 상태라면 false로 바뀌어서 저장, false인 상태라면 true로 저장
	}
	
	void temperatureUp(){//온도 1씩 올리기
		if(power){
			if(temperature < 30){
				temperature++;
			}
		}	
	}
	
	void temperatureDown(){//온도 1씩 내리기
		if(power && 18 < temperature){
			temperature--;
		}
	}
	
	void airVolume(){// 1 -> 2 -> 3 -> 1 -> 2 -> 3 -> 1 ->....
		if( power && 3 < ++airVolume ){
			airVolume = 1;
		}
	}
	
	//온도가 18~30까지만 변경 할 수 있고 전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경 해 주세요.
	
	//실행은 main메소드에서 한다.
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		
		ac.power();
		System.out.println("power : " + ac.power);
		
		ac.temperatureUp();
		System.out.println("temperature : " + ac.temperature);
		
		ac.temperatureDown();
		System.out.println("temperature : " + ac.temperature);
		
		ac.airVolume();
		System.out.println("airVolume : " + ac.airVolume);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
