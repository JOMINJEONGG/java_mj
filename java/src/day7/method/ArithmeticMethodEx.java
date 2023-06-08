package day7.method;

public class ArithmeticMethodEx {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sub(1,2));
		System.out.println(mul(1,2));
		System.out.println(div(1,2));
		System.out.println(mod(1,2));
		
		sum2(1,2);
		//위는 이것과 같다 System.out.println(1+2);
		//System.out.println(sum2); -> return값이 없어서 이렇게 쓰면 출력 안됨
		
		
		//또 다른 예시 1+2+3
		int num1=1, num2=2, num3=3;
		int res = sum(num1, num2);
		res = sum(res, num3);
		System.out.println(res);
			
		//잘만들었다 = 재사용해도 코드를 재수정하지 않아도 되는 경우
		//잘만들어진 것은 'sum' 합을 알려주는 메소드이다 위와 같이 활용이 가능
		
	}
	/**
	 * 주어진 num1, num2의 합을 출력하는 메소드
	 * (더하는 기능 + 출력하는 기능)
	 * 두가지 기능을 해서 재사용이 어렵다. 하나의 기능을 제대로 하는 것이 좋다 
	 * @param num1 정수1
	 * @param num2 정수2
	 * */
	
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/**
	 * 주어진 num1, num2의 합을 알려주는 메소드 
	 * @param num1 정수1
	 * @param num2 정수2
	 * @return num1과 num2의 합
	 * */
	
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
