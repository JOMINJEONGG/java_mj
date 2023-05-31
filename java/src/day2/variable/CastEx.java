package day2.variable;

public class CastEx {

	public static void main(String[] args) {
		//int pi = 3.14; 
		//3.14는 double형 리터럴이기 때문에 int에 저장할 수 없어 강제형변환을 해야함
		int pi = (int) 3.14;
		//3은 int형 리터럴이기 때문에 double형 변수에 저장할 수 있음, 자동형변환
		double num1 = 3;
		//int num2 = 123L;
		//123L은 long형 리터럴이기 때문에 int에 저장할 수 없어 강제형변환을 해야함
		//실제 데이터 분실이 없어도 값을 보고 하는 것이 아니라 타입을 보고 타입에 맞게 강제형변환을 해야함 
		int num2 = (int) 123L;
		
		System.out.println(pi);
		System.out.println(num2);
		//1/2는 문법에는 문제가 없지만 워하는 결과 얻기 위해서 강제형변환을 함.
		//강제형변환 안하면 값이 0이 나오고 형변환 하면 0.5가 나온다. 우리가 1/2의 값인 0.5를 얻기 위해서는 강제형변환해야함
		System.out.println((double)1/2);
	}

}
