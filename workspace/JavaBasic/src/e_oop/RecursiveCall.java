package e_oop;

public class RecursiveCall {
	
	/*
	 << 재귀호출 >>
	 - 메서드 내에서 메서드 자신을 호출하는 것이다.
	 - 재귀호출을 하는 메서드를 재귀메서드 라고 한다.
	 - 무한반복을 벗어나기 위한 조건이 있어야 한다.
	 */
	
	
	public static void main(String[] args) {
		//팩토리얼 : 4! == 4 * 3 * 2 * 1 == 24
		
		int result = factorial(4);
		System.out.println(result);
	}
	/*
	 CallStack
	 	 
	 |factorial(1)| 1
	 |factorial(2)| 2 * factorial(1)
	 |factorial(3)| 3 * factorial(2)
	 |factorial(4)| 4 * factorial(3)
	 |main()______|
	 
	 =>
	 	 
	 |____________| 1
	 |factorial(2)| 2 * 1
	 |factorial(3)| 3 * factorial(2)
	 |factorial(4)| 4 * factorial(3)
	 |main()______|
	 
	 =>
	 	 
	 |____________| 1
	 |____________| 2 * 1
	 |factorial(3)| 3 * 2 * 1
	 |factorial(4)| 4 * factorial(3)
	 |main()______|
	 
	 =>
	 
	 |____________| 1
	 |____________| 2 * 1
	 |____________| 3 * 2 * 1
	 |factorial(4)| 4 * 3 * 2 * 1
	 |main()______|
	 
	 
	 */
	private static int factorial(int i) {
		int result = 0;
		
		if(i == 1){
			result = 1;
		}else{
			result = i * factorial(i - 1);
		}
		return result;
	}
}
