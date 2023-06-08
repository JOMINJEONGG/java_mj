package day7.practice;

public class StartEx3 {

	public static void main(String[] args) {
		/*		*	i=1 공백=4	 *=1
		 * 	   **	i=2 공백=3	 *=2
		 *    ***	i=3 공백=2	 *=3
		 *   ****	i=4 공백=1	 *=4
		 *  *****	i=5 공백=0	 *=5
		 * 				공백=5-i  *=i
		 * 이와 같이 출력되도록 반복문을 이용해보자
		 * */

		/* 외부반복문
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 실행문 : *i개를 출력 후 엔터
		 * */
		for(int i = 1 ; i <= 5; i++){
			//공백을 출력
			/* 내부반복문
			 * 반복횟수 : j는 1부터 5-i까지 1씩 증가
			 * 규칙성 : ' '를 출력
			 * */
			for(int j = 1 ; j <= 5-i ; j++) {
				System.out.print(' ');
			}
			/* * i개를 출력
			 * 내부반복문
			 * 반복횟수 : j는 1부터 i까지 1씩 증가
			 * 규칙성 : *을 출력
			 * */
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");			
			}
			//엔터
			System.out.println();
		}
	}
}
