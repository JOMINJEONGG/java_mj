package day1.variable;

public class IntExample1 {

	public static void main(String[] args) {
		int num2 = 11; //십진수 11
		int num3 = 0b11; //0b 들어가면 2진수 11 2+1 되서 2됨 == 10진수 3
		int num4 = 011; //0들어가면 8진수 8+1 되서 11 == 10진수 9
		int num5 = 0x11; // 16진수 11 == 10 진수 17
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		//1234567890123은 int로 표현할 수 없는 큰 숫자
		//long 타입에 큰 숫자를 저장할 경우 리터럴에 L또는 ㅣ을 반드시 붙여야함
		long num6 = 1234567890123L;
		}
	}