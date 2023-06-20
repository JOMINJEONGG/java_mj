package day14.Inheritance;

import lombok.Data;

public class ClassInheritanceEx {

	public static void main(String[] args) {
		/* 스마트폰은 폰이다 => 상속
		 * - 스마트폰 : 자식 클래스
		 * - 폰 : 부모 클래스
		 * 스마트폰은 카메라를 가지고 있다 => 포함
		 * - 스마트폰 : 클래스
		 * - 카메라 : 멤버변수
		 * 부모 클래스에게 상속받은 기능들은 사용할 수 있다
		 * - 접근제어자가 public, protected인 경우
		 * - 디폴트는 같은 패키지인 경우는 가능하나 다른 패키지이면 불가능
		 * */
		/*B is a A가 성립될 때 상속*/
		SmartPhone phone1 = new SmartPhone();
		phone1.call("010-1234-5678");
		phone1.answer("02-123-4567");
		System.out.println(phone1.getNum());
		//부모 클래스 멤버변수를 private으로 선언하면 @Data추가하여 getter로 접근
		//이렇게 안하면 아예 사용 못함 public이나 protected로만 사용 가능
		//부모클래스에서 같은 패키지의 클래스와 자식 클래스에서만 접근 가능하게 하고 싶을때 protected사용
		phone1.take();
		
		//다운캐스팅 : 안되는 경우
		Phone p1 = new Phone("010-123-4567");
		//문법적으로 에러가 발생하지 않으면 예외가 발생 : 다운캐스팅이 안되는 경우이기 때문
		//SmartPhone c1 = (SmartPhone) p1;
		if(p1 instanceof SmartPhone) {
			SmartPhone c1 = (SmartPhone) p1;
			c1.call("국제번호");	
		}//위의 줄 instanceof 연산자 사용하면 사용가능
		//객체명 instanceof 클래스명 형태로 사용되며 결과는 true/false
		
		//다운 캐스팅 : 되는 경우
		//업캐스팅이 된 객체 p2
		Phone p2 = new SmartPhone(); // 업케스팅
		SmartPhone c2 =(SmartPhone)p2;
		c2.call("123-4567");
		
		/* 중요!!★
		 * 클래스의 형 변환 : 상속관계인 부모 자식 객체에서만 가능
			String -> SmartPhone(X)
			Phone -> SmartPhone(조건부로 가능)
			SmartPhone -> Phone(가능)
		 
		   <업캐스팅 + 묵시적 클래스 형변화>
			ㅁ=>부모 ㅁㅁ=>자식
			자식클래스의 객체를 부모 클래스의 객체로 변화하는 경우 자동으로 변환됨
			부모클래스명 객체명 = new 자식클래스 생성자();
			부모클래스명 객체명 = 자식클래스명;
			Phone p = new SmartPhone(); // 가능
			=>★이걸 더 많이 사용
			
			<다운캐스팅>
			부모 클래스의 객체를 자식 클래스의 객체로 형변환하는 경우 자동으로 안됨
			반드시(자식클래스명)으로 처리
			조건부로 가능
			-업캐스팅 된 객체를 다은 캐스팅 하는 경우만 가능
			부모클래스 객체명1 : new 부모클래스생성자();
			자식클래스 객체명2 : (자식클래스)객체명1;//안됨 에러 발생
			부모클래스 객체명1 : new 자식클래스생성자();//업케스팅
			자식클래스 객체명2 : (자식클래스)객체명1;//가능
			
			'객체명 instanceof 클래스명' 클래스 형변환이 가능한지 확인해줌 true, false로 결과나옴
		 * */
	}
}
@Data 
class Phone{
	private String num = "010-1111-5555"; //전화번호
	
	//전화걸기 기능
	public void call(String num) {
		System.out.println(num);//내가 전화를 거는 상대방 번호
		System.out.println("calling...");	
	}
	//전화 받기
	public void answer(String num) {
		System.out.println(num);//나한테 전화를 건 상대방 번호
		System.out.println("Answering...");
	}	
	public Phone(String num) {
		this.num = num;
	}
	//public Phone(){} // 생성자가 하나도 없으면 컴파일할 때 기본 생성자가 자동으로 추가
	
}/*부모 클래스의 생성자가 기본생성자로 자동으로 초기화되는데 눈에 보이지 않음*/

//상속받는 자식 class
class SmartPhone extends Phone{
	Camera camera = new Camera(); // 포함단게
	public void take(){
		camera.take();
	}
	public SmartPhone() {
		//부모 클래스의 생성자가 호출
		//super()를 이용하여 부모 클래스의 생성자를 직접 호출하지 않으면
		//기본 생성자인 super()가 자동으로 추가되고 호출이 됨
		//이 때, 부모 클래스의 기본 생성자가 없으면 에러가 발생
		//super();하면 에러발생
		super("");
		/* 부모클래스의 객체의 주소를 알고 있는 예약어
		 * 부모 클래스의 생성자를 호출하는 것
		 * 자식 클래스의 생성자에서 첫 줄에 씀
		 * 자식 클래스의 생성자는 반드시 부모 생성자를 호출
		 * 없다면 기본 부모 생성자인 super()가 생략된 것*/
	}
	@Override // 밑에 오는게 문법에 맞는지 체크 // 메서드 오버라이딩 : 부모 클래스에 있는 메서드를 재정의 하는 것
	//만약 매개 변수 String num2 추가하면 오버라이딩이 아니라 오버로딩임 어노테이션 붙이면 빨간줄 떠서 삭제함
	public void call(String num) {
		super.call(num);//이렇게 잘 쓰이진 않고 생성자 호출시에는 좀 쓰인다. 이런게 있다정도만 알기
		System.out.println("SmartPhone calling...");	
	}
}

class Camera{
	public void take() {
		System.out.println("take a picture");
	}
}