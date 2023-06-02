package day3.homework;

import java.util.Scanner;

public class Ex1_conditionalTeacher2 {

	public static void main(String[] args) {
		/*성별(M:남자,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건연산자 이용
		 * input gender : 
		 * M
		 * Are you a women? false
		 * input gender : 
		 * W
		 * Are you a women? true
		 * */
		//문자열로 풀은것
		
		String gender; // 문자열로 어떻게 하는지 보기위해 String으로 선언
		Scanner sc = new Scanner(System.in); 
		System.out.println("input gender : ");
		gender = sc.next();
		boolean result = gender.equals("W") ? true : false;
		//gender = sc.next().charAt(0);
		//boolean result = gender == 'W' ? true : false;	=> 문자로 했을때
		//문자열로 꿨으니 equals를 붙이고 ""안에 넣어줘야함
		//equals 부분 궁금하면 day3.operator->ComparisonEx 보면 나와있음
		System.out.println("Are you a women? " + result);
		sc.close();
	}

}
