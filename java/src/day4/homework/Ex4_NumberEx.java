package day4.homework;

import java.util.Scanner;

public class Ex4_NumberEx {

	public static void main(String[] args) {
		// 정수 num가 짝수이면 num에 2를 나누고, 정수 num가 홀수이면 num에 1을 더한 후, num를 출력하는 코드를 작성하세요.
		
		int num;
		Scanner sc  = new Scanner(System.in);
		System.out.println("input num : ");
		num = sc.nextInt();
		
		int sum1 = num / 2;
		int sum2 = num + 1;
		
		if(num % 2 == 0/*num 짝수이다*/) {
			System.out.println(sum1);
		}else if(num % 2 != 0/*num 홀수이다*/) {
			System.out.println(sum2);
		}else {
		}
		sc.close();
	}
}
