package day4.ifex;

public class EvenNumberEx2 {

	public static void main(String[] args) {
		//홀짝 판별 예제를 조건 연산자를 이용하여 작성
		/*if(조건식1){
		 * 		a = b;
		 * }else{
		 * 		a=c;
		 * }
		 * a = 조건식1 ? b : c;
		 * */
				
		int num = 4; 
		/* if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		}else {
			System.out.println(num + " is an odd number");
		}*/
		String result = num % 2 == 0 ? "even" : "odd";
		System.out.println(num + " is an " + result + " number.");
		
	}

}
