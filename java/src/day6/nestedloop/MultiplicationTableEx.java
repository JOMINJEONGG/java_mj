package day6.nestedloop;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		//구구단 2단부터 9단까지 출력하는 코드를 작성하세요.
		int i, j = 1;// => j를 초기화 하지 않으면 밑에서 에러 남, for문 들어가기 전까지는 참인지 거짓인지 몰라서 for문이 실행 되지 않을 수 있기 때문에 초기화를 해줘야함
		//안에서 초기화하는 변수들 그래서 밖에서도 초기화해줘야함
		
		/* 외부 반복문
		 * 반복횟수 : i는 A부터 B까지 1씩 증가 A : 2 B : 9 
		 * 규칙성=실행문 : i단이 출력
		 * */
		for( i = 2 ; i <= 9 ; i++ ) {
			//i단 출력
			/* 내부 반복문
			 * 반복횟수 : j는 1부터 9까지 1씩증가
			 * 규칙성 : i X j = i*j를 출력
			 * */
			for( j = 1 ; j <=9 ; j++ ) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		//이 위치에서 i와 j의 값은 얼마? i = 10 j =10
		//위의 식을 빠져나온 후의 값을 확인하기 위함
		System.out.println("i : " + i + " j : " + j);
	}
}
