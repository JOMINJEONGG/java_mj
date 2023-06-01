package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*정수 num를 입력받아서 num가 0인지, 음수인지, 양수인지를 판별하는 코드를 if문을 이용하여 작성하세요.
		 *num가 0이면 0이라고 출력하고 - 0과 같다
		 *num 음수이면 음수라고 출력하고 - 0보다 작다
		 *num 양수이면 양수라고 출력하는 - 0보다 크다 
		 *코드를 작성하세요*/
		int num;
		Scanner sc = new Scanner(System.in); // 입력받으라고 했으니까 scanner !!
		System.out.println("input number : ");
		num = sc.nextInt();
		
		/*int num;
		 * num = sc.nextInt();
		 * 위의 두개를
		 * int num = sc.nextInt(); 이렇게 한 번에 작성 해도된다
		 */

		if(num == 0) {
			System.out.println(0);
		} 
		if(num < 0) {
			System.out.println(num + " is a negative number ");
		} 
		// 음수 => 0보다 작다
		if(num > 0) {
			System.out.println(num + " is a positive number ");
		} 
		// 양수 => 0보다 크다
		sc.close();
	}

}
