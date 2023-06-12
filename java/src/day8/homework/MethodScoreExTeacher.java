package day8.homework;

import java.util.Scanner;

public class MethodScoreExTeacher {

	public static void main(String[] args) {
		//성적을 입력받아 학점을 출력하는 코드를 작성하세요. 단,메서드 이용
		double score = 80;
		System.out.println(getGrade(score));

	}
	/** 성적이 주어지면 학점을 알려주는 메서드
	 * 매개변수 : 성적 => 실수 => double score
	 * 리턴타입 : 학점 => 문자열 => String
	 * 메서드명 : gerGrade
	 * */
	//if문 가능한데 switch문으로 하는거 보여주기 위해 if랑 switch 섞음
	
	public static String getGrade(double score) {
		if(score > 100 || score < 0) {
			return "Wrong score!";
		}
		/* 100 점대 => A
		 * 90 점대 => B
		 * 80 점대 => C
		 * 70 점대 => D
		 * 60 점대 => F
		 * 그외 => F
		 * */
		//성적이 몇점대인지 확인하기 위함
		//10으로 나눴을 때 9가 나오면 90점대
		int res = (int)(score/10);
		switch(res) {
		case 10: // 10으로 나눴을때 10인건 100점 밖에 없음 
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}	
	}
}
