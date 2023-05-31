package day2.scanner;

import java.util.Scanner; //java package 안의 util안에 있는 모든(*) 것을 가지고 오겠다라는 의미로 적은것 
						 // 아니면 'ctrl + shift + O' 입력하면 import java.util.Scanner; 이것의 나옴

public class ScannerEx {

	public static void main(String[] args) {
		//System.in : 표준입력
		//표준 입력을 이용해서 스캐너를 생성
		Scanner sc = new Scanner(System.in); // 이렇게 사용됨을 외우기
		
		System.out.println("정수를 입력해주세요.");
		int num1 = sc.nextInt(); // 정수를 입력받음
		System.out.println(num1);
				
		System.out.println("실수를 입력해주세요.");
		double num2 = sc.nextDouble(); // 실수일 때 float 사용해도되나 여기에서 우리가 double로 사용한 것 둘다 사용가능
		System.out.println(num2);
		
		System.out.println("문자열1을 입력하세요.");
		sc.nextLine();//입력되는 값이랑 엔터 하나가 같이 입력되고 나머지 값은 뒤로 넘어감 그것 때문에 영향 받기 싫으면 이와 같은 내용 쓰기 
		String str1 = sc.nextLine(); // 스페이스를 포함한 문자열 한줄을 읽어옴(마지막 입력한 엔터포함)
		System.out.println(str1);
	
		System.out.println("문자열2를 입력하세요.");
		String str2 = sc.next();//첫번째 문자부터 읽어와서 다음 공백(엔터,스페이스)가 오기전까지 읽어옴
		System.out.println(str2);
		
		sc.nextLine();//이것을 써야 앞에서 입력받지 않은 것들이 뒤에 영향을 미치지 않아 제대로 된 값을 출력할 수 있다.
		System.out.println("문자를 입력하세요.");
		char ch = sc.next().charAt(0);
		//next()를 이용하여 한 단어를 읽어오고 
		//charAt(0)를 이용하여 단어의 첫글자를 가져옴
		System.out.println(ch);
		
		sc.close();//close()로 닫지 않아도 크게 문제는 없지만 안쓰면 주의 표시가 생김

	}

}
