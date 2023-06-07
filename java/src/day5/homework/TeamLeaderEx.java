package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		/* 30명의 학생이 있는 반에서 1번부터 연속된 번호를 가진 3명의 학생이 1조가 되도록 나누었다. 이 때 가장 큰 번호인 학생이 조장이 된다.
		 * 학생 번호가 주어졌을 때 조장인지 조원인지 판별하는 코드를 작성하세요.
		 * (switch문으로)
		 * input student number : 
		 * 1
		 * Student number 1 is a member of the team.
		 * input student number : 
		 * 6
		 * Student number 6 is the team leader.
		 * */
		
		/* 1번부터 연속된 번호를 가진 3명이서 한 조, 그 중 가장 큰 번호 학생이 조장
		* 3, 6, 9... 3의 배수들이 조장이됨
		* 3으로 나눴을 때 나머지가 0인 것이 조장이 된다.
		**/
		//선생님거랑 똑같음 처음으로 맞았다!!!
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input student number : ");
		num = sc.nextInt();
		
		switch(num % 3) {
		case 0 : 
			System.out.println("Student number " + num + " is the team leader."); 
			break;
		default:
			System.out.println("Student number " + num + " is a member of the team."); 
		}
		
		sc.close();
	}

}
