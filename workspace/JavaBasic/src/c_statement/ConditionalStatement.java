package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 	<<if문>>
		 	- if			 : 조건식의 결과가 true 이면 블럭안의 문장을 수행한다,.
		 	- else if 	 : 다수의 조건이 필요할 때 if뒤에 추가한다.
		 	- else		 : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 	
		 	
		 */

		int a = 10;
		
		if(a <100){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
				
		if(a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		
		int regNo = 3; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 1){
			gender = "남자";
		}else if( regNo == 2){ //if블럭 뒤에 else if 로 조건을 추가 할 수 있다.
			gender = "여자";
		}else if( regNo == 3){
			gender = "남자";
		}else if(regNo == 4){
			gender = "여자";
		}else{ //true인 조건식이 하나도  없을 때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은  = " + gender + " 입니다.");
		
		// -> 조건식 묶어주기
		
		if(regNo == 1 || regNo == 3)
			gender = "남자";
		else if( regNo == 2 || regNo == 4) //if블럭 뒤에 else if 로 조건을 추가 할 수 있다.
			gender = "여자";
		else //true인 조건식이 하나도  없을 때 수행된다.
			gender = "확인불가";
			// 조건식이 한 문장일 경우 {} 생략 가능
		System.out.println("당신의 성별은  = " + gender + " 입니다.");
	
		
		int score = 76;
		String grade = null;
		
		if(90 <= score ){
			grade = "A";
		}else if( 80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.println("당신의 등급은  : " + grade +  " 입니다.");
		
		
		score = 73;
		grade = null;
		
		if(90<=score){
			grade = "A";
			if(97 <= score){ //if문 중첩 사용 가능
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if( 80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if( 70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if( 60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 등급은  : " + grade +  " 입니다.");
		
		
		/*
		 	<<switch문>>
		 	- 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 	- 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다. 
		 */
		
		regNo = 2;
		gender = null;
		
		switch(regNo){
			case 1 : case 3 :
				gender = "남자";
				break;
			case 2 : case 4 :
				gender = "여자";
				break;
			default : //if의 else문과 같은 역할을 한다.
				gender = "확인불가";
		}
		System.out.println("당신의 성별은 : " + gender + " 입니다.");
		
		
		score = 100;
		grade = null;
		
		switch(score/10){
			case  9 : case 10 :
				grade = "A";
				break;
			case 8 : 
				grade = "B";
				break;
			case 7 : 
				grade = "C";
				break;
			case 6 : 
				grade = "D";
				break;
			default :
				grade = "F";
		}
		
		System.out.println("당신의 등급은  : " + grade +  " 입니다.");
		

		//숫자를 입력 받아 그 숫자가 0인지 0이 아닌지 출력 해 주세요.
		
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. > ");
		
		int num = Integer.parseInt(s.nextLine());
		String su = null;
		
		if (num == 0){
			su = "0입니다.";
		}else  {
			su = "0이 아닙니다.";
		}
		
		System.out.println( "입력받은 숫자  : " + num + " 은 " + su  );*/
		
	/*/*	Scanner s = new Scanner(System.in);
		System.out.println("번호 좀 알려주세요  > " );
		
		int num = Integer.parseInt(s.nextLine());
		String su = null;
		
		if (num ==64060773){
			su = "감사합니다";
		}else  {
			su = "없다는데요? 경찰서 가셔야겠네 ; ";
		}
		
		System.out.println(" 번호 " + num + " 주신거 " + su  );*/
		
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력 해 주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. > ");
		
		int num1 = Integer.parseInt(sc.nextLine());
		String su1 = null;
		
		if( num1%2 == 0 ){
			su1 = "짝수입니다.";
		}else {
			su1 = "홀수입니다.";
		}
		System.out.println("입력한 숫자 " + num1 + " 은 " + su1);
		
		
		
		
	}

}































