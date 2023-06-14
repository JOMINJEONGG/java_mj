package day11.array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/* 학생들의 국어 성적을 저장하기 위한 배열을 생성하세요.
		 * 학생들은 총 10명 */
		//자료형 [] 배열이름 = new 자료형[개수];
		//자료형 배열이름 [] = new 자료형[개수];
		// 배열 순서는 0부터 n-1까지
 
		double [] studentKoreaScore = new double[3];
		// double st1, st2, st3; => 옛날같으면 이렇게 했겠지만 arry 배웠으니 밑에 반복문으로 하자
		Scanner sc = new Scanner(System.in);
		
		//이렇게 반복문으로!
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("input : ");
			studentKoreaScore[i] = sc.nextDouble();
			//studentKoreaScore[i] 
			//배열명[번지] : 변수 처럼 사용됨
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(studentKoreaScore[i]);
		}
		//for문 안에서 int로 i 두 번다 선언? 초기화?했지만 반복문 안에서만 쓰여서 오류 안남
		
		/* 학생 3명의 국어 점수 평균을 구하고 출력하는 코드를 작성하세요
		 * */
		double sum = 0.0;
	
		for(int i = 0 ; i < 3 ; i++) {
			sum += studentKoreaScore[i];
		}
		
		double average = sum / 3;
		System.out.println("Average : " + average);
			
		sc.close();
	}

}
