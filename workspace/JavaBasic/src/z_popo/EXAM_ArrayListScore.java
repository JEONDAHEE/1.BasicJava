package z_popo;

import java.util.ArrayList;
import java.util.HashMap;

public class EXAM_ArrayListScore {

	public static void main(String[] args) {
		/*
		 우리반 모두의 java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤 생성하고,
		 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력하세요
		 
		 석차		이름		java	Oracle	HTML	CSS		JQuery	JSP		총점		평균
		 1		홍길동	80		90		100		90		70		60		500		80
		 2		홍길동	80		90		100		90		70		60		500		80
		 3		홍길동	80		90		100		90		70		60		500		80
		 4		홍길동	80		90		100		90		70		60		500		80
		 5		홍길동	80		90		100		90		70		60		500		80
		 
		 String[] students =  {"강현철", "김우경", "김종완", "김준우", "김철희", "김태유", "남아름", "박기완", "박선정", "박정민", "박혜진", 
							  "송효진","심주영", "연지은", "이제경", "이혁진", "임수진", "전다희", "정영수", "정주환", "홍종욱"};
		 */

		//과목 이름 만들기
		ArrayList<String> key = new ArrayList<String>();
		key.add("java");
		key.add("Oracle");
		key.add("HTML");
		key.add("CSS");
		key.add("JQuery");
		key.add("JSP");
		
		
		//이름배열 만들기
		ArrayList<String> name = new ArrayList<String>();
		name.add("강현철");
		name.add("김우경");
		name.add("김종완");
		name.add("김준우");
		name.add("김철희");
		name.add("김태유");
		name.add("남아름");
		name.add("박기완");
		name.add("박선정");
		name.add("박정민");
		name.add("박혜진");
		name.add("송효진");
		name.add("심주영");
		name.add("연지은");
		name.add("이제경");
		name.add("이혁진");
		name.add("임수진");
		name.add("전다희");
		name.add("정영수");
		name.add("정주환");
		name.add("홍종욱");
		
		//점수 구하기(이름빼고 다)
		ArrayList<ArrayList<Double>> score  = new ArrayList<>();
		
		for(int i = 0; i < name.size(); i++){
			ArrayList<Double> list = new ArrayList<>(); //한 행
			double sum = 0.0;
			list.add(1.0); // 석차 넣기(열)
			for(int j = 0; j < key.size(); j++){ //키사이즈 = 과목길이
				list.add((int)(Math.random() * 51) + 50.0);
				sum += list.get(j + 1);  // 총합  //sum에 한과목씩 점수 더하기 (0번째는 석차가 들어 있으니까 1번째부터)
			}
			list.add(sum); // 순차적으로 들어감 index가 없어서
			list.add((int)((sum/key.size()) * 10 + 0.5)/10.0);
			score.add(list);
		}
		
		//석차구하기
		for(int i = 0; i < score.size(); i++){
			double d = 1;
			for(int j = 0; j < score.size(); j++){
				if(score.get(i).get(score.get(i).size()-2) < score.get(j).get(score.get(i).size()-2)){
					d++;
				}
			}
			score.get(i).set(0,d);
		}
		
		//총점 정렬
		for(int i = 0; i < score.size() - 1; i++){
			ArrayList<Double> temp = new ArrayList<>(); // 임시저장
			for(int j = i + 1; j < score.size(); j++){
				if(score.get(i).get(score.get(i).size()-2) < score.get(j).get(score.get(i).size()-2) ){
					temp = score.get(i); 			// temp에 i를 넣고
					score.set(i,score.get(j)); 		// i자리에 j를 넣고
					score.set(j,temp); 			// j자리에 temp를 넣으면 자리바꿈 완성 !
					
					//이름정렬
					String n = name.get(i);
					name.set(i, name.get(j));
					name.set(j, n);
					
				}
			}
		}
		//석차,이름 따로 출력
		System.out.print("석차\t이름\t");
		//과목이름 출력
		for(int i = 0; i < key.size(); i++){
			System.out.print(key.get(i) + "\t");
		}
		System.out.println("종점" + "\t" + "평균"); //총점, 평균 따로 출력

		//출력
		for(int i = 0; i < name.size(); i++){
			System.out.print(score.get(i).get(0) + "\t"); //이름출력
			System.out.print(name.get(i) + "\t");
			for(int j = 1; j < score.get(i).size(); j++ ){
				System.out.print(score.get(i).get(j) + "\t" );
			}
			System.out.println();
		}


	}

}
