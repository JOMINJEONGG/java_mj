package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

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
		//월을 입력
		System.out.println("input month : ");
		month = sc.nextInt();
		
		//월에 따른 계절을 출력(switch문으로)
		/*내가한것 
		 * switch(month) {
		case 3, 4, 5:
			System.out.println("spring");
			break;
		case 6, 7, 8 :
			System.out.println("summer");
			break;
		case 9, 10, 11 :
			System.out.println("fall");
			break;
		case 12, 1, 2 :
			System.out.println("winter");
			break;
		default:
			System.out.println("wrong month");
		}*/
		
		 switch(month) {
		 //month가 1, 2, 12일 떄 1의 실행문이 실행이 되서 겨울이 출력
			case 1: case 2: case 12:
				System.out.println("winter"); //12의 실행문임 1, 2는 실행문과 break문이 없이 12로 넘어간 것임 => case 1, 2 ,12: 도 가능하지만 JDK 7버전 이후로 가능 
				break; 
			case 3: case 4: case 5:
				System.out.println("spring");
				break;
			case 6: case 7: case 8:
				System.out.println("summer");
				break;
			case 9: case 10: case 11:
				System.out.println("fall");
				break;
			default:
				System.out.println("wrong month");
			}
		
		/*if(month ==1){
		 * }*/
		/*switch(month){
		case 1:
			break;}*/
		//if문의 ==만 swith문으로 쓸 수 있다. 위와 아래식이 같다.
		
		sc.close();
	}

}
