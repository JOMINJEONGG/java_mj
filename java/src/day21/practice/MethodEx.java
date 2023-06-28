package day21.practice;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3,4,5));
	}
	
	/* 여러개의 정수의 합을 알려주는 메서드 */
	// 가변매개변수 : 같은 자료형일 때만 (배열처럼)사용 가능 
	// 다른 자료형이랑 같이 사용할거면 아래 주석과 같이 앞으로 들어가야만 사용 가능
	public static int sum(/*double i ,*/int ...nums) {
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
		}
		return sum;
	}
}