package day3.operator;

public class ConditionalEx {

	public static void main(String[] args) {
		//나이가 20살 이상이면 adult, 아니면 minor를 출력하는 코드를 작성하세요
		int age = 30;
		String str; //str이라는 참조형 변수를 만들것이다, 여기까지 집을 만들것이다
		
		str = age >= 20 ? "adult" : "minor";//str은 이런것이다 이 집에는 뭐가 있다 이렇게 배우기
		//조건식 ? 참일때 결과 : 거짓일때 결과
		//꼭 외워야할 연산자는 아니지만 알아두면 편리함
		System.out.println(age + " years old is a " + str);
		
	}

}
