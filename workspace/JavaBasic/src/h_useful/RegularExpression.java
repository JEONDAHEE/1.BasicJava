package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 //회원가입할때 주로 사용된다.
		 
		 ^		뒷문자로 시작
		 $		앞문자로 종료
		 .		임의의 문자(줄바꿈 제외)
		 *		앞문자가 0개 이상
		 +		앞문자가 1개 이상
		 ?		앞문자가 없거나 1개
		 []		문자의 집합이나 범위([a-z]:a부터 z까지 , [^a-z] :a부터 z가 아닌것)
		 {}		앞문자의 개수 ({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 ()		그룹화(한개의 문자처럼 인식)
		 |		OR 연산
		 \s		공백, 탭, 줄바꿈
		 \S		공백, 탭, 줄바꿈이 아닌 문자
		 \w		알파벳이나 숫자
		 \W		알파벳이나 숫자가 아닌 문자
		 \d		숫자
		 \D		숫자가 아닌 문자
		 (?i)	뒤문자의 대소문자 구분 안함
		 \		정규표현식에서 사용되는 특수문자 표현
		 */

		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+"; +는 한개 이상
//		String regex = "\\w*";//알파벳이나숫자가 0개이상인가?
		String regex = ".*";//줄바꿈이 아니라면 모든 문자가 통과
		
		
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규 표현식을 만들어 주세요.
		
		
		
		String id = "hp5192";
		String hp = "010-6406-0773";
		String mail = "hp5192@naver.com";
		
		
		
		String id_regex = "[a-z0-9]{5,20}";
		String hp_regex = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		String mail_regex = "[a-z0-9]{5,20}@[a-z]{1,7}\\.[a-z]{3}";
//		String mail_regex = "[a-z0-9_-]{5,20}@[a-zA-z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		
		Pattern p1 = Pattern.compile(id_regex);
		Matcher m1 = p1.matcher(id);
		System.out.println(m1.matches());
		
		Pattern p2 = Pattern.compile(hp_regex);
		Matcher m2 = p2.matcher(hp);
		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile(mail_regex);
		Matcher m3 = p3.matcher(mail);
		System.out.println(m1.matches());
		
	}

}











