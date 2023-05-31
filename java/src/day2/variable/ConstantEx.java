package day2.variable;

public class ConstantEx {

	public static void main(String[] args) {
		final int MAX_AGE;
		//MAX_AGE : 상수(이름이 붙어있는 것들/대문자를 주로 사용), 100 : 리터럴(실제 값)
		MAX_AGE = 100;
		//MAX_AGE = 101;//에러 발생, 1번 초기화 한 후 수정하려고 했기 때문에, 선언과 동시에 반드시 초기화하는 것이 좋다!!
		System.out.println(MAX_AGE);

		//지역변수는 자동으로 초기화 안됨
		int totalCount; //선언만하고 사용안하면 문제가 안됨
		//System.out.println(totalCount); 
		//하지만 이후 printout 하게 될 경우 에러 발생 
		//totalCount 변수가 초기화 되어있지 않기 때문에 사용 불가(지역변수)
		//지역변수가  아닌 것들은 실행하면 실행되는 경우가 있음

	}

}
