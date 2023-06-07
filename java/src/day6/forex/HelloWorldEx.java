package day6.forex;

public class HelloWorldEx {

	public static void main(String[] args) {
		/* For문을 이용하여 Hello world를 5번 출력하는 예제
		 * 반복횟수 : i는 1부터 5까지 1씩 증가 
		 * 규칙성 : Hello World를 출력
		 * */
		/* for(초기화;조건식;증감식{
		 * 	   실행문;
		 * }
		 * */
		
		 int i;
		 for(i = 1 ; i <=5 ; i++) {
			 System.out.println("Hello World");
		 }
		 		 
		 System.out.println("===========");
		 
		 i = 1 ;
		 while(i <=5) {
			 System.out.println("Hello World");
			 i++;
		 }

		 /* 언제 어떤 반복문을 사용할지에 대해 정해진 답은 없음 : 개인취향
		  * 강사의 경우!
		  * 규칙적으로 증가하는 변수를 이용하여 반복을 한다? for문 이용
		  * - 1부터 10까지출력하는 예제
		  * 특정 조건을 만족할 때 반복문을 종료한다? while문 이용
		  * -q를 입력받을 때까지 문자를 입력받아 출력하는 예제
		  * */		 
	}

}
