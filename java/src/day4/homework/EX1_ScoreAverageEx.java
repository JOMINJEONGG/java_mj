package day4.homework;

import java.util.Scanner;

public class EX1_ScoreAverageEx {

	public static void main(String[] args) {
		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요
		 * 성적은 정수.
		 * */
		//(국어 + 영어 + 수학) / 3
		
		int Korean, English, Math;
		Scanner sc = new Scanner(System.in);
		System.out.println("input grades : ");
		Korean = sc.nextInt();
		English = sc.nextInt();
		Math = sc.nextInt();

		int total = Korean + English + Math;
		double average = total / 3; //(double)했었어야했는데 안하면 값 안나옴 10 20 31 입력하면 결과값 뒤에 실수 안나온다 틀림!!
		System.out.println(average);
		average = sc.nextDouble();
		sc.close();
	}
}
