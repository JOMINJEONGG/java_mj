package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		/* 월을 입력받아 월에 맞는 영어를 출력하세요. 단, 메서드 이용
		 * 예:
		 * input month :
		 * 3
		 * March
		 * */
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();
		
		String Calendar = getMonth(month);
		System.out.println(Calendar);
	
		sc.close();
	}
		/** 정수가 주어지면 영어로 달을 알려주는 메서드
		 * 매개변수 : 정수 => int month
		 * 리턴타입 : 영어 달 => String
		 * 메서드명 : getMonth
		 * */
	public static String getMonth(int month) {
		if(month == 1) {
			return "January";
		}else if(month == 2){
			return "February";
		}else if(month == 3){
			return "March";
		}else if(month == 4){
			return "April";
		}else if(month == 5){
			return "May";
		}else if(month == 6){
			return "June";
		}else if(month == 7){
			return "July";
		}else if(month == 8){
			return "August";
		}else if(month == 9){
			return "September";
		}else if(month == 10){
			return "October";
		}else if(month == 11){
			return "November";
		}else if(month == 12){
			return "December";
		}else {
			return "Wrong";
		}
		
	}
			
}
