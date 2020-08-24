package f_oop2;

public class Store {

	public static void main(String[] args) {// 메인 메소드
		
		//배열 : 같은 타입의 데이터를 묶어서 사용하는 것
		//구조체(struct) : 다른타입의 데이터를 묶어서 사용하는 것.
		//클래스 : 다른 타입의 데이터를 묶어서 사용하는것 + 관련 메서드 //클래스도 하나의 데이터. 
		//구조체 = 클래스  => 설명 : https://phaphaya.tistory.com/53
		
		Customer c = new Customer();
		
		Prod p = new Desktop();
		p.info();
		c.buy(p);
		
		p = new TV();
		p.info();
		c.buy(p);
		
		c.showItem();
	}
}

class Prod{ //부모클래스
	String name;
	int price;
	
	Prod(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("------------------------------");
		System.out.println(" 상품명 : " + name);
		System.out.println(" 가   격 : " + price + "원");
		System.out.println("------------------------------");
	}
}

class Desktop extends Prod{//자식 클래스
	Desktop(){
		super(" 삼성컴퓨터", 500000);//부모클래스의 생성자 호출
		
	}
}

class TV extends Prod{//자식클래스
	TV(){
		super(" LG TV", 1000000);
	}
}

class Customer{//그냥 손님 클래스
	int money = 2000000000;
	Prod[] item = new Prod[10]; //장바구니
	
	void buy(Prod p){//구매할 물건 메서드 //클래스가 타입이 된다. //부모클래스로 타입 만들어 주기.
		if(money < p.price){
			System.out.println(" 돈이 부족합니다.");//돈이 부족하면
			return;//메서드 종료 후 끝남
		}
		
		money -= p.price; //물건의 가격만큼 머니에서 차감
		
		for(int i = 0; i < item.length; i++){ // 0인덱스부터 길이까지 봤을때 비어있는 인덱스에 저장할거다.
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매하셨습니다.");
	}
	
	void showItem(){//구매 목록을 보여주는 메소드
		System.out.println("-----------------장바구니-----------------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				System.out.println( (i + 1) + "." + item[i].name);
			}
			
		}
		System.out.println("---------------------------------------");
	}	
}






















