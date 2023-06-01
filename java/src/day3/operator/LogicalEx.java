package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 95;
		/*성적이(score) 80점 이상이고, 성적이 90점 미만인가?
		 * score가 80보다 크거나 같고 score가 90보다 작다
		 * score가 80보다 크거나 같다 && score가 90보다 작다
		 * score >= 80 && score < 90
		 * */
		//말을 연산자 형태로 변경하는 게 어려울 수 있음 문제를 말로 차근차근 풀어쓰면서 나아가자
		
		System.out.println(score + "점은 B학점인가? " + (score >= 80 && score < 90));
		//System.out.println("Is " + score + "a B? " + (score >= 80 && score < 90));
		//&&(논리곱/두항) 두 항이 모두 참인 경우에만 결과 값이 참, 그렇지 않은 경우는 거짓

		int age = 21;
		//20세 이상이면 성인
		boolean isAdult = age >= 20;
		//age살은 미성년자인가?
		System.out.println("Is " + age + "years old a minor? " + !isAdult);
		//!(부정/단항 연산자), 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꿈
		
		//주민등록증은 있고, 운전면허증은 없음
		boolean hasIdCard = true; //주민등록증 가지고있는지
		boolean hasDriverCard = false; //운전면허증 가지고 있는지
		//토익 볼 수 있을까?(주민등록증이 있거나 운전면허증이 있으면 볼 수 있음) '거나'이면 떠올려보자
		System.out.println("Can I take TOEIC? " + (hasIdCard || hasDriverCard) );
		//||(논리합/두항) 두 항 중 하나의 항만 참이면 결과 값은 참, 두 항이 모두 거짓이면 결과 값은 거짓
	}

}
