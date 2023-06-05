package day4.homework;

import java.util.Scanner;

public class Ex2_MaxEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
		int num1;
		int num2;
		Scanner sc  = new Scanner(System.in);
		System.out.println("input number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println(num1 + " a larger number");
		}else {
			System.out.println(num2 + " a larger number");
		}
		sc.close();
	}

}
