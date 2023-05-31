package day2.variable;

public class StringEx {

	public static void main(String[] args) {
		/*String 클래스는 문자열을 수정하는게 아니라 새로 생성*/
		String str1 = null; 
		String str2 = "";
		String str3 = "A"; // Char ch = 'A'와 다름, 앞의 것("")은 문자열 뒤에 것('')은 문자
		String str4 = "안녕하세요.";
		System.out.println(str1); // null 이라는 문자열이 아님. 비어있어서 null이라고 찍히는 것
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
