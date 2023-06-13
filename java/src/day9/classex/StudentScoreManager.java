package day9.classex;

import java.util.Scanner;

public class StudentScoreManager {

	public static void main(String[] args) {
		/* 클래스명 객체명 = new 클래스명();
		 * 생성자(생성자는 보통 class 이름과 동일)
		 * =>생성된 인스턴스(객체)의 멤버변수나 상수를 초기화하는 것
		 * =>메서드와 비교했을 때 리턴타입이 없음 => void아니고 생략
		 * =>편리해서 쓴다, 멤버를 한번에 쉽게 초기화 할 수 있어서
		 * 
		 * ex)Student std1 = new Student();
		 * new : 객체를 생성하는 예약어
		 * Student() : 생성된 객체를 초기화하는 예약어
		 * std1은 인스턴스, 객체라고 하며 참조변수이다.
		 * 객체 : 의사나 행위가 미치는 대상(현실)
		 * 클래스 : 객체를 코드로 구현한 것
		 * 인스턴스 : 클래스를 이용해 만든 것, 객체라고함, 실제로 사용할 수 있도록 생성된 클래스
		 * */

		Scanner/*클래스*/ sc/*객체*/ = new/*연산자*/Scanner/*생성자*/(System.in);
		//ㄴ>[기본생성자 = 디폴트 생성자]가 아닌 경우(System.in) 괄호 안에 매게변수 있음 넘겨받을 정보가 있는것
		sc.close();
		
		//korScore는 인스턴스, 객체라고 표현 / 현실세계 있는 정보를 객체라고 표현
		Score1 korScore = new Score1();
		//new를 통해 생성한 후 Score1는 생성된 객체의 멤버들을 초기화함(멤버변수나 상수를 초기화) 밑의 class의 값을 초기화
		/* 매개 변수 없어서 [기본생성자 = 디폴트 생성자]()안이 비어있음->정보를 넘겨주지 않음, 매개변수가 없는 생성자
		 * 클래스의 생성자가 하나도 없을 때 자동으로 추가 but 생성자가 하나라도 있으면 기본생성자 안만들어짐
		 * */
		korScore.title = "korean Language";
		korScore.grade = 1;
		korScore.semester = 1;//국어를 1학년 1학기 국어
		//Score1 korScore = new Score(1,2,"korean Language");
		//이와같이 한 줄로 쓸 수 있는데 기본생성자로 쓰기 위해서는 4줄로 써야함
		//기본생성자는 초기화를 한 번에 편리하게 하기위해서 쓴다
		
		Score1 engScore = new Score1(1,2,"English");
		//이것은 생성자 오버로딩으로 1학년 2학기 영어성적을 바로 불러온것
		
		System.out.println(engScore.title);
		/* <멤버변수 호출방법>
		 * 객체명.멤버변수 = 값; => ex)위의 줄 korScore.grade = 1; // 대체로 특별한 경우만 사용
		 * ㄴ>대체로 private으로 호출하여 이와같이 직접 불러올일이 드물기 때문에 
		 * 객체명.메서드명(매개변수들);
		 * =>static이라는 키워드 있으면 객체명 안써도됨
		 * */
	}
}
//성적 클래스
//@Data 만 추가해도 getter and setters자동으로 생성됨
class Score1{
	//밑의 title, grade...등은 멤버변수임
	 String title;//과목명
	 int grade;//학년
	 int semester;//학기
	 double total;//총점수
	 double mid;//중간고사
	 double finalExam;//기말고사
	 double performance;//수행평가
	 //앞에 접근제어자 아무것도 안쓰여있음 이것들은 (default)임

	 /* 기본생성자는 일반적으로 특별한 일이 없으면 public으로 시작함
	  * 메서드 : public 리턴타입 메서드명(매개변수들){
	  * }
	  * 생성자 : public 메서드명(매개변수들){
	  * }
	  * 메서드와 기본생성자의 구조가 다름 메서드는 리턴타입이 있으나 생성자는 없음
	  * 생성자는 메서드명이 class 이름과 똑같음 또한 기본생성자는 매개변수가 없는것이어서
	  * public Score1(){
	  * }
	  * 이렇게 쓴다
	  * Score1 클래스의 기본생성자 => 생성자가 없으면 이 기본생성자가 자동 생성됨
	  * 멤버변수는 자동으로 기본값으로 초기화됨, 지역변수는 초기화 시켜줘야함
	  * */
	 public Score1() {
		 //멤버변수여서 초기화되면 밑의 값처럼 나옴
		 /* title의 기본값은? null
		  * grade의 기본값은? 0
		  * total의 기본값은? 0.0
		  * */ 
		 //이안에서 하는 작업 없으며 멤버 변수를 초기화하겠다하면 굳이 작업을 할 필요 없음
		 //하지만 기본값이 아닌것으로 초기화 작업을 할거면 밑에 처럼 초기화하기
		 title = "";//"" 과 null은 의미가 다름
		 grade = 1;
		 semester = 1;
	 } 
	 //여러 종류의 생성자를 만들 수 있다, 클래스에 생성자가 2개 이상인 경우 => 생성자 오버로드(오버로딩) 
	 //=> 다양한 경우를 대비해서 초기화하기 위해 사용 ex) 10개 멤버 중 5개만 초기화하고싶을때
	 //생성자가 무조건 public은 아님 private인 경우도 있는데 드물고 나중에 설명해주실 예정임
	 public Score1(int _grade, int _semester, String _title) {
		 grade = _grade;
		 semester = _semester;
		 title = _title;
	 }
	 //우클릭 Source -> select Generate getter and setters to create -> all -> public
	 //getter and setters 자동으로 만들어짐
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getMid() {
		return mid;
	}
	public void setMid(double mid) {
		this.mid = mid;
	}
	public double getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}
	public double getPerformance() {
		return performance;
	}
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	 //생성자 만들어주는 항목
	 //우클릭 Source -> select Constructor using Fields
	public Score1(String title, int grade, int semester, double total, double mid, double finalExam,
			double performance) {
		this.title = title;
		this.grade = grade;
		this.semester = semester;
		this.total = total;
		this.mid = mid;
		this.finalExam = finalExam;
		this.performance = performance;
	}
}
//학생 클래스
class Student1{
	 String name;//이름
	 String residentNumber;//주민번호
	 int grade;//학년
	 int classNum;//반
	 int number;//번호
	 int admissionYear;//입학년도
	 Score1 korScore, engScore, mathScore;//국어, 영어, 수학 성적 =>배열이라는것을 안배워서 약간 미완성?임
}
	
/* 메서드는 메서드안에 메서드를 못넣음 
 * class는 class안에 class를 넣을 수 있음*/


/* 클래스는 멤버변수, 메서드,생성자로 구성
 * 멤버변수 : 속성
 * 메서드 : 기능
 * 
 * Ex)
 * 자동차
 * 속력을 올림
 * 자동차 색상을 검은색
 * 
 * 자동차				 : 클래스
 * 속력을 올림 			 : 메서드
 * 자동차 색상 			 : 멤버변수
 * 공장에서 막 나온 자동차 : 생성자
 * */
