package day7.method;

public class SumMethodEx {

	public static void main(String[] args) {
		/* 두 정수의 합을 구하는 함수(메서드)를 만드세요. */
		//메서드는 메서드 안에 넣으면 안되고 class밖에 넣어도 안됨
		//지금 이안에 메서드 넣으면 안됨
		int num1 =1, num2 = 2;
		int res = sum(num1, num2); // 두 개의 정수 보내주기로 했으니 두 개의 정수 입력
		System.out.println(res);
	}
	//이 위치에 메서드 넣어야함
	/** 
	 * 기능	: 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 두 정수의 합 => int
	 * 메서드명 : sum
	 * 매개변수 : 두 정수 => int num1, int num2
	 * @return
	 * */
	/**
	 * 기능	: 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * @param num1 정수1
	 * @param num2 정수2
	 * @return 두 정수의 합
	 * */
	//파란 주석 이용하면 sum 함수 마우스 가져다대면 볼 수 있다
	
	/*public static 리턴타입 메서드명(매개변수들) {
		return xx;
	}*/
	public static int sum(int num1, int num2) { //=> 지역변수는 int num1, num2; 이렇게 가능하지만 매개 변수는 ,를 이용해서 각각 써줘야함
		int res = num1 + num2;
		return res;//int 기본값으로 0으로 많이 표현함[ex)return 0;] 그리고 이후에 어떻게 구현할지 고민하자
		//return num1 + num2; => 위의 두줄 합하면 이렇게 나옴
	}
}
//여기는 class밖이어서 메서드 입력하면 안됨