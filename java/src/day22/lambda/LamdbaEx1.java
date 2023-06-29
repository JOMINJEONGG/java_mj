package day22.lambda;

public class LamdbaEx1 {

	public static void main(String[] args) {
		InterfaceA a = new InterfaceA() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		System.out.println(a.getMax(10, 20));
		InterfaceA b = (num1, num2)->{
			return num1 >= num2 ? num1 : num2;
		};
		System.out.println(b.getMax(10, 20));
		
		//람다식 간소화
		/* 매개변수가 1개이면 ()를 생략
		 * 실행문이 1줄이면 {}를 생략
		 * 실행문이 1줄이면 return을 생략
		 * */
		InterfaceA c = (num1, num2)-> num1 >= num2 ? num1 : num2;
		System.out.println(c.getMax(10, 20));
	}

}

interface InterfaceA{
	int getMax(int num1, int num2);
}