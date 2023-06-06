package AloneEx;

public class WhileEx2 {

	public static void main(String[] args) {
		/* 정수 변수 num을 선언하여 1을 대입한 후
		 * 1씩 증가시키면서 10까지의 누적 합을 구하는 프로그램
		 * while문을 이용하여 작성하고 1부터 10까지의 합과 while문이 끝난 후의 num의 값을 출력하는 프로그램 
		 * */
		
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			sum += num; //책확인( )
			num++;
		}
		System.out.println("1부터 10까지의 합" + sum); 
		System.out.println("while문이 끝나고 난 후의 num의 값" + num);
	}

}
