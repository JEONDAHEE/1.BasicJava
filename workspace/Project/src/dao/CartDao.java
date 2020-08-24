package dao;

import java.util.ArrayList;

import vo.CartVo;
import data.Database;

public class CartDao {
	private static CartDao instance;

	private CartDao() {
		
	}

	public static CartDao getInstance() {
		if (instance == null) {
			instance = new CartDao();
		}
		return instance;

	}

	Database database = Database.getInstance();


	public void insertCart(CartVo cart) {
		if(!database.tb_cart.isEmpty()){
			for(int i = 0; i < database.tb_cart.size();i++ ){
				if(database.tb_cart.get(i).getFoodNo()==cart.getFoodNo()&&database.tb_cart.get(i).getPaymentNo()==0){
					database.tb_cart.get(i).setCount(cart.getCount()+database.tb_cart.get(i).getCount());
					return;
				}
			}
			cart.setNo(database.tb_cart.get(database.tb_cart.size()-1).getNo()+1);
		} else{
			cart.setNo(0);
		}
		database.tb_cart.add(cart);
	}
	public void deleteCart(CartVo cart) {
		database.tb_cart.remove(cart);
	}
	public ArrayList<CartVo> selectCartList() { // ������ �Ǳ����� cartVo�� ����Ʈ�� ���
		ArrayList<CartVo> cartList = new ArrayList<>();	
		for(int i = 0 ; i < database.tb_cart.size();i++){
			if(database.tb_cart.get(i).getPaymentNo()==0){
				cartList.add(database.tb_cart.get(i));
			}
		}
		return cartList;
	}
	
	public CartVo searchCartNoInfo(int no) {//cartVo�� �⺻Ű�� �Ű������� �Է��ϸ� �ش� �⺻Ű�� ���� cartVo�� ����
		
		for(int i = 0 ; i < database.tb_cart.size();i++){
			if(database.tb_cart.get(i).getNo()==no){
				return database.tb_cart.get(i);
			}
		}
		return null;
	}
	public ArrayList<CartVo> selectPaymentCartList() { //��ٱ��Ͽ� ������ �� cartVo�� ����Ʈ�� ���
		ArrayList<CartVo> cartList = new ArrayList<>();	
		for(int i = 0 ; i < database.tb_cart.size();i++){
			if(database.tb_cart.get(i).getPaymentNo()!=0){
				cartList.add(database.tb_cart.get(i));
			}
		}
		return cartList;
	}
	public ArrayList<CartVo> selectPaymentNoCartList(int paymentNo) {// �Ű������� �Էµ� ������ȣ�� ���� ������ȣ�� �����ִ� cartVo�� ����Ʈ�� ���
		ArrayList<CartVo> cartList = new ArrayList<>();	
		for(int i = 0 ; i < database.tb_cart.size();i++){
			if(database.tb_cart.get(i).getPaymentNo()==paymentNo){
				cartList.add(database.tb_cart.get(i));
			}
		}
		return cartList;
	}
}
