package day4.ifex;

public class EvenNumberEx {

	public static void main(String[] args) {
		//if else문을 이용한 홀짝 판별 예제
		//num가 짝수이면 짝수라고 출력하고 아니면 홀수라고 출력해라.
		
		/*if(number가 짝수이다=>2로 나누었을 때 나머지가 0과 같다) {
			짝수라고 출력;
		}else {
			홀수라고 출력;
		}
		*/
		int num = 3; // scanner 안하고 간단하게 선언해서 보자
		if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		}else {
			System.out.println(num + " is an odd number");
		}
	}

}
