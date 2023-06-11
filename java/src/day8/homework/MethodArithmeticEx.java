package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요. 단, 메서드 이용
		 * 연산자를 잘못 입력한 경우는 없다고 가정
		 * 0으로 나누는 일은 없다고 가정 // 나중에 배울 예정
		 * */
		int num1, num2;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number : ");
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		num2 = sc.nextInt();

		if(op == '+') {
			int res1 = sum(num1, num2);
			System.out.println(" " + num1 + " " + op + " " + num2 + " = " + res1);
		}else if(op == '-') {
			int res2 = sub(num1, num2);
			System.out.println(" " + num1 + " " + op + " " + num2 + " = " + res2);
		}else if(op == '*') {
			int res3 =mul(num1, num2);
			System.out.println(" " + num1 + " " + op + " " + num2 + " = " + res3);
		}else if(op == '/') {
			double res4 = (double)div(num1, num2);
			System.out.println(" " + num1 + " " + op + " " + num2 + " = " + res4);
		}else if(op == '%') {
			int res5 = mod(num1, num2);
			System.out.println(" " + num1 + " " + op + " " + num2 + " = " + res5);
		}else {
			System.out.println("Wrong");
		}

		sc.close();
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / (double)num2;
	}
	public static int mod(int num1, int num2) {
		return num1 % num2;	
	}

}
