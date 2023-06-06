package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/* UpDown게임
		 * 1~100사이에 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		 * 랜덤한 수 : 45
		 * input : 50
		 * Down!
		 * input : 40
		 * Up!
		 * input : 45
		 * Good!
		 * */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		int num = 45;
		num= sc.nextInt();
		while(num == 45 && num > 0 && num < 100) {
			int min = 1, max = 100;
			int random = (int)(Math.random() * (max-min+1) + min);
			System.out.println(Math.random());
			min = sc.nextInt();
			max = sc.nextInt();
			random= sc.nextInt();
			switch(num) {
			case 50:
				System.out.println(num + "Down!");
				break;
			case 40:
				System.out.println(num + "Up!");
				break;
			default:
				System.out.println(num + "Good!");
			}
		}
		sc.close();
	}

}
