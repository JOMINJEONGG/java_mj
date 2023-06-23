package day18.string;

public class StringEx1 {

	public static void main(String[] args) {
		/* 문자열 관련 메서드 */
		
		//1) char charAt(int index) : index 번지에 있는 문자를 반환
		//2) boolean equals(Object object) : 두 문자열이 같은지를 반환		
		
		//3) indexOf : 기준 문자열에서 검색 문자/문자열을 왼쪽부터 검색해서 '처음'으로 만나는 위치를 반환
		//lastIndexOf : 오른쪽!!!!!!!부터 검색
		//int indexOf(String str) : 문자열에서 str이 있으면 시작위치를 반환, 없으면 -1을 반환
		String str = "Hello word";

		//str에서 7번지부터 wo가 있는지 확인. orld에서 wo가있는지 확인 => 없음 => -1
		int index = str.indexOf("wo", 7);
		System.out.println("3번문제 " + str + "에서 7번지 부터 " + "wo" + "가 있나요? " + index);
		
		index = str.indexOf("wo");
		System.out.println(str + "에서 0번지 부터 " + "wo" + "가 있나요? " + index);

		index = str.indexOf("o");//o가 2개인데 처음나오는 4번지만 나옴=> 전부를 찾는게 아니라 처음 나오는 애를 찾음
		System.out.println(str + "에서 0번지 부터 " + "o" + "가 있나요? " + index);
		
		//3-1)lastIndexOf
		index = str.lastIndexOf("o");
		System.out.println("3-1번문제 " + str + "에서 0번지 부터 " + "o" + "가 오른쪽부터 있나요? " + index);
				
		//4) contains : return 값은 기준 문자열에서 검색 문자/문자열이 있는지 없는지 알려줌
		//boolean contains(CharSequence cs) : 문자열에서 cs가 있는지 없는지를 반환
		boolean result = str.contains("o");
		System.out.println("4번문제 " + str + "에서 0번지 부터 " + "o" + "가 있나요? " + result);
		
		//5) length() : 길이를 반환
		System.out.println("5번문제 " + str + "의 길이는? " + str.length());
		
		//6) replace : 특정 문자/문자열을 바꿀 때 사용. 모두
		//replaceAll : 정규 표현식에 맞는 모든 문자/문자열을 수정
		//String replace(CharSequence target, CharSequence replacement) 
		//: target을 replacement로 교체한 새로운 문자열 반환
		String str2 = str.replace(" ", ",");
		System.out.println("6번문제 " + str2);
		
		//7) substring : 부분 문자열 추출
		//String substring(int index) : index번지부터 끝까지 잘라낸 문자열을 반환 : 부분 문자열 
		//String substring(int index, int endIndex) : index번지부터 endIndex번지 전까지
		//(endIndex-1번지) 잘라낸 문자열을 반환 : 부분 문자열
		String str3 = str.substring(6);
		System.out.println("7번문제 " + str + "에서 6번지부터 가져온 부분 문자열 : " + str3);
		
		//8) String toLowerCase() : 문자열을 소문자로 변환한 문자열 반환
		System.out.println("8번문제 " + str + " : 소문자 : " + str.toLowerCase());
		
		//9) String toUpperCase() : 문자열을 대문자로 변환한 문자열 반환
		System.out.println("9번문제 " + str + " : eo문자 : " + str.toUpperCase());
		
		//10) String trim() : 첫문자 앞 공백과 마지막 문자 뒤 공백을 제거한 문자열을 반환
		//trim 시작문자(a) 전 공백, 마지막 문자(f) 후 공백을 제거, 사이에 있는 공백은 제거 못함
		String str4 = "\n\t\tabc\t\tdef\t\n";
		System.out.println("10번문제 " + str4);
		System.out.println("10번문제 " + str4.trim()); //위에랑 비교시 이건 공백 제거됨
			
 		//11) String valueOf(int i) : 정수 i를 문자열로 반환. “” + i ==> 예시 생략
				
		//12) String[] split(String regex) : regex에 맞는 문자열들을 기준으로 문자열들을 추출하여 배열로 반환. 토큰이라는 구분자를 이용하여 문자열들을 추출하여 배열로 반환
		//split : 구분 자료 기준으로 문자열을 추출해서 순서대로 배열에 저장
		String str5 = "사과,배,포도";
		String fruits[] = str5.split(",");
		for(String fruit : fruits) {
			System.out.println("12번문제 " + fruit);
		}
	}

}
