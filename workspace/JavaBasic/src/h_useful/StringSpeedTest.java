package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
		
//		String str = "a";
//		
//		long start = System.currentTimeMillis(); // ������ ����ɶ� �ɸ��� �ð��� ��� �Լ�
//		for(int i = 0; i < 200000; i++){
//			str +="a";
//		}
//		long end = System.currentTimeMillis(); // ������ ����ɶ� �ɸ��� �ð��� ��� �Լ�
//		System.out.println(end-start + "ms");
//	
		
		//StringBuffer�� ����ϸ� �ð��� ����ȴ�.
		StringBuffer sb = new StringBuffer("a");
		
		long start = System.currentTimeMillis(); // ������ ����ɶ� �ɸ��� �ð��� ��� �Լ�
		for(int i = 0; i < 200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis(); // ������ ����ɶ� �ɸ��� �ð��� ��� �Լ�
		System.out.println(end-start + "ms");
	}
}
