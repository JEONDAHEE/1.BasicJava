package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	   public static void main(String[] args){
		   //클래스들을 객체생성
		   Marine marine  = new Marine();
		   Tank tank = new Tank();
		   Dropship dropship = new Dropship();
		   SCV scv = new SCV();
		   
//		   scv.repair(marine); //상속받지 못한 마린..넌 기계가 아니자나..
		   scv.repair(tank);
		   scv.repair(dropship);
		   scv.repair(scv);
	   }
	}

class Unit{
	int hp; //현재 체력
	final int MAX_HP; //최대 체력
	   
	Unit(int hp){
	   MAX_HP = hp;
	   this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	Marine(){
		super(40);
	}
}
	
class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}
	
class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}
	
class SCV extends Unit implements Repairable{
	SCV(){//기계로된 유닛만 수리
		super(60);
	}
	
	void repair(Repairable r){//수리하는 메서드 : 파라미터로 받은 유닛을 수리
		if(r instanceof Unit){// instanceof : Unit으로 형변환이 가능한지 확인
			Unit u = (Unit) r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{}//수리 가능한 클래스를 지정해주려고 생성






























