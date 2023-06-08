package day7.continueex;

public class EvenNumberEx {

	public static void main(String[] args) {
		//continue문을 이용한 10이하 짝수 출력 예제
		//continue문 오려면 앞에 조건식 와야함
		int i;
		
		for( i = 1 ; i <= 10 ; i ++) {
			//i기 홀수이면 건너뜀
			if(i % 2 != 0) {
				continue;
			 }
			 System.out.println(i);
		 }
		
		/*i = 1;
		while(i <= 10) {
			if(i % 2 != 0) {
				i++;
				continue; // 조건식으로 바로 가서 i++로 못거침 제대로 실행되기 위해서 if 안에 i++;넣어 줘야함
			 }
			 System.out.println(i);
			 i++;
		}*/
		//위의 식은 i++ 두 번 중복되어서보기 안좋음 아래와 같이 변경 가능 
		i = 0;
		while(++i <= 10) {
			if(i % 2 != 0) {
				continue; 
			 }
			System.out.println(i);
		}
		
	}

}
