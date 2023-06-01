package day2.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*콘솔에서 정수 2개와 문자(산술 연산자)를 입력받아 출력하는 코드를 작성하세요
		예 : 두 정수와 산술연산자를 입력하세요 ( 예: 1 + 2 ) : 
		[입력]1 + 2 [엔터]
		[출력]1 + 2*/
		
		int num1, num2; // 정수 두개 필요하니까 선언 먼저하기
		char operator; // 문자 하나 필요하니까 선언하기
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연산자를 입력하세요. (예: 1 + 2) :");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		System.out.println("" + num1 + " " + operator + " " + num2); 
		// 여긴 출력과 관련된 곳으로 num1 뒤의 " "과 operator 뒤의 " " 가 없으면 밑의 consol에 띄어쓰기 없이 출력됨
		sc.close();			
	}
}
