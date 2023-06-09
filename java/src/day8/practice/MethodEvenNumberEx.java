package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		// 정수 num을 입력받아 짝수인지 아닌지 판별하는 코드를 작성하세요. 홀짝 판별 예제 메서드를 이용할 것
		
		int num1;
		Scanner sc = new Scanner(System.in); // main 함수 안에서 실행이 된다.
		System.out.println("input number : ");
		num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		
		//1)
		printEvenNumver(num1); // 여기 써줘야 밑에 메서드에 있는것이 출력됨
		
		//2) 첫번째로 여기있는 num1, 2를 밑에 메서드에 넣어준다
		if(mod(num1, 2) == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		//3)
		if(isEvenNumber(num1)) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		
		//4)
		if(isMultiple(num1,2)) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		sc.close();
	}
}
	/** 1)
	 * 기능: num가 주어지면 num가 짝수인지 홀수인지 출력하는 메서드
	 * @param num : 판별할 정수
	 * @return 없음 => void
	 * 메서드명 : printEvenNumver
	 * */
	public static void printEvenNumver(int num) {
		if(num % 2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		return;
	}
	
	/** 2)
	 * num1과 num2가 주어지면 num1을 num2로 나누었을 때 나머지를 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1과 int num2 
	 * 리턴타입 : 나누었을 때 나머지 => 정수 => int
	 * 메서드명 : mod 
	 * */
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	//위에있던 num1, 2를 여기에있는 int num1, int num2에 넣어준다
	//하나를 입력받고 홀짝을 판별해야하니 2로 나누었을 때 홀짝을 확인해주면되서 int num2는 2라는 리터럴 정수를 넣어준다
	
	/** 3)
	 * num가 주어지면 num가 짝수인지 홀수인지 알려주는 메서드
	 * 매개변수 : 판별할 정수 => int num 
	 * 리턴타입 : 짝수인지(참) 홀수인지(거짓) => boolean 
	 * 메서드명 : isEvenNumber
	 * */
	public static boolean isEvenNumber(int num){
		return num % 2 == 0;
	}
	
	/** 4)
	 * num1과 num2가 주어지면 num1이 num2의 배수인지 아닌지 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2 
	 * 리턴타입 : 배수인지(참) 아닌지(거짓) => boolean 
	 * 메서드명 : isMultiple
	 * */
	public static boolean isMultiple(int num1, int num2){
		return num1 % num2 == 0;
	}
}
