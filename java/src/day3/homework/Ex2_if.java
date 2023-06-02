package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
		 * input gender : 
		 * M
		 * Are you a women? man
		 * input gender : 
		 * W
		 * Are you a women? woman
		 * */		

		Scanner sc = new Scanner(System.in);
		String M = "man";
		String W = "woman";

		System.out.println("input gender : ");
		String string = sc.nextLine(); 
		String result = "man" == M ? "man" : "woman";
		if(M == "man") {
			System.out.println("M");
		}
		System.out.println("Are you a women? " + result);
		
		System.out.println("input gender : ");
		String string2 = sc.nextLine(); 
		String result2 = "woman" == W ? "woman" : "man";
		if(W == "woman") {
			System.out.println("W");
		}
		System.out.println("Are you a women? " + result2);

		sc.close();

	}



}

