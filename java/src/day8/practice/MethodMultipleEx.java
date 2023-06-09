package day8.practice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		//정수 num을 입력받아 2, 3, 6의 배수인지 아닌지 판별하는 코드를 작성하세요. 단, 메서드를 이용할 것
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num1 = sc.nextInt();
		//System.out.println(MethodMultipleEx.multiple(4,2)); => 클래스명.메서드명 => 호출가능
		if(isMultiple(num1,6)) {
			System.out.println(num1 + " is a multiple of 6.");
		}else if(isMultiple(num1,2)) {
			System.out.println(num1 + " is a multiple of 2.");
		}else if(isMultiple(num1,3)) {
			System.out.println(num1 + " is a multiple of 3.");
		}else {
			System.out.println(num1 + " is not a multiple of 2,3,6.");
		}
		sc.close();
	}
	/**
	 * num1 주어지면 num1을 2, 3, 6로 나누었을 때 나머지가 0인 배수임을 알려주는 메서드
	 * 매개변수 : 정수 => int num1
	 * 리턴타입 : 2, 3, 6의 배수인지(참) 아닌지(거짓) => 정수 => boolean
	 * 메서드명 : multiple
	 * */
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
