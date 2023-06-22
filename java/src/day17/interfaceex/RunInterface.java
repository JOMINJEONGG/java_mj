package day17.interfaceex;

public interface RunInterface {

		/*public final static=>자동으로 붙음 
		 * 변수앞에 final 붙으면 상수처리됨 int num; 이렇게 하면 오류, 상수 값 정의해줘야함 */
		int NUM = 10;//클래스 상수 => 클래스를 이용하여 호출
		/*public abstract*/void run(); // 추상메서드이기 때문에 구현 불가
		default void stop() {
			System.out.println("Program stop!");
		}
		/*디폴트 메서드 : 기본으로 기능이 제공되는 메서드
		 * 인터페이스의 메서드이지만 구현부가 있는 메서드default 키워드 이용
		 * 나오게 된 배경
		 * 기존에 만들어진 인터페이스에 새로운 메서드를 추가하게 되면 
		 * 이전에 해당 인터페이스를 사용하던 구현 클래스들에 에러가 발생
		 * 이러한 문제를 해결하기 위해 인터페이스에 뒤늦게 기능이 추가 되도 
		 * 에러가 발생하지 않도록 하기 위해 디폴트 메서드 이용
		 */
}
