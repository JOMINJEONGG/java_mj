package day3.operator;

public class ArithmeticEx {

	public static void main(String[] args) {
		/* byte + 정수나 char + 정수는 결과가 int여서 byte나 char에 바로 저장할 수 없음
		 * 자료형 변환을 이용해서 저장해야한다
		 * byte + 정수는 byte보다 큰 형태인 int로 묵시적 형변환이 오기때문에 앞에 (byte)를 써서 바꿔준다
		 * char(2바이트) + 정수는 char보다 큰 형태인 int로 묵시적 형변환이 오기 때문에 앞에(char)를 써서 바꿔준다
		 * ex) byte + 5L = long으로 형변환이 되는것임
		 * byte + short = int로 형변환
		 * int 이후로는 상위 형태로 변환 
		 * */
		
		byte num1 = 3;
		//num1 = num1 + 5; -> 오류발생
		num1 = (byte)(num1 + 5);
		
		char ch = 'A';
		//ch = ch + 1; -> 오류발생 
		System.out.println(ch);
		ch = (char)(ch + 1);
		System.out.println(ch);
		
		int num2 = 3;
		// num2 = 3 + 4.0; 정수와 실수가 더하면 큰타입으로 변환된다
		// 앞에서 num2 는 정수라고 정의를 했기 때문에 3 + 4.0 은 7.0 실수가 되므로 (int)로 앞에 적어줘서 정수로 바꿔줘야한다
		num2 = (int)(num2 + 4.0);


	}

}
