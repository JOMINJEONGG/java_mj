package day3.homework;



import java.util.Scanner;



public class Ex1_conditional {



	public static void main(String[] args) {

		/*성별(M:남자,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건연산자 이용

		 * input gender : 

		 * M

		 * Are you a women? false

		 * input gender : 

		 * W

		 * Are you a women? true

		 * */

		

		Scanner sc = new Scanner(System.in);

		

		System.out.println("input gender : ");

		char gender = sc.next().charAt(0);

		

		String result = gender == 'W' ? "true" : "false";

		System.out.println("Are you a women? " + result);

		

		System.out.println("input gender : ");

		char gender2 = sc.next().charAt(0);

		

		String result2 = gender == 'M' ? "true" : "false";

		System.out.println("Are you a women? " + result2

				);

		

		sc.close();



	}



}

