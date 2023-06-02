package day3.homework;

import java.util.Scanner;

public class Ex2_ifTeacher {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
		 * input gender : 
		 * M
		 * Are you a women? man
		 * input gender : 
		 * W
		 * Are you a women? woman
		 * */	
		
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		if(gender == 'M') {
			System.out.println("Are you a women? " + "man");
		}
		//gender가 M이다 => gender는 M과 같다
		//변수 M이 아니라 문자 'M'임을 기억하고 ''안에 넣자
		if(gender == 'W') {
			System.out.println("Are you a women? " + "woman");
		}
		//gender가 W이다 => gender는 W과 같다
		//변수 W이 아니라 문자 'W'임을 기억하고 ''안에 넣자	
				
		sc.close();

		
	}

}
