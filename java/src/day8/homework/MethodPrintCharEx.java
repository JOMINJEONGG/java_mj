package day8.homework;

public class MethodPrintCharEx {

	public static void main(String[] args) {
		/* 다음과 같이 출력하기 위한 코드를 작성하세요.단, 메서드 이용
		 * *****
		 * ***
		 * ?????
		 * ^^^^^^^
		 * 한 줄 씩 출력하면 된다. 별처럼 한번에 출력하라는 것이 아님
		 * 조건문으로 따지라는게 아니라 한 줄 씩 출력하면 됨
		 * */
		char a = '*';
		num1(a);
		
		

		
		char c = '?';
		num3(c);
		
		char d = '^';
		num4(d);
		
	}
	
	public static void num1(char num1){
		System.out.println("*****");
	}
	

	
	public static void num3(char num3){
		System.out.println("?????");
	}
	public static void num4(char num4){
		System.out.println("^^^^^^^");
	}
}
