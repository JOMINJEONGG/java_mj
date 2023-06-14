package day11.practice;

import java.util.Scanner;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		// 1~9 사이의 랜덤한 수를 중복되지 않게 3개 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요		
		int min = 1, max = 9;
		int [] arr = new int[3];
		
		//방법 1 : 9번지까지 있는 배열을 이용
		//장점 : 작업이 단순 || 단점 : 저장공간이 필요
		boolean checkArr[] = new boolean[10];
		for(int i = 0 ; i < 3 ; ) {
			int random = (int)(Math.random() * (max-min+1) + min);
			//checkrArr random번지에 있는 값이 false이면
			if(!checkArr[random] /*checkArr[random] == false 이렇게 써도 됨*/) {
				//random을 배열에 저장
				arr[i] = random;
				//i를 증가 
				i++;
				//checkrArr배열에 random번지에 있는 값을 true로 변경
				checkArr[random] = true;
			}
		}
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(arr[i]);
		}
		printArray(arr);
		System.out.println("========================");
		
		//방법 2 : 저장된 값들을 비교 => 이중 반복문 사용
		int count = 0;//현재 저장된 랜덤 수 개수
		int i = 0;//반복문에서 사용할 변수
		
		//반복횟수 정해져 있지 않아서 while문으로 작성해 보겠다~
		while(count < 3) {
			int random = (int)(Math.random() * (max-min+1) + min);
			//이미 저장된 랜덤수들과 하나하나 비교해서 같은게 있는지 확인하여
			//있으면 반복문종료
			//반복횟수 정해져있으니 for문으로~
			for(i = 0 ; i < count ; i++){
				if(random == arr[i]){
					break;
				}
			}
			/* 위 반복문에서 break를 만나지 않으면 i는 count일때 종료하기 때문에 
			 * 반복문 종료 후 i는 count와 같다
			 * 하지만 break를 만나서 중간에 빠져 나오면 i는 count보다 작다
			 * */
			if(i == count) {
				arr[count] = random;
				count++;
				//arr[count++] = random; => 위의 두줄과 같음
			}
		}
		printArray(arr);
		System.out.println("========================");
		
		//방법3 : 방법 2를 메서드로 변형
		count = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max-min+1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
			if(contains(arr, random, count)) {
					arr[count] = random;
					count++;
			}
		}
		System.out.println("========================");
		printArray(arr);
		
		//방법3 : 방법2를 메서드로 변형
		createRandomArray(min, max, arr);
		printArray(arr);
		System.out.println("========================");
	}	
	
	/*for(i = 0 ; i < 3 ; i++) {
	 * 		System.out.println(arr[i]);
	 * }
	 * 위의 것을 매서드로 만들어보자
	 * */
	/** 정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메서드
	 * 매개변수 : 밖에서 i를 알려준 의미가 없게 들어오자마자 i = 0 으로 해서 밖에서 알려줄 필요없음, i < 3 이거 알려줘야하고 arr[i]도 알려줘야함
	 * 			=> 배열, 배열의 개수 => int arr[], << int size -> 이건 length로 바꿨다 >> 
	 * 리턴타입 : 없음 => void // 출력은 없어~~
	 * 메서드명 : printArr 
	 * */
	public static void printArray(int arr[]) {
		int i;
		for(i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	/* 배열명.length로 배열의 크기를 알 수 있음
	 * 배열의 크기는 생성된 배열의 전체 크기이지 유효한 값이 들어있는 개수가 아님
	 * */
	
	/** 정수 num가 배열의 0번지부터 count개만큼 확인했을 때 중복된 값이 있는지 
	 * 없는지 알려주는 메서드
	 * 매개변수 : 중복을 확인할 배열, 비교할 정수 num, 비교할 개수 count
	 * 			=>int arr[], int num, int count
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메서드명 : contains
	 * */
	public static boolean contains(int arr[], int num, int count) {
		for(int i = 0 ; i < count ; i++){
			//중복되면 메서드를 종료하면서 중복됐다고 알려줌
			if(num == arr[i]){
				return true;
			}
		}
		//이 위치까지 왔다는건  return true를 못 만났다는 뜻이고
		//그 말은 중복되지 않았다는 뜻
		return false;
	}	
	
	/**min에서 max사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 매개변수 : 최소값, 최대값, 배열 => int min, int max, int arr[]
	 * 리턴타입 : 없음 => void
	 * 메서드명 : createRandomArray
	 * */
	public static void createRandomArray(int min, int max, int arr[]) {
		//배열이 생성되어 있지 않으면(배열이 null아면) 메서드 종료
		if(arr == null) {
			return;
		}
		//랜덤으로 만들오지는 수의 개수가 배열의 크기보다 작으면
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return;
			
		}
		int count = 0 ;
		while(count < 3) {
			int random = (int)(Math.random() * (max-min+1) + min);
			if(contains(arr, random, count)) {
				arr[count] = random;
				count++;
			}
		}
	} 
}