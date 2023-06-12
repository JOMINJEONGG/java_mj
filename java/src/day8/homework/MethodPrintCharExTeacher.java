package day8.homework;

public class MethodPrintCharExTeacher {

	public static void main(String[] args) {
		/* 다음과 같이 출력하기 위한 코드를 작성하세요.단, 메서드 이용
		 * *****
		 * ***
		 * ?????
		 * ^^^^^^^
		 * 한 줄 씩 출력하면 된다. 별처럼 한번에 출력하라는 것이 아님
		 * 조건문으로 따지라는게 아니라 한 줄 씩 출력하면 됨
		 * */
		
		//1)
		printString("*****");
		
		//2)
		printChar('*', 5); 
		System.out.println();// 단점은 밖에서 엔터를 쳐줘야함
		
		//3)
		printChar('*', 5, '\n'); // '\n' 이건 엔터를 의미
				

		printChar('=', 10, '\n');
		
		//이전 수업시간 별 예제 다시 해보기
		/*      *
		 *     ** 
		 *    ***
		 *   ****
		 *  *****
		 * */
		int num = 5;
		for(int i = 1 ; i <= 5 ; i ++) {
			//공백(' ') num - i개 출력
			printChar(' ', num -i);
			//'*'이 i개 출력 후 엔터
			printChar('*', i, '\n');
		}
		
		printChar('=', 10, '\n');
		
		//2)것을 String으로 응용해서 별 예제해보기
		String str = "";
		for(int i = 1 ; i <= 5 ; i ++) {
			//공백(' ') num - i개 출력
			str += printChar2(' ', num -i);
			//'*'이 i개 출력 후 엔터
			str += printChar('*', i, '\n');
		}
		System.out.println(str);
	}
	//1)
	/**문자열이 주어지면 주어진 문자열을 출력ㅎ고 줄바꿈 하는 메서드
	 * 매개변수: 문자열 => String str
	 * 리턴타입: 없음 => void
	 * 메서드명: printString
	 * */
	
	public static void printString(String str){
		System.out.println(str);
	}
	
	//2)엔터를 치라는 말이 없어서 엔터를 밖에 쳐줘야해서 main에 단점임
	/**문자와 개수가 주어지면 주어진 문자를 개수만큼 출력하는 메서드
	 * 매개변수: 문자와 개수 => char ch, int count
	 * 리턴타입: 리턴타입: 없음 => void
	 * 메서드명: printChar
	 * */
	
	public static void printChar(char ch, int count){
		for(int i = 1 ; i<=count ; i++) {
			System.out.print(ch);
		}
	}
	
	//2)것을 string으로 응용
		public static String printChar2(char ch, int count){
			String str = "";
			for(int i = 1 ; i<=count ; i++) {
				System.out.print(ch);
				str += ch;
			}
			return str;
		}
		
	//3)
	/**문자와 개수, 마지막 문자가 주어지면 주어진 문자를 개수만큼 출력하고 마지막 문자를 출력하는 메서드
	 * 매개변수: 문작와 개수와 마지막 문자 => char ch, int count, chat lastCh
	 * 리턴타입: 출력된 문자열 // 원래는 없음 => void가 맞는데 응용해서 해보려고 출력된 문자열로 해보자
	 * 메서드명: printChar
	 * 메서드 오버로딩으로 printChar 메서드 추가 => 매개변수가 다름
	 * */

	public static String printChar(char ch, int count, char lastCh){
		String str = "";
		for(int i = 1 ; i<=count ; i++) {
			System.out.print(ch);
			str += ch;
		}
		System.out.print(lastCh); //이부분이 달라진 부분
		str += lastCh;
		return str;
	}
	
}
