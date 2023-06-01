package day3.ifex;

public class IfEx1 {

	public static void main(String[] args) {
		//정수 num가 0이면 0입니다라고 출력하는 코드를 작성하세요.
		//~면 앞에 있는것이 조건문 ~면 뒤에있는것이 실행문으로 생각하자
		/*if(조건식) {
			실행문;
		} - if의 형태*/ 
		/*if(정수 num가 0이다) {
			0입니다라고 출력;
		}*/
		/*if(정수 num이 0과 같다) {
			System.out.println("0입니다.");
		}*/
		int num = 10; // num 선언하고 리터럴 값 지정
		if(num == 0) {
			System.out.println("0 is 0");
		}//참일 때만 결과 값 나옴 int num = 0이외 다른 숫자 들어가면 실행안됨
		
		//정수 num가 0이 아니면 num is not 0라고 출력하는 코드를 작성하세요.
		//num가 0이 아니다
		//num가 0과 같지 않다
		if(num != 0) {
			System.out.println(num + " is not 0");
			
		// num는 한번 선언해도 실행은 if문 두 번 있으니까 두 번 다 동작한다
		// if는 각각 동작함
		}
	}
}
		
