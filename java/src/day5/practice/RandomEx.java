package day5.practice;

public class RandomEx {

	public static void main(String[] args) {
		//min부터 max사이에 랜던함 정수를 만드는 코드를 작성하세요.
		//Math.randeom() : 0이상 1 미만의 실수를 랜덤으로 생성
		/* 0 <= r < 1
		 * 0 * (max-min+1) <= r * (max-min+1) < 1 * (max-min+1)
		 * 0 <= r * (max-min+1) + min < max - min + 1 + min
		 * 0+ min <= r * (max-min+1) + min < max - min + 1 + min
		 * min <= r * (max-min+1) + min < max +1
		 * */
		
		int min = 1, max = 10;
		int random = (int)(Math.random() * (max-min+1) + min);
		System.out.println(Math.random());
		
	}

}
