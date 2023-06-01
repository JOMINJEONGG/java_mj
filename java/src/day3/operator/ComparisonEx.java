package day3.operator;

public class ComparisonEx {

	public static void main(String[] args) {
		System.out.println(" 1 > 2 : " + (1 > 2)); // +가 비교 연산자(>)보다 우선이기 때문에 괄호 쳐줘야함
		System.out.println(" 1 > 2 : " + (1 < 2));
		System.out.println(" 1 >= 2 : " + (1 >= 2));
		System.out.println(" 1 <= 2 : " + (1 <= 2));
		System.out.println(" 1 == 2 : " + (1 == 2));
		System.out.println(" 1 != 2 : " + (1 != 2));

		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		/* str1과 str2는 리터럴 문자열 abc를 저장하고 있기 때문에 ==로 비교가능하지만
		 * str3은 리터럴 문자열이 아니기 때문에 ==로 비교할 수 없다
		 * 그런데, 일반적으로 문자열 변수가 있는 경우 이 변수에 리터럴이 들어있는지 아닌지는 알 수 없다
		 * 그래서 문자열을 ==나 !=로 비교하지 않는 것이 좋다
		 * 에러는 발생하지 않지만 두 문자열이 같은지 다를지를 제대로 비교하지 않음
		 * 우리가 원하는 정상적인 동작을 하지 않음
		 * */
		//예를 들어 대한민국에 서울에 사는 조민정이냐 다른 주소 조민정이냐 확인할때 str1과 str2는 서울에 사는 조민정 말해주는데 str3는 다른 주소 조민정을 알려줌
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		/*문자열을 포함한 참조 변수들은 주로 equals를 이용하여 같은지 다른지를 판별
		 * */
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		//참조 변수가 ==나 !=를 쓰는 대표적인 경우는 null과 비교해서 비었는지 안비었는지 확인할 때만 사용
		//대한민국에 조민정이라는 이름을 가진 조민정이 있느냐 비교할때
		System.out.println(str1 == null); // 뭐가 있는지 없는지 정도는 true false 비교 할 수 있으니까 null은 사용해도 문제없음
	}

}
