package day4.paractice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 예 : 
		 * input 2 nums and operator : 
		 * 1 + 2 [엔터]
		 * 1 + 2 =3
		 * input 2 nums and operator :
		 * 1 ? 2 [엔터]
		 * ? is not arithmetic operator
		 * 산술연산자 : op, 두 정수 : num1, num2
		 * op가 +이면 num1 + num2를 출력하고
		 * op가 -이면 num1 - num2를 출력하고
		 * op가 *이면 num1 * num2를 출력하고
		 * op가 /이면 num1 / num2를 출력하고
		 * op가 %이면 num1 % num2를 출력하고
		 * op가 산술연산자가 아니면 ? is not arithmetic operator
		 * */

		int num1, num2;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and operator(ex : 1 + 2) : ");
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		num2 = sc.nextInt();
		//num2 먼저 num2 = sc.nextInt();하고 op를 나중에 op = sc.next().charAt(0);하면 실행 제대로 안된다 왜?
		//1 + 2 이렇게 입력 값 순서대로 출력해야하기 때문에!
		
		if(op == '+'){
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2));
		}else if(op == '-'){
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2));
		}else if(op == '*'){
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 * num2));
		}else if(op == '/'){
			System.out.println(num1 + " " + op + " " + num2 + " = " + ((double)num1 / num2));
		}else if(op == '%'){
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 % num2));
		}else{
			System.out.println(op + " is not arithmetic operator!");
		}
		sc.close();
	}

}
