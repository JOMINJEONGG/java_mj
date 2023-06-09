package day7.homework;

public class StartEx5 {

	public static void main(String[] args) {
		/* 	  *			i=1 공백=3	 		 *=1
		 *   ***		i=2 공백=2	 		 *=3
		 *  *****		i=3 공백=1	 		 *=5
		 * *******		i=4 공백=0	 		 *=7
		 * 					공백=half-i  	     *=2*i-1 
		 * 
		 *  *****		i=5 공백=1	 		 *=5 = 2*(3)-1 / 5+3=8
		 *   ***		i=6 공백=2			 *=3 = 2*(2)-1 / 6+2=8
		 *    *			i=7 공백=3			 *=1 = 2*(1)-1 / 7+1=8
		 *  				공백=i-half(4)	 *=2*(num+1-i)-1 = 2*(num-i)+1
		 * 이와 같이 출력되도록 반복문을 이용해보자
		 * */
		
		int num = 7;
		for(int i = 1 ; i <= num ; i++) {
			int half = (num + 1) / 2;
			//4줄 => (num + 1) /2
			if(i <= half) {
				//half-i개 공백 출려
				for(int j = 1 ; j <= half-i ; j++) {
					System.out.print(' ');
				}
				//2*i-1 출력
				for(int j = 1 ; j <= 2*i-1 ; j++) {
					System.out.print('*');
				}
				//엔터
				System.out.println();
			}	
			//3줄
			else {
				//i-half개 공백 출려
				for(int j = 1 ; j <= i-half ; j++) {
					System.out.print(' ');
				}
				//2*(num-i)+1 출력
				for(int j = 1 ; j <= 2*(num-i)+1 ; j++) {
					System.out.print('*');
				}
				//엔터
				System.out.println();
			}
		}
	}
}
