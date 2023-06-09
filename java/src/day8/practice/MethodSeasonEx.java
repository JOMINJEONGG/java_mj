package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

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
			
		Season(month);
		sc.close();
	}
	//내가 한 것 	
	public static void Season(int month) {
		switch(month){
		case 3, 4, 5 :
			System.out.println("Spring");
		break;
		case 6, 7, 8 :
			System.out.println("Summer");
			break;
		case 9, 10, 11 :
			System.out.println("Fall");
			break;
		case 12, 1, 2 :
			System.out.println("Winter");
			break;
		default:
			System.out.println("wrong month");
		}
	}
}
