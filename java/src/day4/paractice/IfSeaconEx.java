package day4.paractice;

import java.util.Scanner;

public class IfSeaconEx {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3, 4 ,5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10, 11 : 가을
		 * 12, 1, 2 : 겨울
		 * 그 외 : 잘못된 월
		 * 월이 3이거나 월이 4이거나 월이 5이면 봄이라고 출력하고(3과 같거나 4와 같거나 5와 같거나) => (월이 3이상이고 5이하이면)
		 * 월이 6이거나 월이 7이거나 월이 8이면 여름이라고 출력하고(6과 같거나 7와 같거나 8와 같거나) => (월이 6이상이고 8이하이면)
		 * 월이 9이거나 월이 10이거나 월이 11이면 가을이라고 츨력하고(9과 같거나 10와 같거나 11와 같거나) => (월이 9이상이고 11이하이면)
		 * 월이 12거나 월이 1이거나 월이 2이면 겨울이라고 출력하고(12과 같거나 1와 같거나 2와 같거나) => (월이 12이거나 월이 1이상이고 2이하이면)
		 * 아니면 잘못된 월이라고 출력
		 * */

		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();
		
		//월이 3이상이고 5이하이면 봄이라고 출력
		if(month >=3 && month <=5) {
			System.out.println(month + "spring");
		}else if(month >=6 && month <=8) {
			System.out.println(month + "summer");
		}else if(month >=9 && month <=11) {
			System.out.println(month + "fall");
		}
		//월이 12이거나 월이 1이상이고 2이하이면
		//&& 와 || 섞여있는 경우 문제가 될 수 있다. 논리연산자는 우선순위 같아서 앞에부터 순서대로 묶여서 먼저 해야할 부분에 괄호를 치는 것이 좋다
		//이번에는 범위가 작아서 크게 문제가 되지 않음, 먼저 해야하는 부분이 뒤라면 괄호를 치는 것이 좋다
		else if(month ==12 || (month >= 1  && month <= 2)) {
			System.out.println(month + " winter");
		}else {
			System.out.println(month + "wrong month");
		}
		
		//월이 3이거나 월이 4이거나 월이 5이면 봄이라고 출력하고
		if(month == 3 || month == 4 || month == 5){
			 System.out.println("spring");
		}else if(month == 6 || month == 7 || month == 8){
			 System.out.println("summer");
		}else if(month == 9 || month == 10 || month == 11){
			 System.out.println("fall");
		}else if(month == 12 || month == 1 || month == 2){
			 System.out.println("winter");
		}
		//아니면 잘못된 월이라고 출력
		else {
			System.out.println("wrong month");
		}
		sc.close();
	}

}
