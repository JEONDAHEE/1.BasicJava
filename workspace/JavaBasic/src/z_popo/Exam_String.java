package z_popo;

public class Exam_String {

	public static void main(String[] args) {
/*
		// 1.
		//Stirng(String s)
		//주어진 문자열(s)을 갖는 String인스턴스를 생성한다.
		String s = new String("Hello");
		// 결과 : s = "Hello"
*/
/*		
		// 2.
		//String(char[] value)
		//주어진 문자열(value)을 갖는 String인스턴스를 생성한다.
		char[] c = {'H','e','l','l','o'};
		String s = new String(c);
		// 결과 : s = "Hello"
		
*/
/*		
		// 3.
		//String(StringBuffer buf)
		//StringBuffer의 인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
		StringBuffer sb = new StringBuffer("Hello");
		String s = new String(sb);
		// 결과 :  s = "Hello" 

*/
/*		
		// 4.
		//char charAt(int index)
		//지정된 위치(index)에 있는 문자를 알려준다.(index는 0부터 시작)
		String s = "Hello";
		String n = "0123456";
		char c = s.charAt(1);
		char c2 = n.charAt(1);
		// 결과 : c = 'e'
		//		c2 = '1'
*/
/*		
		// 5.
		//int compareTo(String str)
		//문자열(str)과 사전 순서로 비교한다. 같으면, 0을 , 사전순으로이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		// 결과 : i = 0
		//		i2 = -1
		//		i3 = 1
		
*/	
/*		
		// 6.
		//String concat(String str)
		//문자열(str)을 뒤에 덧붙인다.
		String s = "Hello";
		String s2 = s.concat(" world");
		// 결과 : s2 = "Hello world"
		
*/		
/*		
		// 7.
		//boolean contains(SharSequence s)
		//지정된 문자열(s)이 포함되었는지 검사한다.
		String s = "abcdefg";
		boolean b = s.contains("b");
		// 결과 : s2 = true
		
*/		
/*		
		// 8.
		//boolean endsWith(String suffix)
		//지정된 문자열(suffix)로 끝나는지 검사한다
		String file = "Hello.txt";
		boolean b = file.endsWith("txt");
		// 결과 : b = true
*/	
/*		// 9.
		//boolean equals(Object obj)
		//매개변수로 받은 문자열(obj)와 String인스턴스의 문자열을 비교한다. obj가 String이아니거나 문자열이 다르면 false를 반환한다.
		String s = "Hello";
		boolean b = s.equals("HELLO");
		boolean b2 = s.equals("hello");
		// 결과 : b = true
		//	    b2 = false
*/		
/*
		// 10.
		//boolean equalsIgnoreCase(String str)
		//문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
		String s = "Hello";
		boolean b = s.equalsIgnoreCase("HELLO");
		boolean b2 = s.equalsIgnoreCase("heLLo");
		// 결과 : b = true
		//		b2 = true
*/
/*		
		// 11.
		//int indexOf(int ch)
		//주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다..(index는 0부터 시작)
		String s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		// 결과 : idx1 = 4
		//		idx2 = -1
*/
/*		
		// 12. 
		//int indexOf(int ch, int pos)
		//주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.(index는 0부터 시작)
		String s = "Hello";
		int idx1 = s.indexOf('e', 0);
		int idx2 = s.indexOf('e', 2);
		// 결과 : idx1 = 1
		//		idx2 = -1
		
*/
/*		
		// 13.
		//int indexOf(String str)
		//주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다.(index는 0부터 시작)
		String s = "ABCDEFG";
		int idx = s.indexOf("CD");
		// 결과 : idx = 2
		
*/	
/*		
		// 14.
		//String intern()
		//문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을경우 그 문자열의 주소값을 반환한다.
		String s = new String("abc");
		String s2 = new String("abc");
		boolean b = (s == s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern() == s2.intern());
		// 결과 : b = false
		//		b2 = true
		//		b3 = true
*/
		
		// 15. 
		//int lastIndexOf(int ch)
		//지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다.못 찾으면-1을 반환한다.
	}

}
