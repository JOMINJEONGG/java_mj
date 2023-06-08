package day7.practice;

public class PrintEx {

	public static void main(String[] args) {
		//println() : 원하는 값을 출력한 후 엔터까지 입력
		System.out.println("abc");
		System.out.println('a');
		System.out.println(1);
		//print() : 원하는 값을 출력
		System.out.print("abc");
		System.out.print('a');
		System.out.print(1);
		//printf() : 문자열 형태로 만들어서 원하는 값을 출력, 서식문자를 이용
		//이런게 있구나 하고 알고만 있자
		System.out.printf("String : %s\n", "abc");
		System.out.printf("Integer : %d\n", 1);
		System.out.printf("Char : %c\n", 'a');
		System.out.printf("double : %.2f\n", 3.12345678978); // 소수점 2째자리까지 출력
	}
}

