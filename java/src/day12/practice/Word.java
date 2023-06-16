package day12.practice;

import lombok.Data;

/* 한 단어를 관리하는 클래스
 * - 단어
 * - 뜻들
 * */
@Data //getter, setter, toString, equals를 추가
/* Lombok을 이용하고 getter setter 추가하는 과정
 * 1. lombok.jar 다운로드
 * 구굴에서 lombok 검색 후 공식 홈페이지에서 다운로드
 * 2. lombok실행
 * 파일이 커피잔 모양인 경우 더블 클릭해서 실행
 * 아닌 경우 cmd 실행 - lombok.jar 파일이 다운로드 된 폴더를 찾아가서 경로 복사 	
 * 				   - cmd 창에 다음을 입력 => cd 경로
 * 				   - cmd 창에서 경로가 이동되면 다음을 입력 -> java -jar lombok.jar
 * 3. lombok 설치
 * 이클립스가 자동으로 인식된 경우 install/update 버튼을 클릭해서 설치
 * 아닌 경우 specify location..을 클릭해서 이클립스 설치된 경로로 이동해서 selec 버튼 클릭
 * 4. 이클립스 재시작
 * 5. 프로젝트의 lombok.jar 추가
 * 프로젝트 우클릭 Build path -> Configure build path 클릭
 * 탭 메뉴 중 libraries 클릭 -> Modulepath 클릭 -> Add External JARS.. 클릭
 * lombok.jar가 설치된 폴더로 가서 lombok.jar 선택 후 Apply and close 클릭 
 * 6. getter/setter가 필요한 클래스 위에 @Data 추가 후 import
 * */
public class Word{
	//멤버변수
	private String title;
	private String meaning[];
	private int meaningCount = 0;//뜻이 저장된 개수
	//생성자
	public Word(String title, String meaning) {
		this.title = title;
		this.meaning = new String[5];//기본 5개
		this.meaning[0] = meaning;
		meaningCount++;
	}	
	public Word(String title) {
		this.title = title;
		this.meaning = new String[5];//기본 5개
	}
	public Word(Word w) {
		this.title = w.title;
		this.meaning = new String[5];//기본 5개
		for(int i = 0; i < w.meaningCount ; i++) {
			meaning[i] = w.meaning[i];
		}
		meaningCount = w.meaningCount;
	} 
	
	//메서드
	/**단어와 뜻을 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메서드명 : print
	 * */
	public void print() {
		System.out.println("word : " + title);
		System.out.println("meaning : ");
		for(int i = 0 ; i < meaningCount ; i++) {
				System.out.println(i + 1 + ". " + meaning[i]);
		}
	}
	
	/**뜻을 추가하는 메서드
	 * 매개변수 : 추가될 뜻 => String meaning[]
	 * 리턴타입 : 없음 => void
	 * 메서드명 : addMeaning 
	 * */
	public void addMeaning(String meaning) {
		if(meaningCount == this.meaning.length) {
			System.out.println("It's all filled");
			return;
		}
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	}
	
	/**뜻을 제거하는메서드
	 * 매개변수 : 제거할 뜻의 번호 => int num
	 * 리턴타입 : 없음 => void
	 * 메서드명 : removeMeaning
	 * */
	public void removeMeaning(int num) {
		if(num > meaningCount || num < 1) {
			System.out.println("I can't work.");
			return;
		}
		//num-1번지부터 하나씩 당겨와서 덮어쓰기함.
		for(int i = num -1 ; i < meaningCount-1 ; i++) {
			meaning[i] = meaning[i + 1];
		}
		//마지막에 쓸모없는 데이터를 지움
		meaning[meaningCount - 1] = null; //이 작업은 안해도 됨-실행해도 결과는 차이 없음 => 안쓰는 값을 내버려둘건지 비워둘건지의 차이임
		//제거 됐으면 뜻 개수를 하나 줄임
		meaningCount--;
	}
	
	/**수정할 뜻의 번호와 수정할 뜻이 주어지면 뜻을 수정하고 수정 여부를 알려주는 메서드
	 * 매개변수 : 수정할 뜻의 번호, 수정할 뜻 => int meaningNum, String meaning2
	 * 리턴타입 : 수정 여부 => boolean
	 * 메서드명 : updateMeaning
	 * @param meaningNum
	 * @param meaing2
	 * @return
	 * */
	public boolean updateMeaning(int meaningNum, String meaning) {
		//수정할 뜻의 번호가 잘못된 경우
		if(meaningNum > meaningCount || meaningNum <= 0) {
			return false;
		}
		//meaningNum은 1부터이고 번지는 0부터이기 때문에 뺴기 1을 한다.
		this.meaning[meaningNum-1] = meaning;
		return true;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
		
}