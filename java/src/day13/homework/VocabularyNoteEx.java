package day13.homework;

import java.util.Scanner;

import day12.practice.VocabularyNote;
import day12.practice.Word;
import lombok.Data;
@Data
public class VocabularyNoteEx {

	public static void main(String[] args) {
		/*영어 단어장 프로그램을 구현하세요
		 * Word, Vocabulary 클래스 이용 
		 * 메뉴
		 * 1. 단어 추가
		 * 2. 단어 삭제
		 * 3. 단어 수정
		 * 	a. 단어 수정
		 * 	b. 뜻 수정
		 * 	c. 뜻 삭제
		 * 4. 단어출력
		 *  a. 전체 출력
		 *  b. 검색
		 * 5. 프로그램 종료
		 * */
		int num = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 삭제");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("input number : ");
		num = sc.nextInt();
		
		VocabularyNote vocabularyNote = new VocabularyNote();
		if(num == 1) {
			vocabularyNote.print();
			vocabularyNote.insert("a","a");
			vocabularyNote.print();
		}else if(num == 2) {
			vocabularyNote.delete("a");
			vocabularyNote.print();
		}else if(num == 3) {
			System.out.println("1. 단어 수정");
			System.out.println("2. 뜻 수정");
			System.out.println("3. 뜻 삭제");
		}else if(num == 4) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 검색");
		}else {	
			System.out.println("프로그램 종료");
		}
		
		i = sc.nextInt();
		if(num == 3 && i == 1) {
			System.out.println("수정할 단어 :");
			System.out.println("수정될 단어 :");
			vocabularyNote.updateTitle("b","B");
		}else if(num == 3 && i == 2) {
			System.out.println("수정할 뜻 :");
			System.out.println("수정될 뜻 :");
			vocabularyNote.updateMeaning("b", 2, "B");
		}else{
			System.out.println("뜻이 삭제되었습니다.");
		}
		
		sc.close();
	}
	
}
