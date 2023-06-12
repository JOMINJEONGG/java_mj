package day9.classex;

import java.util.Scanner;

public class StudentScoreManager {

	public static void main(String[] args) {
		/* 클래스명 객체명 = new 클래스명();
		 * 위의 클래스명=생성자(생성자는 보통 class 이름과 동일)=>생성된 객체를 초기화하는 예약어
		 * ex)Student std1 = new Student();
		 * new : 객체를 생성하는 예약어
		 * Student() : 생성된 객체를 초기화하는 예약어
		 * std1은 인스턴스, 객체라고 하며 참조변수이다.
		 * 객체 : 의사나 행위가 미치는 대상(현실)
		 * 클래스 : 객체를 코드로 구현한 것
		 * 인스턴스 : 클래스를 이용해 만든 것, 객체라고함
		 * */
		Scanner sc = new Scanner(System.in);//기본생성자 = 디폴트 생성자가 없는 경우
		sc.close();
		//korScore는 인스턴스, 객체라고 표현 / 현실세계 있는 정보를 객체라고 표현
		//Score1 korScore = new Score(1,2,"korean Language"); 
		Score1 korScore = new Score1();
		/* 매개 변수 없어서 기본생성자 = 디폴트 생성자 ()안이 비어있음, 매개변수가 없는 생성자
		 * 클래스의 생성자가 하나도 없을 때 자동완성
		 * */
		korScore.title = "korean Language";
		korScore.grade = 1;
		korScore.semester = 1;
		Score1 engScore = new Score1(1,2,"English");
		System.out.println(engScore.title);
		/* <멤버변수 호출방법>
		 * 객체명.멤버변수 = 값;
		 * 객체명.메서드명(매개변수들);
		 * =>static이라는 키워드 있으면 객체명 안써도됨
		 * */
	}
}
//성적 클래스
class Score1{
	 String title;//과목명
	 int grade;//학년
	 int semester;//학기
	 double total;//총점수
	 double mid;//중간고사
	 double finalExam;//기말고사
	 double performance;//수행평가

	 /* Score1 클래스의 기본생성자 => 생성자가 없으면 이 기본생성자가 자동 생성됨
	  * 생성자는 매서드와 다르게 리턴타입 없고 class명과
	  * 멤버변수는 자동으로 기본값으로 초기화됨, 지역변수는 초기화 시켜줘야함
	  * */
	 public Score1() {
		 //멤버변수여서 초기화되면 밑의 값처럼 나옴
		 /* title의 기본값은? null
		  * grade의 기본값은? 0
		  * total의 기본값은? 0.0
		  * */
		 title = "";//"" 과 null은 의미가 다름
		 grade = 1;
		 semester = 1;
	 } 
	 //여러 종류의 생성자를 만들 수 있다, 클래스에 생성자가 2개 이상인 경우 => 생성자 오버로드(오버로딩)
	 public Score1(int _grade, int _semester, String _title) {
		 grade = _grade;
		 semester = _semester;
		 title = _title;

	 }
	 //우클릭 Source -> select Generate getter and setters to create -> all -> public
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
		super();
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



/* ex)
 * 클래스는 멤버변수, 메서드, 생성자로 구성
 * 멤버변수 : 속성
 * 메서드 : 기능
 * 
 * 자동차
 * 속력을 올림
 * 자동차 섹상을 검은색
 * 
 * 자동차				 : 클래스
 * 속력을 올림 		 : 메서드
 * 자동차 색상 		 : 멤버변수
 * 공장에서 막 나온 자동차 : 생성자
 * */
