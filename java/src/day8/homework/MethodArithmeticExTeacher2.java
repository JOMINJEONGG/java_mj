package day8.homework;

import java.util.Scanner;

public class MethodArithmeticExTeacher2 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요. 단, 메서드 이용
		 * 연산자를 잘못 입력한 경우는 없다고 가정
		 * 0으로 나누는 일은 없다고 가정 // 나중에 배울 예정
		 * */
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operator;
		double res;
		System.out.println("input (ex : 1 + 2) : ");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		res = arithmetic2(num1, operator, num2);
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + res);
		sc.close();
		
	}
	
	/** 두 정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메서드
	 * 매개변수 : 두 정수와 산술 연산자 => int num1, char operator, int num2
	 * 리턴타입 : 산술연산결과 => double
	 * 메서드명 : arithmetic
	 * */
	
	public static double arithmetic2(int num1, char operator, int num2) {
		switch(operator) {
		case '+':
			return num1 + num2;
			// break; // return이 있기 때문에 break가 실행될 일이 절대 없음 에러 발생
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / (double)num2;
		case '%':
			return num1 % num2; 
		default:
			//default 바로 밑에 return 하거나 switch문 빠져나간 후 return을 넣어 사용할 수 있음
			return 0.0; 
		}
		//return 0.0; 이자리에 있어도된다
	}
		
}
