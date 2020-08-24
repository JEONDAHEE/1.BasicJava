package f_oop2;

//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들간에 객체를 공유하기 위해 사용한다.
//메모리를 낭비하지 않기 위해서 사용. => why? 객체가 한번만 만들어지니까ㅡㅡ

//Singleton은 이름일뿐 키워드가 아니야

public final class Singleton { // 상속받지 못하게 할라고 final을 붙여준다.
	
	private static Singleton instance;//변수
	
	private Singleton(){//생성자
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();//객체 생성
		}
		return instance;
	}
}
