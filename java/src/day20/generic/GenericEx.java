package day20.generic;

//import java.util.Scanner;

public class GenericEx {

	public static void main(String[] args) {
		Student<Integer> std = new Student<Integer>();
		//뒤에 <Integer>안넣어도 무관하지만 앞뒤에 같이 써주는게 좋다
		//<>안에는 클래스 이름이 들어가야한다. 기본자료형 올 수 없다.
		std.kor = 10; // 10.0 넣으면 에러발생 위에서 Integer썼기 때문에
		Student<Double>std2 = new Student<Double>();
		std2.kor = 10.0;
		/*
		Student<Scanner> std3 = new Student<>();
		std3.kor = 10;
		*/
		//정수와 관련없는 Scanner가 제네릭으로 오게되면 kor, math, eng 정수를 저장 할 수 없어서 
		//10에 빨간줄 오게된다. 때문에 제한을 하는 것이 좋을 때가 있다.
		
		/*<T extends 클래스A>
		 * T로 들어 올 수 있는 클래스의 종류를 클래스A와 클래스A의 자식 클래스들만 올 수 있게 제한
		 * <T super 클래스A>
		 * 클래스 A와 클래스A의 조상 클래스들만 T에 올 수 있음
		 * */
		
		print(std2);
		GenericEx.<Double>print(std2);//이게 정석임
		GenericEx.print(std2);//std2가 Double로 되어 있어서 print의 T를 Double이라고 추정할 수 있어서 <Double>생략 가능	
	}
	
	//학생 정보를 출력하는 메서드
	public static <T extends Number> void print(Student<T> std) {
		System.out.println(std.grdae);
		System.out.println(std.calssNum);
		System.out.println(std.num);
		System.out.println(std.name);
		System.out.println(std.kor);
	}	
}