package day9.classex;

import day9.classex2.B;

public class AccessModifierEx {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();//같은 패키지가아니어서 B에 빨간 줄 뜸 import해서 다른 패키지에 있는거 가져오기 scanner하는 것 처럼
		
		/* num3은 접근제어자가 public => num3에 커서 가져다대면 녹색 동그라미임 public이라는 뜻임
		* AccessModifier 클래스와 A 클래스는 같은 패키지에 있는 클래스
		* AccessModifier 클래스와 B 클래스는 다른 패키지에 있는 클래스
		* num3은 접근제어자가 public. 같은 패키지 다른 패키지 여부와 상관없이 사용할 수 있음
		*/
		a.num3 = 10;
		b.num3 = 20;
		
		/* num2는 접근제어자가 디폴트(생략됨).
		 * 다른 패키지에 있는 B 클래스의 객체에 있는 num2는 접근이 안됨
		 * */
		a.num2 = 10;
		//b.num2 = 20; => 에러발생 주석처리
				
		/* num1은 접근제어자가 private.
		 * 같은 패키지이든 아니든 다른 클래스에서 접근할 수 없음
		 * */
		//a.num1 = 10; => 에러발생 주석처리
		//b.num2 = 20; => 에러발생 주석처리
		
		//위의 a.num1 = 10;을 setter를 통해 값을 변경
		a.setNum1(10);
		
		//a.num1 = 10; 을 getter를 통해 값을 가져옴
		System.out.println(a.getNum1());
	}
}
/*정보은닉 : 클래스 내부에서 사용할 변수나 메서드를 private으로 선언해서 외부에서 접근하지 못하도록 막는것
* '일반적으로' 멤버변수는 private으로 선언, 메서드는 public으로 선언, 생성자는 public. 싱글톤의 경우 private*/
class A{
	private int num1;
	int num2;
	public int num3;
	
	/**클래스 A의 객체 정보 중 num1을 출력하는 메서드
	 * 매개변수 : 없음 => 이미 알고있는 내정보 num1이기 때문에 
	 * 리턴타입 : 없음 => void
	 * 메서드명 : print
	 * */ 
	public void print() {
		//num1은 private이기 때문에 A클래스의 메서드에서 호출 될 수 있다.
		//이미 알고있는 내정보를 활용하는 경우 static이 안붙어 있어도 매개변수로 전달받지 않아도됨
		System.out.println(num1);
	}

	//죄수들은 면회를 직접가야만 볼 수 있기 때문에 교도소에 직접 간다 생각해보자
	//private으로 된 num1에 접근하기 위해 getter를 추가
	//num1 값보고 int 맞춰서 쓰기
	public int getNum1() {
		return num1;
	}
	
	//private으로 된 num1에 값을 변경하기 위해서 setter를 추가
	//setter는 void쓰고 ( )안의 위의 num1값이 int면 int써주기
	public void setNum1(int _num1) {
		num1 = _num1;
	}
}
