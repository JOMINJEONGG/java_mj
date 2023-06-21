package day16.abstractex;

public class AbstractEx {

	public static void main(String[] args) {
		//추상클래스를 이용하여 객체를 만들 수 없다.
		//A a = new A(); => 이와 같이 직접 생성은 안됨 에러발생
		A a = new A() {
			//구현되지 않은 추상메서드를 아래와 같이 객체 생성 후에 오버라이딩을 해주면 가능
			public void test() {
				System.out.println("class A Test.");
			}//=>오버라이딩
		};
		a.test();
		
		A a2 = new A() {
			public void test() {
				System.out.println("class A Test.");
			}
		};//같은 기능을 하는걸 또 만들고 싶을 때는 복붙하는 수 밖에 없음
		a2.test();
		//추상클래스는 객체를 만드는ㄴ데 하나의 객체만 만드는 경우에만 사용함 여러객체 만들때 사용 안함
		
		//ChildA1도 추상클래스 이기 때문에 ChildA1으로 객체를 생성할 수 없음
		//ChildA1 ca1 = new ChildA1();
		/* 추상클래스를 상속받은 ChildA2는 일반클래스이기 때문에 객체를 생성할 수 있다*/
		//모든 기능이 구현되어 있다면 => 객체 생성 가능
		//모든 기능이 구현되지 않다면 => 객체 생성 불가능 = 추상 메서드가 있다
		ChildA2 ca2 = new ChildA2();
		ca2.test();	
	
		//다형성 : 하나의 객체에 여러타입이 올 수 있는것
		a = ca2; //업캐스팅에 의해 ca2객체를 a가 다룰 수 있다
		a.test();
	}
}

//class ExString extends String{} => 사용 못함 

/* 추상클래스
 * 메서드 구현부가 없는 메서드!!!★★★ 
 * 메서드가 동작하기 위해서 어떤 매개변수가 필요하고, 
 * 동작이 끝난 후에 어떤 타입의 값을 전달하는지만!! 적어 놓은 것
 	구현부인 {} 대신 ;가 옴
	메서드에 abstract 키워드를 사용 
	abstract 리턴타입 메서드명(매개변수들);
 */
/* 추상클래스는 추상메서드를 가지고 있음
 * 추상 메서드가 있는 클래스에 abstract를 붙이지 않으면 에러 발생*/
abstract class A{
	public abstract void test();
	//메서드에 final이 붙으면 메서드 오버라이딩 불가능
	public final void test2() {
		System.out.println("Test2");
	}
}

/* 추상 클래스 상속 받는 방법 1
 * 부모에 있는 코드를 물려받는다 abstract 물려받는데 class 앞에 abstract없으면 에러 발생
 * => 추상클래스 A를 상속받은 자식 클래스는 추상클래스로 만들어야함
 */
abstract class ChildA1 extends A{
	/*
	//final 메서드를 오버라이딩 할 수 없음
	public void test2() {
		
	}
	*/
}

/* 추상 클래스 상속 받는 방법 2
 * 부모 클래스의 추상 메서드를 오버라이딩해서 재정의 해줌
 * */
class ChildA2 extends A{

	@Override // 생략가능 -> 문법체크해주는 것임 / 오버라이딩이아니라 오버로딩 될 수 있으니 체크해주는 것
	public void test() {
		System.out.println("Test");
	}
	
}