package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		/* 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요
		 * 서로소 : 최대 공약수가 1인 두 수의 관계
		 * input 2 numbers : 3 4
		 * Disjoint!(서로소)
		 * input 2 numbers : 8 4
		 * Not disjoint!(서로소 아님)
		 * */
		 /* 반복횟수 : i는 1부터(약수는 1부터여서) num1까지 1씩 증가
		 * 규칙성 : i가 num1에 약수이고 i가 num2의 약수이면 i를 gcd에 저장
		 * 		  num1을 i로 나누었을 때 나머지가 0과 같고 
		 * 		  num2를 i로 나누었을때 나머지가 0과 같다면 
		 * 		  i를 gcd에 저장
		 * 반복문 종료 후 : gcd가 1이면 Disjoint 출력 아니면 Not disjoint를 출력
		 * */
		
		
		//옆에 분들이 한것 참고
		/* int num1, num2, count = 0;
		int i = 1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for( i = 1 ; i <= num1 ; i++ ){
			if( num1 % i == 0  && num2 % i == 0 ) {
				count++;
			}
		}
		switch(count){
		case 1 :
			System.out.println("Disjoint!");
			break;
		default :
			System.out.println("Not disjoint!");
		}
		sc.close();*/
		
		
		
		//day 6.practice의 GCD문제 끌어와서 풀이
		int num1, num2, i = 1, gcd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(i <= num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i; 
			}
			i++;
		}
		//gcd가 1이면 Disjoint를 출력하고, 아니면 Not disjoint를 출력
		if(gcd == 1/*gcd가 1이다 -> gcd는 1이다*/) {
			System.out.println("Disjoint!");
		}else {
			System.out.println("Not disjoint!");
		}
		sc.close();
		
		//선생님이 위의 식을 for문으로 바꾼것
		//i랑 gcd 는 위에서 초기화해서 빈공간으로 두어도 되나 찾아야하면 불편하니까 적어준것임
		/* for( i = 1, gcd = 1 ; i <= num1 ; i++ ){
			if( num1 % i == 0  && num2 % i == 0 ) {
				gcd = i;
			}
		 * */
	}

}
