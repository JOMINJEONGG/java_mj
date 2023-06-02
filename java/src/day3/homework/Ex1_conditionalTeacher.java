package day3.homework;

import java.util.Scanner;

public class Ex1_conditionalTeacher {

	public static void main(String[] args) {
		/*성별(M:남자,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건연산자 이용
		 * input gender : 
		 * M
		 * Are you a women? false
		 * input gender : 
		 * W
		 * Are you a women? true
		 * */
		//문자로 풀은것
		
		char gender; // 필요한 변수 선언
		Scanner sc = new Scanner(System.in); // 입력받아~ 
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		//nextline 은 빈 문자열이 들어갈 수 있음
		boolean result = gender == 'W' ? true : false;				
		System.out.println("Are you a women? " + result);
		sc.close();
	}

}
