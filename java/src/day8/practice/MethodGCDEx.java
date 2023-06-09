package day8.practice;

import java.util.Scanner;

public class MethodGCDEx {

	public static void main(String[] args) {
		// 정수 num1과 num2를 입력받아 두 정수의 최대공약수를 구하는 코드를 작성하세요, 단 메서드를 이용할것
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
				
		int gcd = gcd(num1, num2);
		//앞의 gcd는 변수 이고 뒤의 gcd는 메소드이다
		
		System.out.println(num1 + " and " + num2 + " gcd : " + gcd);
		
		sc.close();
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
	
	/** 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최대공약수 => 정수 => int
  	 * 메서드명 : gcd
	 * */
	
	public static int gcd(int num1, int num2) {
		//원래는 1부터 시작해서 최대공약수 찾았는데 거꾸로 찾으면 빨리 찾을 수 있으니 뒤에서부터 찾게 실행시켜보기
		for(int i = num1;i>=i;i--) {
			//i가 num1의 약수이다 == num1은 i의 배수이다
			if(isMultiple(num1,i) && isMultiple(num2,i)) {
				return i; // i는 약수이다 
			}
		}
		return 1; // return값이 음수나오면 안됨 & 두수의 최대공약수는 최소 1이니까 1로 해주기 => return 값 설정안하면 에러뜸
		//num1이 음수일때 반복문이 한 번도 동작하지 않을 수 있어서 이 때 두 정수의 최대공약수는 최소 1이기 때문에 값 1을 설정해준다 
	}
	
}
