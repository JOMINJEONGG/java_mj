package day11.homework;

import java.util.Scanner;

import array.Array;

public class BaseballGameEx {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현하세요
		 * 1~9 사이의 중복되지 않은 세 수를 맞추는 게임
		 * 규칙
		 * B : 같은 숫자가 있지만 위치가 다름
		 * S : 같은 숫자가 있고 위치가 같음
		 * 30 : 일치하는 숫자가 하나도 없음
		 * */
		/* 예 : 
		 * 랜덤 숫자 : 1 9 5 
		 * 사용자 : 1 2 3
		 * 1S
		 * 사용자 : 4 5 6
		 * 1B
		 * 사용자 : 1 2 9 
		 * 1S1B
		 * 사용자 : 2 3 4
		 * 30
		 * 사용자 : 1 9 5
		 * 3S
		 * Good!!
		 * */
		int com[] = new int[3]; //랜덤으로 생성 된 수를 저장할 배열
		int user[] = new int[3]; // 사용자가 입력한 수를 저장할 배열
		int min = 1, max =9;
		int strike = 0;//스트라이크 개수
		int ball = 0;//볼의 개수
		Scanner sc = new Scanner(System.in);
		
		//맞춰야할 숫자 3개 랜덤으로 생성(중복되지 않게)
		Array.createRandomArray(min, max, com);
		//Array.printArray(com); //나중에 주석처리
		//반복문
		do {
			//사용자가 숫자 3개 입력
			System.out.print("user : ");
			for(int i = 0 ; i <user.length ; i++) {
				user[i] = sc.nextInt();
			}
			//사용자 입력 체크
			if(Array.arryCheck(user)) {
				System.out.println("You must not enter the same number!");
				continue;
			}
			//판별
			/*strike = 0;
			ball = 0;*/ //->필요없음 지우기
			
			//스트라이크 개수 판별
			strike = strike(com,user);
			
			//볼의 개수 판별
			ball = ball(com,user);
		
			//스트라이크과 볼의 개수에 맞게 출력
			printResult(strike,ball);
		}while(strike < 3);	
		
		System.out.println("Good!");
		sc.close();
	}
	
	/**스트라이크 개수를 판별하는 메서드
	 * =>두 배열에서 같은 번지의 있는 값들이 몇개 같은지 알려주는 메서드
	 * 매개변수 : 두 배열 = > int arr1[], int arr2[]
	 * 리턴타입 : 같은 번지에 있는 값들이 몇개 같은지 => 몇개 => 정수 => int
	 * 메서드명 : strike
	 * */
	public static int strike(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 1라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//배열의 개수가 다른 경우 작은 크기의 배열을 기준으로 비교하기 위해 size 계산
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		
		int count = 0;//스타라이크 개수
		for(int i = 0 ; i< size ; i++) {
			//같은 번지에 있는 값들이 서로 같으면(스트라이크이면)
			if(arr1[i]== arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	/**볼의 개수를 판별하는 메서드
	 * =>두 배열에서 다른 번지의 있는 값들이 몇개 같은지 알려주는 메서드
	 * 매개변수 : 두 배열 = > int arr1[], int arr2[]
	 * 리턴타입 : 다른 번지에 있는 값들이 몇개 같은지 => 몇개 => 정수 => int
	 * 메서드명 : ball
	 * */
	public static int ball(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 1라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		//다른 번지를 비교해서 찾아도 되지만 
		//두 배열에서 같은 숫자의 개수에서 스트라이크 개수를 뺴면 볼의 개수
		
		//1 or 2 둘 중 하나 쓰기
		//1)
		for(int tmp : arr1) {
			//배열1에서 깨난 값이 arr2에 있으면 개수를 증가
			if(Array.contains(arr2, tmp, arr2.length)) {
				count++;
			}
		}
		return count - strike(arr1, arr2);
		
		//2)
		//이중 반복문을 이용해서 다른 번지를 비교하는 코드
		/*for(int i = 0 ; i<arr1.length ; i++) {
			for(int j = 0 ; j<arr1.length ; j++) {
				if(i == j) {
					continue;
				}
				if(arr1[i] == arr2[i]) {
					count++;
				}
			}
		}
		return count;
		*/
	}	
	/**스트라이크와 볼의 개수가 주어지면 결과를 출력하는 메서드
	 * 매개변수 : 스트라이크 개수, 볼의 개수 => int strike, int ball
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printResult
	 * */
	public static void printResult(int strike, int ball) {
		if(strike !=0) {
			System.out.print(strike + "S");
		}
		if(ball !=0) {
			System.out.print(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("3O");
		}
		System.out.println();
	}
}	