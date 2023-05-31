package day2.operator;

public class IncreaseOpreatorEx {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		System.out.println("작업 전 : " + num1 + "(전위형)," + num2 + "(후휘형)");
		//전위형은 먼저 증가를 하고 동작을 하기 때문에 num1을 증가 시킨 후 작업 중 문자열과 더함
		//후휘형은 먼저 동작을 하고 증가를 하기 때문에 num2를 앞의 문자열과 더한 후에 num2를 증가 시킴
		//동작과 증가를 한 문장에서 한 번에 끝냄, 헷갈리면 나눠서 하기 밑에 방법 예시 있음 보기
		System.out.println("작업 중 : " + ++num1 + "(전위형)," + num2++ + "(후휘형)");
		System.out.println("작업 후 : " + num1 + "(전위형)," + num2 + "(후휘형)");

		System.out.println("========================");
		
		num1 = num2 = 10;
		System.out.println("작업 전 : " + num1 + "(전위형)," + num2 + "(후휘형)");
		++num1;
		System.out.println("작업 중 : " + num1 + "(전위형)," + num2 + "(후휘형)");
		//증가 먼저하고 동작하도록 하면 전위형만 또는 후휘형만 써도 된다, 헷갈리면 나눠서 하자, 값은 똑같이 나옴
		//++num1; 처럼 앞에 선언하고 시작하기
		++num2;
		System.out.println("작업 후 : " + num1 + "(전위형)," + num2 + "(후휘형)");
	}

}
