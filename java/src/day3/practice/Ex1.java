package day3.practice;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/* 성적을 입력받아 입력받은 성적이 60점이상인지 확인하는 코드를 작성하세요
		 * 예 :
		 * input score :
		 * 65
		 * Do you pass65 points? true
		 * 
		 * input score : 
		 * 45
		 * Do you pass65 points? false
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		int score = sc.nextInt();
		//여기까지는 스스로 입력할 줄 알아야함ㅠㅠ
		boolean result = score >= 60;
		System.out.println("Do you pass " + score + " points? " + result);
		sc.close();
	}

}
