package day10.singleton;

public class SingletonEx {

	public static void main(String[] args) {
		
		//public으로 생성자 만들면 이와 같이 바깥에서 호출해서 사용 가능하지만 private으로 하면 사용 불가능 
		//ㄴ> 이경우에는 new 연산자를 이용해 객체를 생성하고 생성자를 통해 초기화할 수 있음
		//하지만 private은 이렇게 못한다
		//SamsungCompany company = new SamsungCompany();
		SamsungCompany company1 = SamsungCompany.getInstance();
		SamsungCompany company2 = SamsungCompany.getInstance();
		System.out.println(company1); // 하나의 객체를 이용하여 둘이 주소가 같음
		System.out.println(company2);
	}
}

class SamsungCompany{
	
	//private은 생성자를 class 안에서 호출하니 아래와 같이 사용가능
	//내부에서 만들어서 밖에서 사용하라고 알려주는 식으로 해야함
	private static SamsungCompany company = new SamsungCompany();
	
	private String name;
	private String address;
	
	//싱글톤은 생성자를 private으로 만들기
	private SamsungCompany() {
		name = "Samsung";
		address = "korea";
	}
	
	//위에서 만들어진 객체를 내부에서 부를 수 있는 메서드를 만듬
	public static SamsungCompany getInstance() {
		return company;
	}
}