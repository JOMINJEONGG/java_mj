package day19.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		/* NullPointerException
		 * 객체가 null인 상태로 메서드 또는 멤버를 호출하는 경우
		 * = 객체가 안만들어진 상태에서 기능을 호출하는 경우
		 * */
		String str = null; // => 이렇게하면 오류 발생
		//String syr = "abc";//일반적으로 이렇게 사용
		//System.out.println(str.substring(0));
		test(str);
	}

	//메서드안에 있는걸 실행하면 노란줄이 뜨지 않아서 실수 많이함
	/* 메서드를 만들 때 매개변수의 null 체크를 반드시 하는 게 좋음*/
	public static void test(String str) {
		if(str == null) {
			return;
		}
		System.out.println(str.substring(0));
	}
}
