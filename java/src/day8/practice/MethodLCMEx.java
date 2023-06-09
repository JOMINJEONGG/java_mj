package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		//정수 num1과 num2를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요, 단 메서드를 이용할 것
		/* A : ga, B : gb
		 * g: 최대공약수
		 * l : A*B/g
		 *  A*B/g == (ga * gb)/g == gab
		 */
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
				
		int lcm = lcm1(num1, num2);
		System.out.println(num1 +  " and " + num2 + " lcm : " + lcm);
		
		lcm = lcm2(num1, num2);
		System.out.println(num1 +  " and " + num2 + " lcm : " + lcm);
		
		sc.close();
	}
	//1)
	public static int lcm1(int num1, int num2) {
		for(int i = num1 ; i <= num1 *num2 ; i += num1) {
			//공배수를 찾음. isMultile은 배수를 찾는 메서드이고
			//i가 num1의 배수들이기 때문에 i가 num2의 배수이면 num1과 num2의 공배수가 됨
			if(isMultiple(i, num2)) {
				return i; 
			}
		}
		return num1*num2; //위의 코드는 양수만 입력했을 때 나오는 값이기 때문에 음수일 때는 그냥 곱하는걸로 마무리하기로~
		//어떠한 값이라도 전달해야하니까 일단 return 값을 정한것임
	}
	
	//2)
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
		
	public static int gcd(int num1, int num2) {
		for(int i = num1;i>=i;i--) {
			if(isMultiple(num1,i) && isMultiple(num2,i)) {
				return i; 
			}
		}
		return 1;
	}	
}
