package day20.generic;

public class Student<T extends Number> {
	int grdae, calssNum, num;
	String name;
	T kor, math, eng;

	//제네릭 클래스 하나 말고 여러개 올 수 있음 추가할거면 <T, K> 
	//이와 같이 ,해서 추가하기
}