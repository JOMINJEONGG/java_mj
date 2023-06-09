package day8.overloading;

public class Ex1 {

	public static void main(String[] args) {
		//println의 메서드 오버로딩
		/* 메서드 오버로딩 : 동일한 이름의 메서드가 여러개인 경우를 말함
		 * 매개변수가 다른데 기능은 같은 경우 메서드 오버로딩으로 같은 기능에서 이름만 다르게 사용가능
		 * 
		 * 메서드 오버로딩 만들기 위해서는
		 * 조건(결론:매개 변수가 다름)
		 * 1.매개변수 갯수가 다름
		 * 2.매개변수 타입이 다름
		 * 리턴 타입은 상관없이 매개변수가 달라야함!!
		 * */
		System.out.println(1); // println 커서 가져다대면 Parameters 보면 각각 int sting 등등.. 나옴 
		System.out.println("1");
		System.out.println(1.1);
		System.out.println('C');
		System.out.println(sum(1.1,1));
		System.out.println(sum(1,1.1));
		System.out.println(sum(1.1,1.1));
		System.out.println(sum(1,2,3));
	}	
	//매개 변수의 타입이 다른 경우 => 이와 같이 sum이라는 이름은 같은데 동작 가능
	public static int sum(int num1, int num2/*여기 안에 있는게 매개변수*/) {
		return num1 + num2;
	}
	public static double sum(double num1, int num2) {
		return num1 + num2;
	}//실수 + 정수니까 double
	public static double sum(int num1, double num2) {
		return num1 + num2;
	}//정수 + 실수니까 double
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}//실수 + 실수니까 double
	
	//리턴 타입만 다른 메서드는 오버로딩이 될 수 없다
	/*public static double sum(int num1, int num2) {
		return num1 + num2;
	}*/
	
	//매개 변수의 갯수가 다른 경우
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}
