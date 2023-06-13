package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
		Student1.printCount();
		
		Student1 std1 = new Student1(1,1,1,"hong");//학생 객체 생성, 객체는 new 에서 만들어진다
		Student1.printCount();
		
		Student1 std2 = new Student1(1,1,2,"lim");
		Student1.printCount();
		
		//std2.studentCount = 4; //이렇게도 가능하지만 권장사항은 아님 노란색에 커서 가져다대면 위와 같이 바꾸라고 뜸
		//System.out.println(std1.studentCount); // 위에서 st2 1로 바꾸면 밑에 str1도 값이 바뀐다 static으로 공유하기 때문에
		std1.print();
		//Student1.print(); // 에러발생 static이 안붙어서 메서드들은 std1 이나 std2 와 같은 객체를 통해 호출해야함
		std2.print();
		
		System.out.println(std1); // 출력하면 객체가 다르기때문에 주소가 다름-싱글톤과 연관되서 보려고 출력해본 것 임
		System.out.println(std2);
	}

}
/* 주로 생성자나 메서드에서 멤버 변수와 매개변수를 구분할 때 사용
 * ★멤버변수와 매개변수 명이 같은 경우 반드시 this사용
 * 생성자가 여러개인 경우 다른 생성자를 호출할 때 사용
 * 다른 생성자 호출 시 첫 라인에 써야하며 다른 라인에 쓰면 에러 발생
 * this( ) 사용시 무한 루프 빠지지 않도록 조심해서 사용
 * */

class Student1{
	static int studentCount; 
	//ㄴ> 하나의 클래스로 만든 모든 객체가 '공통적인 값'을 가지는 속성이 있는 경우 static을 붙임 / 접근제어자 static자료형 변수명;
	//학생객체가 생성될때마다 이걸로 학생 수를 세기위함
	private int grade, classNum, number;
	private String name;
	
	//생성자
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 멤버변수와 같기 때문에 멤버 변수 호출할 때 this 반드시 붙여야함
	public Student1(int grade, int classNum, int number, String name) {
		//this(); => 이와같이 자기자신을 호출하면 무한루프 걸릴 수 있으니 조심하자
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	
	//기본생성자는 매개변수가 없기 때문에 this 안써도 됨
	public Student1(){
		//멤버변수와 이름이 같은 지역변수를 만들수도 있다(하지만 이렇게 사용하는것은 비추천)
		//int grade = 10;
		//this.grade = grade;
		this(1,1,1,"");//this 생성자는 이와같이 한줄로도 쓸 수 있다 this 아니면 하나하나 다 적어줘야함
		name = ""; // this라는 생성자 앞에 이와같이 다른 코드가 들어가면 안됨, 이 코드는 this 아래에 있어야함
		/* this.grade = 1;
		classNum = 1;
		number = 1;
		name = "";
		*/
	}
	
	//객체 메서드
	public void print() {
		System.out.println("=============");
		System.out.println("grade	 : " + grade);//객체 변수 사용 가능
		System.out.println("classNum : " + classNum);
		System.out.println("number   : " + number);
		System.out.println("name	 : " + name);
		//클래스 변수 사용 가능
		//System.out.println("count    :" + studentCount);
		//클래스 메서드 사용 가능
		//printCount();
	}
	//클래스 메서드 
	//=> 클래스 메서드는 객체가 생성되기전에 만들어지는데 객체 메서드는 객체가 할당되아야 만들어짐. 그래서 객체가 만들어지기 전인 클래스 메서드에서 객체 변수와 메서드를 사용할 수 없음
	public static void printCount() {
		//클래스 변수 사용 가능
		System.out.println("Reidtered student count : " + studentCount);
		//객체 변수(직접 불러서)사용 불가 => 객체 변수가 만들어지기 전에 부르기 때문에 사용 불가능
		//grade = 1;
		//객체 메서드 (직접 불러서)사용 불가능 => 객체 메서드가 만들어지기 전에 부르기 떄문에 사용 불가능
		//print();
		
		//직접사용은 불가능 하고 아래와 같이 객체를 만들어서 호출해서 사용은 가능
		Student1 std1 = new Student1();
		std1.name = "hong";
		std1.print();
	}
}