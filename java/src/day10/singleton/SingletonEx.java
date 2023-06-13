package day10.singleton;

public class SingletonEx {

	public static void main(String[] args) {
		
		//public으로 생성자 만들면 이와 같이 바깥에서 호출해서 사용 가능하지만 private으로 하면 사용 불가능 
		//SamsungCompany company = new SamsungCompany();
		SamsungCompany company1 = SamsungCompany.getInstance();
		SamsungCompany company2 = SamsungCompany.getInstance();
		System.out.println(company1); // 하나의 객체를 이용하여 둘이 주소가 같음
		System.out.println(company2);
	}

}

class SamsungCompany{
	
	//private은 생성자를 class 안에서 호출하니 아래와 같이 사용가능
	private static SamsungCompany company = new SamsungCompany();
	
	private String name;
	private String address;
	
	//싱글톤은 생성자를 private으로 만들기
	private SamsungCompany() {
		name = "Samsung";
		address = "korea";
	}
	public static SamsungCompany getInstance() {
		return company;
	}
}