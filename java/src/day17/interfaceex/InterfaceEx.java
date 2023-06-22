package day17.interfaceex;

import day13.homework.controller.VocabularyNoteController;
import day15.practice.shop.controller.ShopManager;

public class InterfaceEx {

	public static void main(String[] args) {
		/* 인터페이스란 : 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할 추상 메서드와 상수로만 이루어짐*/
		/* 인터페이스를 이용하여 객체를 생성할 수 없음=> 추상메서드 있기 때문에*/
		//RunInterface run = new RunInterface();
		System.out.println(RunInterface.NUM);
		//=>정적메서드 : 객체 생성하지 않고도 인터페이스명을 통해 호출할 수 있기 때문에 생성 가능.
		
		//인터페이스를 구현한 구현클래스는 객체를 생성할 수 있음
		Run run = new Run();
		run.run();
		run.load();
		//구현클래스로 생성한 객체를 RunInterface가 관리할 수 있음
		//구현클래스가 인터페이스보다 클 수 밖에없다. 업케스팅으로 생각하면 됨
		RunInterface runInterface = new Run();
		runInterface.run();
		//runInterface.load(); => RunInterface에는 load가 추상메서드로 존재하지 않기 때문에 에러발생
		((Run)runInterface).load();
		//위의 코드는 Run클래스의 객체로 클래스 변환이 되었기 때문에 load()메서드를 호술 할 수 있음
		run(new ShopManager());
		//run(new VocabularyNoteController()); 
		//단어장, 판매관리 () 괄호안에 new ShopManager() 넣으면 이전꺼 불러 올 수 있음 => 인터페이스와 다형성 다시 공부하기!!!!!!!!
	}

	/* 인터페이스 매개변수 다형성
	 * - 매개변수를 인터페이스의 객체로 선언하면 
	 * 	 호출 할 때 매개 변수로 구현 클래스들의 객체들이 올 수 있음
	 * 	=>다양한 클래스들의 객체가 올 수 있다.
	 * - RunInterface의 객체를 매개변수로 하면 RunInterface를 구현한 
	 * 	 구현 클래스인 ShopManager, VocabularyNoteController의 객체가 와서 
	 * 	 프로그램을 실행할 수 있다.
	 * */
	public static void run(RunInterface program) {
		//프로그램 실행
		program.run();
	}
	//위의 매서드에서 단어장, 판매관리 가 들어와서 Run이 들어와서 이 메서드를 실행하고 싶다
}

interface Stop{
	void stop();
}

//구현 클래스 : 인터페이스를 구현한 클래스
/* 구현클래스는 인터페이스의 모든 추상메서드를 반드시 오버라이딩 해야함 
 * 위의 RunInterface class의 void run을 오버라이딩 해야함
 * 구현 클래스는 여러 인터페이스를 구현할 수 있음
 * implements 예약어 이용하여 구현 클래스를 생성
 * */

class Run implements RunInterface, Stop{

	public void load() {
		System.out.println("loading....");
	}

	@Override
	public void run() {
		System.out.println("Program start!");
		stop();
	}

	@Override
	public void stop() {
		System.out.println("Program Stop!");
	}
}
/* 추상메서드 구현부 없음 => 반드시 오버라이딩 해여함
 * 정적메서드는 구현부가 있음(static 키워드) => 인터페이스명을 통해 호출
 * 디폴트 메서드는 구현부 있음(default 키워드) = >오버라이딩 해도 되고 안해도됨
 * */