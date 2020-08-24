package e_oop;

public class AirConditioner {

	boolean power; // ����
	int temperature; // �µ�
	int airVolume; // ǳ��
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	void power(){
		
		power = !power;//power�� true�� ���¶�� false�� �ٲ� ����, false�� ���¶�� true�� ����
	}
	
	void temperatureUp(){//�µ� 1�� �ø���
		if(power){
			if(temperature < 30){
				temperature++;
			}
		}	
	}
	
	void temperatureDown(){//�µ� 1�� ������
		if(power && 18 < temperature){
			temperature--;
		}
	}
	
	void airVolume(){// 1 -> 2 -> 3 -> 1 -> 2 -> 3 -> 1 ->....
		if( power && 3 < ++airVolume ){
			airVolume = 1;
		}
	}
	
	//�µ��� 18~30������ ���� �� �� �ְ� ������ �������� ��ư���� �۵��ǵ��� �޼������ ���� �� �ּ���.
	
	//������ main�޼ҵ忡�� �Ѵ�.
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
