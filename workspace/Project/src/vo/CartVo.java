package vo;



public class CartVo {//pk

	// �����޴� : �����޴���ȣ, ������ȣ, �޴���ȣ, ����
	
	private int no;//������ȣ (pk)
	private int paymentNo;//������ȣ
	private int foodNo;//���Ĺ�ȣ
	private int count;//����
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public int getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
