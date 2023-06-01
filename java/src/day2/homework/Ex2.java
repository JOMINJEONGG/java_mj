package day2.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*두 정수를 입력받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요. 단 2번째 숫자는 0이 아님.
		 * 예 : 두 정수를 입력하세요.
		 * 1 2 [엔터]
		 * 1+2 =3
		 * 1-2=-1
		 * 1*2=2
		 * 1/2=0.5
		 * 1%2=1
		 * */

		System.out.println("두 정수를 입력하세요."); 
		//콘솔에서 입력받을 수 있는 scanner생성
		Scanner sc = new Scanner(System.in); // 일단 이 공식 외우자
		//두 정수를 입력 받음
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// 두 정수의 산술 연산을 계산
		//int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / (double)num2; // (double)은 num1 앞에 붙여도 되고 num2앞에 붙여도 된다
		int mod = num1 % num2;
		//결과를 콘솔에 출력
		//System.out.println(num1 + " + " + num2 + " = " + sum); // '+' 문자로 안하고 " + " 문자열로 했다. "" 이거 더하지 않고 문자열 안에 공백을 포함하기 위해서
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 위의 줄처럼 출력하지 않고 (num1 + num2)로 바꿔서 run하면 위의 int로 선언 안해도 된다. 바로 직접계산해서 출력하도록 함
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * "  + num2 + " = " + mul);
		System.out.println(num1 + " / "  + num2 + " = " + div);
		System.out.println(num1 + " % "  + num2 + " = " + mod);
		//System.out.println(num1 + " % "  + num2 + " = " + (num1 % num2)); -> 이렇게 사용해도 가능함
		//+ 와 - 는 () 안에 꼭 넣어야하고 * /  % 는 () 안에 넣지 않고 생략해도 된다. * / % 는 - + 보다 계산의 우선순위이기 때문에 ()안 넣어도 되는것임
		//하지만 헷갈리지 않고 같은 형태로 보여주기 위해서 일괄적으로 ()안에 넣는 것으로 하자
		sc.close(); // scanner 하고 꼭 닫아주기
	}

}
