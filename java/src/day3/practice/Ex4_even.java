package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
		/*정수 num가 입력받아 num가 홀수인지 짝수인지 판별하는 코드를 작성하세요.
		 * num를 2로 [나누었을 때 나머지가] 0이 아니면 홀수(odd number)이고
		 * num를 2로 [나누었을 때 나머지가] 0이면 짝수(even number)
		 * */
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(num % 2 != 0){
			System.out.println(num + " is an odd number ");
		}
		if(num % 2 == 0){
			System.out.println(num + " is an even number ");
		}
		sc.close();
	}

}