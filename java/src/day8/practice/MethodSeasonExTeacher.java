package day8.practice;

import java.util.Scanner;

public class MethodSeasonExTeacher {

	public static void main(String[] args) {
		/* 월을 입력받아 계절을 출력하는 코드를 작성하세요, 단 메서드 이용
		 * Spring : 3, 4, 5
		 * Summer :  6, 7, 8
		 * Fall : 9, 10, 11
		 * Winter : 12, 1 ,2
		 * Wrong Month : 그 외
		 * */
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();
		
		//1번 출력 방법
		String season = getSeason(month);
		System.out.println(month + " is " + season);
		
		//2번 출력 방법
		System.out.println(month + " is " + getSeason(month));
		
		sc.close();
	}
	
	/** 월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 계절 => String
  	 * 메서드명 : getseason
	 * */
	//출력하고 끝나는거여서 void로 해도된다
	public static String getSeason(int month) {
		//month가 3이거나 4이거나 5이면 Spring 출력
		//month가 3과 같거나 4와 같거나 5와 같으면
		if(month == 3 || month == 4 || month == 5) {
			return "Spring";
		}
		//month가 6이건 7이거나 8이면 Summer 출력
		else if(month == 6 || month == 7 || month == 8) {
			return"Summer";
		}
		//month가 9이건 10이거나 11이면 Fall 출력
		else if(month == 9 || month == 10 || month == 11) {
			return"Fall";
		}
		//month가 12이건 1이나 2이면 Winter 출력
		else if(month == 12 || month == 1 || month == 2) {
			return "Winter";
		}
		//아니면 Wrong Month 출력
		else {
			return "Wrong month";
		} 
	}
	//String으로 하면 sysout이랑 쓰게되면 계산이랑 출력다되는거니까 sysout은 하지말고 return으로만 출력해야하고
	//void로 하면 return값이 없으니까 sysout으로 출력해야한다
	//결론은 함수는 한가지 기능만해야하는데 string sysout 둘다하면 두개의 기능 하니까 string은 return이랑
	//void는 sysout으로 출력기능만한다.
}
