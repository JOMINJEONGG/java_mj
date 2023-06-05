package day4.homework;

import java.util.Scanner;

public class EX1_ScoreAverageEx_Teacher {

	public static void main(String[] args) {
		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요
		 * 성적은 정수.
		 * */
		//(국어 + 영어 + 수학) / 3
		
		int kor, eng, math;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		//국어, 영어, 수학순으로 성적을 입력
		System.out.println("input sore(kor, eng, math ex : 100 90 80) : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		//평균을 계산
		avg = (kor + eng + math) / 3.0; 
		/*정수 / 정수 하면 실수 나옴 실수 값이 나와도 정수로 값이 입력된다, 예를 들어 3.2의 값이 나와야하는데 3으로 값나와서 .2의 값도 나오려면 형변환해줘야하기 때문에 
		 * 3을 3.0으로 바꿔주거나 (double)3 이렇게 입력해서 형변환해줘여한다*/
		
		//평균을 출력
		System.out.println("avg : " + avg);
		sc.close();
	}

}
