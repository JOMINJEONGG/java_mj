package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		//버블 정렬 예제 => 바로 옆이있는 것과 비교해서 큰 수를 뒤로 보낸다, 방식은 간단하지만 효율이 좋지 않다
		int arr[] = {1, 4, 7, 9, 2, 8, 3, 6,};
		Array.printArray(arr);
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			//-1안해도 결과는 같은데 한 번이라도 덜 출력할고
			for(int j = 0 ; j < arr.length-1-i ; j++) {
				//length-1인 이유 n까지이면 n-1까지 비교하기 때문
				//-i추가하면 반복횟수를 한 번이라도 줄일 수 있다
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}//부등호 방향을 바꾸면 오름차순 내림차순 내마음대로 설정 가능
			}
			Array.printArray(arr);
		}
		//integer은 class 이기 때문에 정수에 null까지 가능
		//int는 정수만
		Integer arr2[] = {1, 4, 7, 9, 2, 8, 3, 6};
		//Arrays.sort(arr2); 오름차순
		Arrays.sort(arr2, Comparator.reverseOrder());//내림차순
		for(Integer tmp : arr2) {
			System.out.println(tmp + " ");
		}

	}
}
