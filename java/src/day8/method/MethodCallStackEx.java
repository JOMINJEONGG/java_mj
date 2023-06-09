package day8.method;

public class MethodCallStackEx {

	public static void main(String[] args) {
		/* 함수(메소드) 호출 스택 예제*/
		method1(1);
		method4();
	}

	public static void method1(int a) {
		System.out.println(a);
		method2(a);
	}
	public static void method2(int a) {
		System.out.println(a-1);
		method3();
	}
	public static void method3() {
		System.out.println("end");
	}
	public static void method4() {
		System.out.println("a");
		method4();
	}//'재귀메서드' 스택이라는 공간에 꽉찰때까지 자기 자신을 계속 실행된다 => StacKOverflower발생
	//쌓이기 때문에 메서드가 종료했을 때 다른 메서드로 계속 쌓이지 않도록 해야함
}
