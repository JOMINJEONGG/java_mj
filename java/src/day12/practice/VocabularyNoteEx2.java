package day12.practice;

public class VocabularyNoteEx2 {

	public static void main(String[] args) {
		//영어 단어장 클래스를 만들고 테스트하는 코드를 작성하세요. Word 클래스 이용
		Word wordList[] = {
				new Word("abc"),
				new Word("def", "def os define")
		};
		VocabularyNote note = new VocabularyNote(wordList);
		//note.print();
		
		//1)밖에서 단어와 뜻을 받아서 넘겨주는것
		Word word = new Word("a", "a");
		note.insert(word);;
		//note.print();
		
		//2)단어와 뜻을 직접 넘겨주는 것
		note.insert("b","b is b");;
		//note.print();
		
		//note.delete("c");//No words found 출력
		note.delete("a");
		//note.print();
		
		//note.search("a");
		//note.search("b");

		note.insert("b", "b");
		//note.print();
		
		note.updateMeaning("b", 2, "B");
		note.updateMeaning("b", 3, "B");//Wrong number
		//note.print();
		
		note.updateTitle("b", "B");
		//No words found 출력. 이미 앞에서 수정해서 b가 없음
		note.updateTitle("b", "B");
		note.print();
	}
}
