package day5.whileex;

public class HelloWordEx {

	public static void main(String[] args) {
		// Hello Word를 10번 출력하는 코드를 작성하세요.
		/* 반복 횟수 : 10번 , 1번부터 10번까지 1씩 증가
		 * => 변수의 초기값 : 1
		 * => 조건식 : 10까지 => 10보다 작거나 같을 때 까지
		 * => 증가하는 식 : 1씩 증가
		 * 규칙성 : Hello Word를 출력 
		 * */
		
		//1)
		int i = 1; // 변수의 초기값 : 1
		/*while(조건식) {
			실행문;
		}*/
		while(i <= 10) {
			System.out.println("Hello Word");
			//i는 1씩 증가, i++, i = i +1, i+=1, ++i 다 된다
			i++;
		}
		System.out.println("================");
		
		//2)
		/* 반복횟수 : i는 10부터 1까지 1씩 감소
		 *  
		 * */
		int max = 10;
		i = max;
		while(i >= 1) {
			System.out.println("Hello Word");
			i--;
		}
		
		System.out.println("================");		
		i = max;
		while(i-- >= 1) {
			System.out.println("Hello Word");
		}//i-- > 0 으로 해도된다.		
		
	}

}
