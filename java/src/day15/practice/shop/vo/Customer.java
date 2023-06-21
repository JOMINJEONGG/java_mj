package day15.practice.shop.vo;

import lombok.Data;

@Data
public class Customer {

	//CID00001
	private String customerId;//고객이 추가되면 자동으로 발급
	private String name;
	private String phoneNumber;
	
	//고객 ID 발급을 위한 클래스 변수
	//등록된 고객수
	private static int count;
	//모든 객체가 공유하고 하나만 존재하는게 Static // 객체를 새로 만들어도 초기화되는 것이 아님 => 즉 공유가 됨 하나만 존재함(앖으면, 새로운 객체가 생성되어 초기화됨)
	
	//고객 아이디 앞부분
	private final static String CID = "CID";
	//고객 아이디 뒷부분 숫자의 최대 길이
	private final static int MAX_SIZE = 5;
	
	//final 붙이면 처음 정의된 상태가 변하지 않는 것을 보장한다는 의미. Java에서 변수들은 기본적으로 가변적인데, 변수에 final 키워드를 붙여 참조값을 변경 못하도록 해 불변성을 확보함
	

	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		generateCustomerId();//customerId 발급이 완료
		//MAX_SIZE = 20; => 이렇게 사용 안됨 위에서 초기화 했기 때문에 
	}

	private void generateCustomerId() {
		//1 => 00001 // 1를 최대 5자리까지 맞춰주는 작업
		//1 => "1"   // 숫자를 문자열 1로 만들기
		String num = "" + ++count;//문자열 + 정수 => 문자열
		//"1".length == 1
		int length = num.length();
		for(int i = 0 ; i < MAX_SIZE - length ; i++) {
			//A = A+B 일때 A+=B; 쓸 수 있다
			num = "0" + num;
		}
		customerId = CID + num;
	}
	
	public void print() {
		System.out.println("고객번호 : " + customerId);
		System.out.println("고객이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
}
