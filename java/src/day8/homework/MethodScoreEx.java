package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		//성적을 입력받아 학점을 출력하는 코드를 작성하세요. 단,메서드 이용
		int score;
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		score = sc.nextInt();
		a = sc.nextLine();

		String grade = credit(score);
		System.out.println(grade);
		
		sc.close();

	}
	/** 정수가 주어지면 영어로 달을 알려주는 메서드
	 * 매개변수 : 점수 => int score
	 * 리턴타입 : 학점 => String
	 * 메서드명 : credit
	 * */
	public static String credit(int score) {
		if(score >= 90 && score <= 100) {
			return "A";
		} else if(score >= 80 && score < 90) {
			return "B";
		} else if(score >= 70 && score < 80) {
			return "C";
		} else if(score >= 60 && score < 70) {
			return "D";
		} else if(score >= 0 && score < 60) {
			return "F";
		} else {
			return "wrong score";
		}
	}
}
