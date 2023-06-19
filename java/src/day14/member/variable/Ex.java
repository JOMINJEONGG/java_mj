package day14.member.variable;

public class Ex {

	public static void main(String[] args) {
		/* 멤버 변수 초기화 예제
		 * 객체 멤버변수(Static이 안붙는) num 초기화 순서
		 * 1. 기본값 : int의 기본값이 0으로 초기화
		 * 2. 명시적 초기화 : 멤버변수 선언과 동시에 초기화 되는 값 => 1
		 * 3. 초기화 블록 : {}로 된 초기화 블록에서 초기화 => 2
		 * 4. 생성자 : 생성자에서 초기화 => 3
		 * 
		 * => 최종적으로 num은 3으로 초기화
		 * 
		 * 클래스 멤버변수(Static이 붙는) => 위의 3번까지 같음
		 * */
		
		System.out.println(TestA.num2);
	
		TestA a = new TestA();
		System.out.println(a.num);	
		
		System.out.println(TestA.num2);
	}
}

class TestA{
	int num = 1;
	//초기화 블록
	{
		num = 2;
	}
	public TestA() {
		num = 3;
		num2 = 3; // 여기서 num2를 초기화하는것은 의미가 ㅇ벗음
	}
	static int num2 =1;
	//정적 초기화 블록
	static {
		num2 = 2;
	}
}
