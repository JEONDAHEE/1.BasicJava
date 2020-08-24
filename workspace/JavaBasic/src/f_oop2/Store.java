package f_oop2;

public class Store {

	public static void main(String[] args) {// ���� �޼ҵ�
		
		//�迭 : ���� Ÿ���� �����͸� ��� ����ϴ� ��
		//����ü(struct) : �ٸ�Ÿ���� �����͸� ��� ����ϴ� ��.
		//Ŭ���� : �ٸ� Ÿ���� �����͸� ��� ����ϴ°� + ���� �޼��� //Ŭ������ �ϳ��� ������. 
		//����ü = Ŭ����  => ���� : https://phaphaya.tistory.com/53
		
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

class Prod{ //�θ�Ŭ����
	String name;
	int price;
	
	Prod(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("------------------------------");
		System.out.println(" ��ǰ�� : " + name);
		System.out.println(" ��   �� : " + price + "��");
		System.out.println("------------------------------");
	}
}

class Desktop extends Prod{//�ڽ� Ŭ����
	Desktop(){
		super(" �Ｚ��ǻ��", 500000);//�θ�Ŭ������ ������ ȣ��
		
	}
}

class TV extends Prod{//�ڽ�Ŭ����
	TV(){
		super(" LG TV", 1000000);
	}
}

class Customer{//�׳� �մ� Ŭ����
	int money = 2000000000;
	Prod[] item = new Prod[10]; //��ٱ���
	
	void buy(Prod p){//������ ���� �޼��� //Ŭ������ Ÿ���� �ȴ�. //�θ�Ŭ������ Ÿ�� ����� �ֱ�.
		if(money < p.price){
			System.out.println(" ���� �����մϴ�.");//���� �����ϸ�
			return;//�޼��� ���� �� ����
		}
		
		money -= p.price; //������ ���ݸ�ŭ �ӴϿ��� ����
		
		for(int i = 0; i < item.length; i++){ // 0�ε������� ���̱��� ������ ����ִ� �ε����� �����ҰŴ�.
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "�� �����ϼ̽��ϴ�.");
	}
	
	void showItem(){//���� ����� �����ִ� �޼ҵ�
		System.out.println("-----------------��ٱ���-----------------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				System.out.println( (i + 1) + "." + item[i].name);
			}
			
		}
		System.out.println("---------------------------------------");
	}	
}






















