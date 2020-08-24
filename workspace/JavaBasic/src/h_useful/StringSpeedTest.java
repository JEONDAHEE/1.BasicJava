package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
		
//		String str = "a";
//		
//		long start = System.currentTimeMillis(); // 문장이 수행될때 걸리는 시간을 재는 함수
//		for(int i = 0; i < 200000; i++){
//			str +="a";
//		}
//		long end = System.currentTimeMillis(); // 문장이 수행될때 걸리는 시간을 재는 함수
//		System.out.println(end-start + "ms");
//	
		
		//StringBuffer를 사용하면 시간이 단축된다.
		StringBuffer sb = new StringBuffer("a");
		
		long start = System.currentTimeMillis(); // 문장이 수행될때 걸리는 시간을 재는 함수
		for(int i = 0; i < 200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis(); // 문장이 수행될때 걸리는 시간을 재는 함수
		System.out.println(end-start + "ms");
	}
}
