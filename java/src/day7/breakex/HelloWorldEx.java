package day7.breakex;

public class HelloWorldEx {

	public static void main(String[] args) {
		//break문 이용하기 위해 while(true) 무한루프 걸어준다
		//break문 오려면 앞에 조건식 와야함
		int i = 1;
		while(true) {
			System.out.println("HelloWorld");
			
			if(i == 5) {
				break;
			}
			i++;			
		}

	}

}
