package day18.practice;

import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		// https://github.com/st8324/Docs/blob/master/REGEX.md => 들어가기
		//입력받은 문자열이 http://또는 https://로 시작하는지 확인하는 정규표현식을 작성하세요
		String str = "http://naver.com";
		String regex = "^https?://[a-zA-Z\\.]+$";
		boolean result = Pattern.matches(regex, str);
		System.out.println(str + " : " + result);
		
	}
}
